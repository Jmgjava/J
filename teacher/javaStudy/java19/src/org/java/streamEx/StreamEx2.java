package org.java.streamEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private int grade;
	private String name;

	public Student() {
		super();
	}

	public Student(int grade, String name) {
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

}

public class StreamEx2 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "김이름"));
		students.add(new Student(2, "박이름"));
		students.add(new Student(3, "이이름"));
		students.add(new Student(4, "손이름"));
		students.add(new Student(5, "강이름"));
		// for each
		for (Student stu : students) {
			System.out.print("학년: " + stu.getGrade());
			System.out.println(" 이름: " + stu.getName());
		}
		System.out.println();

		// Iterator 출력
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student stu = iterator.next();
			System.out.print("학년: " + stu.getGrade());
			System.out.println(" 이름: " + stu.getName());
		}
		System.out.println();
		// Stream 출력

		Stream<Student> stream = students.stream();

//		stream.forEach(stu->
//			System.out.print("학년: " + stu.getGrade())
//		);

		stream.forEach(stu -> {
			System.out.print("학년: " + stu.getGrade());
			System.out.println(" 이름: " + stu.getName());
		});

		System.out.println();

	}
}
