package com.example.mybatissimple2.model;

public class Student {
    /*field*/
    private int id;
    private String name;
    private int age;
    private int phone;
    private String gmail;
    /*constructor*/

    public Student() {
    }

    public Student(int id, String name, int age, int phone, String gmail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gmail = gmail;
    }
    /*getter,setter*/

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    /*method*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
