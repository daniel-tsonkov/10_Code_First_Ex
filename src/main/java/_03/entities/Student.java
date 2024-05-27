package _03.entities;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "students")
public class Student extends Person {

    @Column(name = "average_grade", nullable = false)
    private float averageGrade;

    private int attendance;

    @ManyToMany
    private Set<Course> courses;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String phoneNumber, float averageGrade, int attendance) {
        super(firstName, lastName, phoneNumber);
        this.averageGrade = averageGrade;
        this.attendance = attendance;
    }

    public float getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getAttendance() {
        return this.attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}
