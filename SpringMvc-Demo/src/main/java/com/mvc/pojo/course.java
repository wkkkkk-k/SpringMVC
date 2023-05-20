package com.mvc.pojo;

public class course {


    private int id;
    private String name;
    private int hours;
    private int school;

    private Integer isDelete=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", school=" + school +
                '}';
    }

}