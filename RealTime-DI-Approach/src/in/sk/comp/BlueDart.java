package in.sk.comp;

public class BlueDart implements Courier {

	static
	{
		System.out.println("BlueDart.class File is loading...");
	}
	public BlueDart()
	{
		System.out.println("BlueDart :: ZERO param Cosntructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will Deliver with Order id :: "+oid+" for the ordered products";
	}

}
