class A
{
	public void show() {
		System.out.println(" Class A");
	}
}
class B extends A
{
	public void show() {												// METHOD OVERRIDING
		System.out.println(" Class B");
	}
}
class C extends A
{
	public void show() {												// METHOD OVERRIDING
		System.out.println(" Class C");
	}
}
public class Inherit
{
	public static void main(String[] args)
	{
		
//		C obj = new C();
		int i=3;
		A obj = null;
		if (i%2==0)														// MULTIPLE BHEAVIOUR
			obj= new B();
		else															// POLY MORPHIC
			obj= new C();
		obj.show();														// POLYMORPHISM
		
		
		
		
//		int num1, num2;
//		num1 = 2;
//		num2 = 4;
//		
//		ClassC a1 = new ClassC();
//		int result =(a1.add(num1, num2));
//		int result1 = (a1.sub(num1, num2));
//		int results2 = (a1.mult(num1, num2));
//		System.out.println(result);
//		System.out.println(result1);
//		System.out.println(results2);
	}

}
