package chapter_10_OOP_Thinking;
public class TestBMI {
  public static void main(String[] args) {
    BMI bmi1 = new BMI("John Doe", 18, 145, 70);
    System.out.println("The BMI for " + bmi1.getName() + " is "
      + bmi1.getBMI() + " " + bmi1.getStatus());
    
    BMI bmi2 = new BMI("Peter King", 210, 70); // �� ��������� �� ������ ��� ��� 20 ���
    System.out.println("The BMI for " + bmi2.getName() + " is "
      + bmi2.getBMI() + " " + bmi2.getStatus());
    
    BMI bmi3 = new BMI("ME ", 33, 184, 72);
    System.out.println("The BMI for " + bmi3.getName() + " is "
    	      + bmi3.getBMI() + " " + bmi3.getStatus());
    

    
  }
}