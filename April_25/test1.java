
public class test1 {
	public static void main (String args[]) {
		B b =new B(10);
		B b1=new B();
	}

}
class A{
	int a;
	public  A () {
		System.out.println("A:"+a);
	}
}
class B extends A{
	int b;
	public B(int b) {
		super();
		System.out.println("B1:"+b);
	}
	public B( ) {
		System.out.println("B2:"+b);
	}
}
