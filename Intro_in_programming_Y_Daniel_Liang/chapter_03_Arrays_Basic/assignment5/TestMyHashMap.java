package assignment5;

public class TestMyHashMap {
	public static void main(String[] args) {
		MyMap<String, Integer> map = new Lavruk_27_01<String, Integer>();

		System.out.println("Adding entries to map...");
		map.put("Smith", 30);
		map.put("Anderson", 31);
		map.put("Lewis", 29);
		map.put("Cook", 29);
		map.put("Smith", 65);

		System.out.println("map.toString(): s/b [[Lewis, 29][Cook, 29][Anderson, 31][Smith, 65]]: " + map); // s/b [[Lewis, 29][Cook, 29][Anderson, 31][Smith, 65]]
		System.out.println("entries in map: s/b [[Cook, 29], [Smith, 65], [Lewis, 29], [Anderson, 31]]: " + map.entrySet()); // s/b [[Cook, 29], [Smith, 65], [Lewis, 29], [Anderson, 31]]
		System.out.println("keySet for map: s/b [Smith, Lewis, Anderson, Cook]: " + map.keySet()); // s/b [Smith, Lewis, Anderson, Cook]
		System.out.println("values in map: s/b [65, 29, 31]: " + map.values()); // s/b [65, 29, 31]

		System.out.println("The age for " + "Lewis is  s/b 29: " + map.get("Lewis")); // s/b 29

		System.out.println("Is Smith in the map? s/b true: " + map.containsKey("Smith")); // s/b true
		System.out.println("Is age 33 in the map? s/b false: " + map.containsValue(33));  // s/b false

		map.remove("Smith");
		System.out.println("Entries in map: s/b [[Lewis, 29][Cook, 29][Anderson, 31]]: " + map); // s/b [[Lewis, 29][Cook, 29][Anderson, 31]]
		
		System.out.println("map.isEmpty(): s/b false: " + map.isEmpty()); // s/b false
		System.out.println("map.size(): s/b 3: " + map.size()); // s/b 3
		System.out.println("calling map.clear()...");
		map.clear();
		System.out.println("Entries in map: s/b []:  " + map); // s/b []
		System.out.println("map.isEmpty(): s/b true:  " + map.isEmpty()); // s/b true
		System.out.println("map.size(): s/b 0: " + map.size()); // s/b 0
	}
}

