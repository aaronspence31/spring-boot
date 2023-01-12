package com.aaron.demo;

public class Course {
    private long id;
    private String name;
    private String author;

    //Constructor
    //Getters
    //toString


    public Course() {
        this(1, "Learn Spring", "Aaron");
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
