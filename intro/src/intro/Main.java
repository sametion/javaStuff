package intro;

public class Main{

	public static void main(String[] args) {
		
	String internetSubeButonu="internet subesi";
	System.out.println(internetSubeButonu);
	
	String[] krediler= {"konut kredisi","taşıt kredisi","ihtiyaç kredisi",
			"ziraat kredisi","kobi kredisi"};
	
	System.out.println(krediler[2]);
	for(String kredi:krediler) { 
		System.out.println(kredi);
	}

	}

}
