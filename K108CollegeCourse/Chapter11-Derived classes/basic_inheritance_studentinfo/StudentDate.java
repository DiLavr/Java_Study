package basic_inheritance_studentinfo;

public class StudentDate extends PersonData {
	   private int idNum;

	   public void setID(int studentId) {
	      idNum = studentId;
	      return;
	   }

	   public int getID() {
	      return idNum;
	   }
	}