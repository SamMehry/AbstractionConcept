
public abstract class PolymorphismOverriding {
	
	
	int amoount = 100; 
	final int rate = 10; 
	static int loanRate = 5; 
	
	//partial abstraction
	//hiding the implementation logic -- is called abstraction (OOP Concept)
	//Abstraction class can have Abstract methods and non Abstract Methods
	//can not creat the object of abstract classes
	
	public abstract void loan(); // abstract method -- no method body 
	
	// non abstract methods 
	public void credit() {
		
		System.out.println("Bank -- Credit");
		
	}
	
	public void debit () {
		System.out.println("Bank--Debit");
		
	}
	

}
