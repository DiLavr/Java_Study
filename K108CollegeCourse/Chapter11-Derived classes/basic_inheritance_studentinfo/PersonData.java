package basic_inheritance_studentinfo;

public class PersonData {
	   private int ageYears;
	   private String lastName;

	   public void setName(String userName) {
	      lastName  = userName;
	      return;
	   }

	   public void setAge(int numYears) {
	      ageYears = numYears;
	      return;
	   }

	   // Other parts omitted

	   public void printAll() {
	      System.out.print("Name: " + lastName);
	      System.out.print(", Age: "  + ageYears);
	      return;
	   }
	}