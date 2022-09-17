package org.student;

import org.department.Department;

public class Student extends Department{
	// --------Assignment 2------------
	// Class Student with studentName(),studentDept(),studentId()
	public String sName="Deepthi";
	public String sDept="CSE";
	public int sId = 100200;
	
	public void studentName()
	{
		System.out.println("Student name is " +sName);
	}
	
	public void studentDept()
	{
		System.out.println("Student department is " + sDept);
	}
	
	public void studetId()
	{
		System.out.println("Student Id is "  + sId);
	}

	public static void main(String[] args) {
	//call all your class methods into the Student using multilevel inheritance.
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studetId();
		s.studentDept();
				
		

	}

}
