package test;

public class A<A,B,C> {
	A a;
	B b;
	C c;
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "hello A";
	}
	public static void main(String[] args)
	{
		
	}
	}

}
