package class_override_fruit;

public class ProduceItem extends GenericItem { 
	   public void setExpiration(String newDate) {
	      expirationDate = newDate;
	      return;
	   }

	   public String getExpiration() {
	      return expirationDate;
	   }

	   @Override  // - переписываем этот метод, который нам достался из GenericItem, как из родительсткого класса
	   public void printItem() {
	      System.out.println(itemName + " " + itemQuantity
	              + " (Expires: " + expirationDate + ")");
	      return;
	   }
	   
	   private String expirationDate;
	}
