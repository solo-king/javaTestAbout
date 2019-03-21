import java.util.HashMap;


public class TestMain{

	static void printInfo(String str){

		
		System.out.println(str);

	}

	public static void main(String[] args){
		
		HashMap<Integer, Person > persons = new HashMap<Integer, Person>(); 
		Person per = persons.get(0);
		per = new Person("chenqigan", 24);
		persons.put(0, per);
		Person  ganye = persons.get(0);	
		if(per == null){
			
			printInfo("per = "+ per);	
		}	
		printInfo(per.toString());
		printInfo(ganye.toString());
		

	}

}
