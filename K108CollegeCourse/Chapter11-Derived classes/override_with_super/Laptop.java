package override_with_super;

public class Laptop extends Computer {
	   public void setWiFiStatus(String wifiStatus) {
	      wifiQuality = wifiStatus;
	      return;
	   }

	   @Override
	   public void printStatus() {
	      super.printStatus();
	      System.out.println("WiFi: " + wifiQuality);
	      return;
	   }

	   private String wifiQuality;
	}