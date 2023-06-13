package in.sk.comp;

public class FirstFlight implements Courier {

	static
	{
		System.out.println("FirstFlight.class File is loading...");
	}
	public FirstFlight()
	{
		System.out.println("FirstFlight :: ZERO param Cosntructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.deliver()"); 
		return "FirstFlight Courier will Deliver with Order id :: "+oid+" for the ordered products";
	}

}
