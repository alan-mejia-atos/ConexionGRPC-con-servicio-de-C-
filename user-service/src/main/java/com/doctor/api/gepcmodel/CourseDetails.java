package com.doctor.api.gepcmodel;

import com.doctor.api.gepcmodel.modelsdecshar.Section;
import com.doctor.api.gepcmodel.modelsdecshar.Tag;

public class CourseDetails {
    Integer Id;
    String Name;
    String  Description;
    Double Duration;
    Double Rate;
//    Tag Tags;
//    Section Sections;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getDuration() {
        return Duration;
    }

    public void setDuration(Double duration) {
        Duration = duration;
    }

    public Double getRate() {
        return Rate;
    }

    public void setRate(Double rate) {
        Rate = rate;
    }

//    public Tag getTags() {
//        return Tags;
//    }
//
//    public void setTags(Tag tags) {
//        Tags = tags;
//    }
//
//    public Section getSections() {
//        return Sections;
//    }
//
//    public void setSections(Section sections) {
//        Sections = sections;
//    }
}
