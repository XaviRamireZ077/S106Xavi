package n1Exercici1;

public class Main {

	public static void main(String[] args) {
		

	String obj1 = "No";
	String obj2 = "Generic";
	String obj3 = "Methods";
	
	NoGenericMethods <String> obj = new NoGenericMethods<String>(obj1,obj2,obj3);

		
    System.out.println(obj.getObj1()+obj.getObj2()+obj.getObj3());
		
		
	}

}
