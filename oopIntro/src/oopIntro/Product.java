package oopIntro;

public class Product {
	
	public Product() {
		System.out.println("ben calistim");
	};
	public Product(int id,String name,String description,double unitPrice) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.unitPrice=unitPrice;
	};
	int id;
	String name;
	double unitPrice;
	String description;
	
	
}
