package chapter_09_Objects_and_Classes;

public class Car {
    private String model; //Вы наверняка заметили, что поля: color и model - приватные (private), 
    private String color; //а значит произвести с ними какое-то действие вне этого Класса - невозможно!
    public Car (){
        this("Model Default");
    }
    public Car (String model){
        this("Color Default", model);
    }
    public Car (String color, String model){
        this.color = color;
        this.model = model;
        this.info();
        
        
    }
    public void run(){
        System.out.println("Car - Run...");
    }
    public void stop(){
        System.out.println("Car - Stop...");
    }
    public void info(){   // аналог stringout , отдает всю информацию о Машине
        System.out.println("Car Model: " + model + ", Car Color: " + color);
    }
    /*
     * Но нужно же в любой момент иметь возможность узнать какого цвета или модели Машина и не вызывать при этом метод info() 
     * - который отдает всю информацию о Машине. В таком случае пользуемся Геттерами!
     */
    public String getColor() { //возвращает цвет Машины
    return color;	
    }
    public String getModel() { //возвращает модель Машины.
    return model;	
    }
    // Но что, если Вы хотите перекрасить Машину? Тогда на помощь приходят Сеттеры - Setters:
    public void setColor(String color) { //задает (переопределяет) на новый цвет - в Машины.
    	this.color = color;
    }
    public void setModel(String model) { //выводит на консоль сообщение, что нельзя в Машине поменять модель.
        System.out.println("Вы не можете поменять модель Машины.");
    }
    
    

    
    
    
    
    
    
}
