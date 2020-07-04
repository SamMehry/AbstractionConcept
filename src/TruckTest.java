
public class TruckTest {
	
	public static void main(String[]args) {
		
		CyberTruck c=new CyberTruck();
		
		c.bulletproof();
		c.engine();
		c.material();
		c.strong();
		
		
		
		Truck t =new CyberTruck();
		t.bulletproof();
		t.engine();
		t.material();
		//t.strong();
		// above is not in parent method so we can't call this statement.
		
	}

}
