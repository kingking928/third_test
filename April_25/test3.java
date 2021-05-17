
public class test3 {
	public static void main(String args[]) {
		chong a =new chong();
		a.receive(1.0);
		a.receive(1);
		a.receive(1.0, 2.0);
		a.receive(1, 2);
		
	}

}
class Chongzai{
	void receive(int a) {
		System.out.println("a="+a);
	}
	void receive(int a,int b) {
		System.out.println("a+b="+(a+b));
	}
	void receive(double a,double b) {
		System.out.println("a+b="+(a+b));
	}
}
class chong extends Chongzai{
	void receive(double a) {
		System.out.println("a="+a);
	}
}
