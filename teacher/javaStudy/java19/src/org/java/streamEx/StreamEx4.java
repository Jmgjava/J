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
		students.add(new Student2(1, "김이름"));
		students.add(new Student2(2, "박이름"));
		students.add(new Student2(3, "이이름"));
		students.add(new Student2(4, "손이름"));
		students.add(new Student2(5, "강이름"));		

		Stream<Student2> stream = students.stream();

//		stream.forEach(stu->
//			System.out.print("학년: " + stu.getGrade())
//		);
		
		stream.forEach(Student2::toStudent3Method);
				

		System.out.println();

	}
}
