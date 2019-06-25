package override_with_super;

public class Computer {
	   public void setComputerStatus(String cpuStatus, String internetStatus) {
	      cpuUsage = cpuStatus;
	      internet = internetStatus;
	      return;
	   }

	   public void printStatus() {
	      System.out.println("Internet: " + internet);
	      System.out.println("CPU: " + cpuUsage);
	      return;
	   }
	   
	   protected String cpuUsage;
	   protected String internet;
	}