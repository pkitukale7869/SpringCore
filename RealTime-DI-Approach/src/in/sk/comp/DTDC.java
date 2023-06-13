package in.sk.comp;

public class DTDC implements Courier {

	static
	{
		System.out.println("DTDC.class File is loading...");
	}
	public DTDC()
	{
		System.out.println("DTDC :: ZERO param Cosntructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will Deliver with Order id :: "+oid+" for the ordered products";
	}

}
