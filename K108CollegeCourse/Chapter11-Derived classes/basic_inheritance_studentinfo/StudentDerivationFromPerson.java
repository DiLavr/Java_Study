package basic_inheritance_studentinfo;

public class StudentDerivationFromPerson {
	   public static void main (String [] args) {
	      StudentDate courseStudent = new StudentDate();

	      courseStudent.setName("Smith");
	      courseStudent.setAge(20);
	      courseStudent.setID(9999);
	      
	     
	      courseStudent.printAll();
	      
	      System.out.println(", ID " + courseStudent.getID());
	    
	      /* Your solution goes here  */
	     

	      return;
	   }
	}