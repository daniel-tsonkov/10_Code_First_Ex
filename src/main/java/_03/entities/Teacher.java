package _03.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "_03_teachers")
public class Teacher extends Person {
    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "salary_per_hour", nullable = false)
    private float salaryPehHour;

    @OneToMany
    private Set<Course> courses;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName, String phoneNumber, String email, float salaryPehHour) {
        super(firstName, lastName, phoneNumber);
        this.email = email;
        this.salaryPehHour = salaryPehHour;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalaryPehHour() {
        return this.salaryPehHour;
    }

    public void setSalaryPehHour(float salaryPehHour) {
        this.salaryPehHour = salaryPehHour;
    }
}
