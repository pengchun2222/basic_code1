package com.pengchun.spring.CircularDependency;
import com.google.common.base.Supplier;
import com.rabbitmq.client.UnblockedCallback;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;

/**
 * @Author 彭淳
 * @Date 2021/4/15
 */
public class StudentA {
	private String name;
	
	@Autowired
	private StudentB studentB;

	public StudentA() {
	}

	public StudentA(String name, StudentB studentB) {
		this.name = name;
		this.studentB = studentB;
	}
	
	public String run() {
        System.out.println("aaa");
        return null;
	}
	
	public void run1(String a) {
        System.out.println(a);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentB getStudentB() {
		return studentB;
	}

	public void setStudentB(StudentB studentB) {
		this.studentB = studentB;
	}

    @FunctionalInterface
    interface FunAction {
        String runrun(String a);
    }

    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        int i = 100;

         int a = i >> 1;

        System.out.println(a);
    }
}

