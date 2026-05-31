package jsonData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private int age;
    private List<Course> courses;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id = "ID:" + LocalDate.now();
        this.courses = new ArrayList<>();
    }
}
