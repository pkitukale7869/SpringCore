package in.sk.comp;

public class A {

	private B b;
	static {
		System.out.println("A.class file is loading...");
	}
	public A()
	{
		System.out.println("A :: 0 Param Constructor");
	}
	
	public A(B b) {
		this.b = b;
		System.out.println("A.A() :: 1 param Constructor");
	}

	public void setB(B b)
	{
		System.out.println("A.setB()");
		this.b = b;
	}
	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
}
