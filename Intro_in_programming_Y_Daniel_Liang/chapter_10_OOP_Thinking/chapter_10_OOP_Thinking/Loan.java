package chapter_10_OOP_Thinking;
public class Loan {
  private double annualInterestRate; // ������� ��������� � ���������	
  private int numberOfYears; // �� ������� ��� ������
  private double loanAmount; // ����� ������ �� ����� �����?
  private java.util.Date loanDate; // ����� ����� �� ����� ������

  /** Default constructor */
  public Loan() {      //�� ������� ���������� ������� (?) �� ��������� 
    this(2.5, 1, 1000);
  }
  /*
   * this (�������� ����������� "����") - ��� ��������� �� ������ �� �������� �� ��� ������. ������ self �� Delphi ( � ��.) 
������ ������������ ��� ���� ��� �� �������� ���� ������� �� ���������� ������. ����� ������ ������������ ��� �������� ���� � �������� ��������� ������ ���� ������.
1

������:
class MyClass
{
    int n;
     public MyClass(int n)
    {          this.n = n;  
          // ����� �� ���� ��������� ��� ���������� n ������� ��������� � �������
          // �� ����������� ��������� �������� ��������� n (�.�. this.n � n ��� ��� ������ ����������)
     }}
   * 
   */

  /** Construct a loan with specified annual interest rate,
      number of years, and loan amount
    */
  public Loan(double annualInterestRate, int numberOfYears,
      double loanAmount) {
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }
  
  /*
   * ������ ����� �����������, ����� ����� �������� �� ��������� ��� ������. 
   * ����� ��� ���� ��������, � Java ���������� �������� ����� this. 
   * ��� ����� �������������� ������ ������ ������ ��� ������ �� ������� ������. 
   * �� ���� this ������ ������ ������� �� ������, ��� �������� ��� ������ �����. 
   * �������� ����� this ����� ������������ �����, 
   * ��� ����������� ������ �� ������ ���� �������� ������.

��� ��������� ���������� ��������� ������ ������������ Box ():

// ���������� ���������� ��������� ����� this.
Box(double w, double h, double d) {
this.width = w; 
this.height = h;
this.depth = d;
}
   * 
   */
  
  

  /** Return annualInterestRate */
  public double getAnnualInterestRate() { //������� ������  � �������� ����������
    return annualInterestRate; // ������� ���������� �������� ������� ���������
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return loanAmount;
  }

  /** Return loan date */
  public java.util.Date getLoanDate() { // ����� �� ���������� ������� ������� ���������� �����
    return loanDate;
  }

  /** Find monthly payment */
  public double getMonthlyPayment() { // ������� ������ ��� ��������� ��������� �������
	  // ���������� ������� ��� ������������ �������� ��������� �� �������
    double monthlyInterestRate = annualInterestRate / 1200;                
    double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
      (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;    
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return numberOfYears;
  }

  /** Find total payment */
  public double getTotalPayment() {
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;    
  }

  /** Return overpaying amount **/
  public double overpaying() {
  double overpaying = getTotalPayment() - loanAmount;
  return overpaying; }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double loanAmount) {
    this.loanAmount = loanAmount;
  }
  /** Set a new numberOfYears */
  public void setNumberOfYears(int numberOfYears) {
    this.numberOfYears = numberOfYears;
  }
}
