package prototype;

public class Main {

	public static void main(String[] args) {
		Autobuz a1=new Autobuz("B05ANT", "Ionel");
		
		try {
			MijlocTransportComun a2 =  a1.copiaza();
			
			System.out.println(a2);
	
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		 

	}

}
