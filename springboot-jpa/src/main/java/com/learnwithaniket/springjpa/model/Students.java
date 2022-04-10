package com.learnwithaniket.springjpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "student_name")
    private String studentName;

    @ManyToMany(mappedBy = "students")
    private Set<AwsCertificates> awsCertificates;

    public Students() {

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Set<AwsCertificates> getAwsCertificates() {
        return awsCertificates;
    }

    public void setAwsCertificates(Set<AwsCertificates> awsCertificates) {
        this.awsCertificates = awsCertificates;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", awsCertificates=" + awsCertificates +
                '}';
    }
}
