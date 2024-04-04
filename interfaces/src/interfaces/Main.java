package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new FileLogger(),new EmailLogger()};
		
		Customer customer1=new Customer(582,"samet","açık");
		
		CustomerManager customerManager=new CustomerManager(loggers);
		
		
		customerManager.add(customer1);
		
		

	}

}
