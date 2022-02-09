package com.doctor.api.doctorclientgrpc;

import api.Grpc.cshar.*;
import com.doctor.api.gepcmodel.CsharCourse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class CsharGRPC {



    public CsharCourse getCourseDetail(Integer id){

    ManagedChannel channelBuilder = NettyChannelBuilder.forTarget("dns:///localhost:667").usePlaintext().build();

        GrpcCoursesGrpc.GrpcCoursesBlockingStub coursesBlockingStub = GrpcCoursesGrpc.newBlockingStub(channelBuilder);
        GetByIdsResponse courseUserResponse = coursesBlockingStub.getByIds(GetByIdsRequest.newBuilder().addIds(id).build());
channelBuilder.shutdown();
        CsharCourse course = new CsharCourse();
        course.setId(courseUserResponse.getCourses(0).getId());
        course.setName(courseUserResponse.getCourses(0).getName());
        course.setDescription(courseUserResponse.getCourses(0).getDescription());
        course.setRate(courseUserResponse.getCourses(0).getRate());
        course.setDuration(courseUserResponse.getCourses(0).getDuration());

        return course;
    }
}
