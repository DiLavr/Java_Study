/**
 * 
 * При вызове разных Конструкторов они 
 * будут заполняться значениями по умолчанию или теми,
 *  которые Вы укажите!
 * 
 */


package chapter_09_Objects_and_Classes;

public class TestCar {

    public static void main(String[] args) {
    
    	System.out.println("Car - Constructor:");         Car car  = new Car();
        System.out.println("Car1 - Constructor:");        Car car1 = new Car("Ford");
        System.out.println("Car2 - Constructor:");        Car car2 = new Car("RED", "Ford");
 
        System.out.println("\nTest - Car");
        System.out.println("Car - Model: " + car.getModel());
        System.out.println("Car - Color: " + car.getColor());
        car.setColor("Yellow");
        car.setModel("Lada");
        car.info();
 
        System.out.println("\nTest - Car1");
        System.out.println("Car1 - Model: " + car1.getModel());
        System.out.println("Car1 - Color: " + car1.getColor());
        car1.info();
        car1.setColor("Yellow");
        car1.setModel("Lada");
        car1.info();
 
        System.out.println("\nTest - Car2");
        System.out.println("Car2 - Model: " + car2.getModel());
        System.out.println("Car2 - Color: " + car2.getColor());
        car2.setColor("Yellow");
        car2.setModel("Lada");
        car2.info();
    	
    	
    }
	
	
}
