package com.example.codigofacilito.cf_adapter;

import java.util.ArrayList;

/**
 * Created by codigofacilito on 13/09/17.
 */

public class Student {
    private int id;
    private String name;
    private boolean isPass;

    public Student(int id, String name, boolean isPass){
        this.id=id;
        this.name=name;
        this.isPass=isPass;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPass() {
        return isPass;
    }







    public static ArrayList<Student> getStudents(){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"Marines",true));
        students.add(new Student(2,"Raquel",true));
        students.add(new Student(3,"Pedro",false));
        students.add(new Student(4,"Jose",true));
        return students;
    }
}
