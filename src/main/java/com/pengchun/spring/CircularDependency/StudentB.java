package com.pengchun.spring.CircularDependency;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 彭淳
 * @Date 2021/4/18
 */
public class StudentB {
    private String name;
    @Autowired
    private StudentA studentA;

    public StudentB() {
    }

    public StudentB(String name, StudentA studentA) {
        this.name = name;
        this.studentA = studentA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentA getStudentA() {
        return studentA;
    }

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }
}
