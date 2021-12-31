package org.test;

public class college {
private void collegename() {
System.out.println("collegeNmae is skp Engineering College");

}
private void collegecode() {
	System.out.println("collegeCode is 5122");
	
}

private void collegerank() {
System.out.println("collegerank is first");

}
public static void main(String[] args) {
	college c= new college();
	c.collegename();
	c.collegecode();
	c.collegerank();
	student s= new student();
	s.studentname();
	s.studentdept();
	s.studentId();
	hostel h= new hostel();
	h.hostelname();
	department d= new department();
	d.departname();
}
	

}

