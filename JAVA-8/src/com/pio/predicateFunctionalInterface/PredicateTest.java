package com.pio.predicateFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("starts");
		 List<Student> students = new ArrayList<>();
		 students.add(new Student("prabhat", "A", 92));
		 students.add(new Student("Govind", "B", 60));
		 students.add(new Student("gaurav", "C", 48));
		 students.add(new Student("Singh", "A", 98));
		 students.add(new Student("Ashish", "B", 55));
		 students.add(new Student("Pankaj", "c", 45));
	
		  
		 Predicate<Student> gradePredicate = stu -> stu.grade.equals("B");
		 System.out.println("Students grade based: ");
		 System.out.println(findStudentBypredicates(students, gradePredicate));
		 
		 System.out.println("==================================");
		 
		Predicate<Student> scorePredicate = stu -> stu.getScore()>90; 
		System.out.println("Students Score based: ");
		System.out.println(findStudentBypredicates(students, scorePredicate));
		
}	
 

	public static List<Student> findStudentBypredicates(List<Student> students,Predicate<Student> predicate){
		
		List<Student> results = new ArrayList<>();
		for (Student student : students) {
			if(predicate.test(student))
				results.add(student);
			
		}
		 return results;
    }
}