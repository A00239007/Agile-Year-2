/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

/**
 *
 * @author dev
 */
public class Student {
    private String title, name, college, school;
    private int age;
    
    public Student(){}

    public Student(String title, String name, String college, String school, int age) {
        this.title = title;
        this.name = name;
        this.college = college;
        this.school = school;
        this.age = age;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Title: ").append(this.title);
        sb.append(" - Name: ").append(this.name);
        sb.append(" - College: ").append(this.college);
        sb.append(" - Course: ").append(this.school);
        sb.append(" - Marks: ").append(this.age);

        return sb.toString();
    }
}
    
