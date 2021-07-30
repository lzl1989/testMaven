package com.testproject.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentEntity {

    private  String studentName;
    private String studentAge;
    private Double studentScore;

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public Double getStudentScore() {
        return studentScore;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentScore(Double studentScore) {
        this.studentScore = studentScore;
    }
}
