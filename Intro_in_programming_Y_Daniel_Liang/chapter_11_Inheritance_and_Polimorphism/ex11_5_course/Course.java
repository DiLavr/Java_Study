package ex11_5_course;

import java.util.ArrayList;

public class Course {

		private String courseName;
		//private String[] students = new String[100];  <------------ old version
				private ArrayList<String> students = new ArrayList<>();
		
		//private int numberOfStudents; <------------ old version
		
		public Course(String courseName) {
		this.courseName = courseName;
		}
		
		public void addStudent(String student) { // add a course
		//students[numberOfStudents] = student; <------------ old version
		//numberOfStudents++; <------------ old version
			students.add(student);
		}
		
		
		public void dropStudent(String student) {
		//students[numberOfStudents] = student; <------------ old version
		//numberOfStudents--; <------------ old version
		students.remove(student);	
		}
		
		
		public String[] getStudents() { // return students
		return students.toArray(new String[students.size()]);
		}
		
		public int getNumberOfStudents() {   // number of students
		//return numberOfStudents; <------------ old version
			return students.size();	
		}
		
		public String getCourseName() {
		return courseName;
		}
		public void clear(){
	        students.clear();
			}
		
}
