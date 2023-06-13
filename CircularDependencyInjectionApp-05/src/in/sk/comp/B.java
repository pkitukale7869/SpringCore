package in.sk.comp;

public class B {
	private A a;

	static {
		System.out.println("B.class file is loading....");
	}
	public B() {
		System.out.println("B :: Zero Param Constructor....");
	}

	
	public B(A a) {
		this.a = a;
		System.out.println("B.B() :: 1 param Constructor...");
	}


	public void setA(A a) {
		System.out.println("B.setA()");
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	

}
