package in.sk.comp;

import java.util.Arrays;
import java.util.Random;

//TARGET Object
public class Flipkart {
	
	//DEPENDENT Objects
	private Courier courier;
	private Float discount;

	static
	{
		System.out.println("\nFlipkart.class File is loading...");
	}
	public Flipkart()
	{
		System.out.println("Flipkart :: ZERO param Cosntructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
		//System.out.println(this);
	}
	//BUSINESS LOGIC
	public String doShopping(String[] items, float prices[])
	{
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is:: "+courier.getClass().getName());
		System.out.println("Discount Amount :: "+discount);
		
		int oid = 0;
		float billAmt =0.0f;
		Random random = null;
		for(float price : prices)
		{
			billAmt += price;
		}
		billAmt = billAmt - (discount/100.0f);
		random = new Random();
		oid = random.nextInt(1000);
		System.out.println("Order ID is :: "+oid);
		String msg = courier.deliver(oid);		
		return Arrays.toString(items) + "are purchased having prices "+ Arrays.toString(prices) +"with billAmount of "+ billAmt+"---->"+msg;
	}


	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
	
	
}
