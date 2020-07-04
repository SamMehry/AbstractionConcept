
public class TestPage {
	
	
	public static void main(String[]args) {
		
		BOFBank b = new BOFBank ();
		
		b.credit();
		b.debit();
		b.loan();
		b.mortgage();
		
		
		PolymorphismOverriding b1 = new BOFBank();
		
		b1.loan();
		b1.credit();
		b1.debit();
		
		
		
	}
	

}
