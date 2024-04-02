package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product(625,"asus","nx1565 128 gb",15000);

		Product product2=new Product(626,"lenovo","Rx145h 128gb",20000);

		Product product3=new Product(627,"casper","vx456r 256 gb",20000);

		
		Category category1=new Category();
		category1.name="personal Computer";
		category1.id=3844;
		category1.description="electronic";
		
		Product[] products= {
				product1,
				product2,
				product3
		};
	for(Product product:products)	
    System.out.println(product.name);
	}

}
