package override_with_super;

public class ClassOverridingEx {
public static void main(String[] args) {
    Laptop myLaptop = new Laptop();

    myLaptop.setComputerStatus("20%", "connected");
    myLaptop.setWiFiStatus("bad");

    myLaptop.printStatus(); //�������� ��������, ���� �� ������� super.printStatus(); �� ������ Laptop ����� ������� System.out.println("WiFi: " + wifiQuality);
    // �� �� ������ ������ ������ ������������ Override ����� printStatus(); � ���������� ������ WIFI:bad

    return;
 }
}