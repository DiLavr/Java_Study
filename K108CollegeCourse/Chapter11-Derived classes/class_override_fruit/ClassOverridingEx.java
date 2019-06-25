package class_override_fruit;

public class ClassOverridingEx {
	   public static void main(String[] args) {
	      GenericItem miscItem = new GenericItem(); // ����������� ���� ��������� �� ������ ������
	      ProduceItem perishItem = new ProduceItem();

// ����� �� ������ ������ ��� � ���������� � ��� �������� ������ ����� �� geneticItem	      
	      miscItem.setName("Smith Cereal");
	      miscItem.setQuantity(9);
	      miscItem.printItem();    // Calls GenericItem's printItem()

	      perishItem.setName("Apples");
	      perishItem.setQuantity(40);
	      perishItem.setExpiration("May 5, 2012");
	      perishItem.printItem(); // Calls ProduceItem's printItem()

	      return;
	   }
	}