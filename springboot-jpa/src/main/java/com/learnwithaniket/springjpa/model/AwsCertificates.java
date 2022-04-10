package com.learnwithaniket.springjpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "aws_certificates")
public class AwsCertificates {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer awsCertId;

    @Column(name = "cert_name")
    private String certName;

    @ManyToMany
    private Set<Students> students;

    public AwsCertificates() {

    }

    public Integer getAwsCertId() {
        return awsCertId;
    }

    public void setAwsCertId(Integer awsCertId) {
        this.awsCertId = awsCertId;
    }

    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public Set<Students> getStudents() {
        return students;
    }

    public void setStudents(Set<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "AwsCertificates{" +
                "awsCertId=" + awsCertId +
                ", certName='" + certName + '\'' +
                ", students=" + students +
                '}';
    }
}
