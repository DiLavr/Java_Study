package chapter_10_OOP_Thinking;


public class TestTime {

	public static void main(String arg[]) {
		
	
        Time time = new Time();
        System.out.printf("%d:%d:%d%n%n",
            time.getHours(),
            time.getMinute(),
            time.getSecond()); 
        
            Time time1 = new Time(555550000);
            System.out.printf("%d:%d:%d%n%n",
            time1.getHours(),
            time1.getMinute(),
            time1.getSecond()); 
           
       }
}
