package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1=new Product(625,"asus",15000,"nx1565 128 gb",10,100);

		Product product2=new Product(626,"lenovo",20000,"Rx145h 128gb",20,100);

		Product product3=new Product(627,"casper",20000,"vx456r 256 gb",20,100);

		
		Category category1=new Category(3844,"personel Computer","electronic");

		
		Product[] products= {
				product1,
				product2,
				product3
		};
	for(Product product:products)	
    System.out.println(product.getName());
	
	ProductManager productManager=new ProductManager();
	productManager.addToCart(product1);
	
	}

}
