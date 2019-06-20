package chapter_10_OOP_Thinking;


public class ConstractString {
	
	
	
	public static void main(String[] args) {
	
	String s = "Welcome";	System.out.println(s);
	s = "Welcome".replace("e", "A");	System.out.println(s);
	s= s.replaceFirst("A", "AB");	System.out.println(s);
	s = s.replace("co", "CO");	System.out.println(s);

		System.out.println("----------------------------------");
	
	// разрыв - split строки по символу # 
	String[] tokens = "java#HTML#Perl".split("#", 0);
	for(int i = 0; i < tokens.length; i++)
		System.out.println(tokens[i] + " ");
	
	System.out.println("----------------------------------");
	
	"Java is fun".matches("Java.*"); //return TRUE
	"Java is cool".matches("Java.*"); //return TRUE
	
	// замена всего что стоит в квадратных скобках на второй аргумент
	s = "a+b#$c".replaceAll("[+#$]", " NNN ");
	
	System.out.println(s);
	
	System.out.println("----------------------------------");
	

	tokens = "Java,C?C#,C++".split("[.,:;?]");
	for(String token : tokens) 
		System.out.println(token);
	System.out.println("----------------------------------");
	
	//  разберает элемент на элеменыт и записывает в строку
	//т.е. число 5,44 - пеперь строка и можно с ним работать, как со строкой
	String x = String.valueOf(5.44);
		System.out.println(x + " - now is strint");
		
		System.out.println("\n-----StringBuilder----java.leng.Stringbuilder------");

	
	
	  
	 
	 
	
	
	
	
	
	
	
	}
}