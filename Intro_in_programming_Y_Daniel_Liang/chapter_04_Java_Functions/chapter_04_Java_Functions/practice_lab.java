package chapter_04_Java_Functions;
public class practice_lab {
    public static void main(String[] args){

     String str = "12345678";
     String strArr[] = str.split("");
     int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
             System.out.println(numArr[i]);
        }
    
        String[] auto = {"�����", "�����", "������"}; //����� ������ �����
        String result = "� ������ ����� ������: "; //������ ������

        //���������� � ������ �������� �������
        for(int i = 0; i < auto.length; i++){
           //���� ������� �� ���������, ��������� �������
           if(i != auto.length-1 )
              result += auto[i] + ", ";
           //���� ���������, ������ ����� ���� �����
           else
              result += auto[i] + ".";
        }
        //������� ���������
        System.out.println(result);
    
        
        //����������� ���������� ������� � ������
        String str1 = "��������� ������ � ���� ������";
        int last = str1.length()-1;//����� ������ - 1, ��� ��� ������ ���������� � 0
        char ch = str1.charAt(last);
        System.out.println("��������� ������ � ���� ������: " + ch);
        
        
        // ��������� �� �������
        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-"); // ��������� �� ����� -
        System.out.println("����: " + isbn);
        System.out.println("������� EAN.UCC: " + isbnParts[0]);
        System.out.println("����� ��������������� ������: " + isbnParts[1]);
        System.out.println("����� �����������: " + isbnParts[2]);
        System.out.println("����� �������: " + isbnParts[3]);
        System.out.println("����������� �����: " + isbnParts[4]);
    
    
    }
}