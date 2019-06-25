package override_with_super;

public class ClassOverridingEx {
public static void main(String[] args) {
    Laptop myLaptop = new Laptop();

    myLaptop.setComputerStatus("20%", "connected");
    myLaptop.setWiFiStatus("bad");

    myLaptop.printStatus(); //обратите внимание, если мы убераем super.printStatus(); из класса Laptop перед записью System.out.println("WiFi: " + wifiQuality);
    // то на выводе беудет только перевисанный Override метод printStatus(); и останеться только WIFI:bad

    return;
 }
}