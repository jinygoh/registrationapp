package model;

import java.util.*;

public class Student extends Person implements Evaluation{


    private double average;         // Student class can also have its own attributes
    private final List<Course> courses = new ArrayList<>();     // Student Class has a list of courses that he/she attends
    private final Map<String, Course> approvedCourses= new HashMap<>();       //Student Class has a list of approved courses that he/she attends


    public Student(String id, String name, String email, Date DOB) {
        super(id, name, email, DOB);
        average=0.0;
    }

    public Student(String id, String name, String email, Date DOB, double average) {
        super(id, name, email, DOB);
        this.average = average;
    }
    // we override toString() method, otherwise parent class method is used
    @Override
    public String toString() {
        return String.format(
                "{id: %d, name: %s, email: %s, DOB: %s, average GPA: %.2f}",
                super.getId(),
                super.getName(),
                super.getEmail(),
                super.getDOB(),
                this.average
                );
    }

    // q: if i dont override the toString method in Student class, which toString() method would Student class be using?
    //Ans: then i will inherit and use the toString() method from the parent class(Person)

    //Q: what is the keyword super used for in Student Class?
    //Ans: super is used to reference the parent's classes attribute and methods - where inheritance is implied


    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void enrollToCourse(Course course){
        //TODO

    }

    public void registerApprovedCourses(){
        //TODO
    }

    public boolean isCourseApproved(Course course){
        //TODO
        return false;
    }

    @Override
    public List<Course> getApprovedCourses() {
        //TODO
        return null;
    }
}
