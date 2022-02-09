package com.doctor.api.gepcmodel.modelsdecshar;

public class Tag {

    Integer Id;
    String Name;
    String Description;
    Integer Popularity;

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

    public Integer getPopularity() {
        return Popularity;
    }

    public void setPopularity(Integer popularity) {
        Popularity = popularity;
    }
}
