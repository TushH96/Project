import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		/*HashMap<String, Student> hm = new HashMap<>();
		Student s1 = new Student("Rasika", "Baviskar", 1, new Phone("34567", "2345678"));
		Student s2 = new Student("Tushar", "Adholekar", 2, new Phone("34567", "2345678"));
		Student s3 = new Student("Arya", "wani", 3, new Phone("34567", "2345678"));
		Student s4 = new Student("Ashish", "Baviskar", 4, new Phone("34567", "2345678"));

		hm.put("ele", s1);
		hm.put("com", s2);
		hm.put("junior", s3);
		hm.put("Main", s4);*/
		
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Arya");    
	      map.put(101,"Vivek");    
	      map.put(102,"Rasika");  
		
	  //  map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);    
	      map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println); 
	    //  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); 
	      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); 
	}
}
