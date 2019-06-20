package chapter_10_OOP_Thinking;


public class Time {
	     long hour, minute, second;


	  public Time(){
	    second = (int) (System.currentTimeMillis()/ 1000) % 60 ;
	    minute = (int) (System.currentTimeMillis() / 1000 / 60) % 60;
	    hour   = (int) (System.currentTimeMillis() / 1000 / 60 / 60) % 24;

	  }

	  public Time(long elapseTime){
	    second = (elapseTime / 1000);
	    minute = (elapseTime / 1000 / 60);
	    hour   = (elapseTime / 1000 / 60 / 60);
	  }
	  
	  Time(int hour, int minute, int second){
	      this.hour = hour;
	      this.minute = minute;
	      this.second = second;
	    }
	    public void setTime(long elapseTime){
	      second = (int) (elapseTime / 1000) % 60 ;
	      minute = (int) ((elapseTime / (1000*60)) % 60);
	      hour   = (int) ((elapseTime / (1000*60*60)) % 24);
	    }
	     public long getHours() {
	        return hour;
	    }

	    public long getMinute() {
	        return minute;
	    }

	    public long getSecond() {
	        return second;
	    }

}
 