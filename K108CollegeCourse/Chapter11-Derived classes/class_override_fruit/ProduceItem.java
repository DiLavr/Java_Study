package class_override_fruit;

public class ProduceItem extends GenericItem { 
	   public void setExpiration(String newDate) {
	      expirationDate = newDate;
	      return;
	   }

	   public String getExpiration() {
	      return expirationDate;
	   }

	   @Override  // - ������������ ���� �����, ������� ��� �������� �� GenericItem, ��� �� �������������� ������
	   public void printItem() {
	      System.out.println(itemName + " " + itemQuantity
	              + " (Expires: " + expirationDate + ")");
	      return;
	   }
	   
	   private String expirationDate;
	}
