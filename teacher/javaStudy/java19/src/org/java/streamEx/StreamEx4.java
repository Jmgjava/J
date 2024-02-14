package org.java.streamEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Student2 {
	private int grade;
	private String name;

	public Student2() {
		super();
	}

	public Student2(int grade, String name) {
		super();
		this.grade = grade;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Student2 toStudent3Method(Student2 student2) {
		
		Student2 stu=new Student2();		
		stu.setGrade(student2.getGrade());
		stu.setName(student2.getName());			
		return stu;
		
	}

}

public class StreamEx4 {

	public static void main(String[] args) {

		List<Student2> students = new ArrayList<Student2>();
		students.add(new Student2(1, "���̸�"));
		students.add(new Student2(2, "���̸�"));
		students.add(new Student2(3, "���̸�"));
		students.add(new Student2(4, "���̸�"));
		students.add(new Student2(5, "���̸�"));		

		Stream<Student2> stream = students.stream();

//		stream.forEach(stu->
//			System.out.print("�г�: " + stu.getGrade())
//		);
		
		stream.forEach(Student2::toStudent3Method);
				

		System.out.println();

	}
}
