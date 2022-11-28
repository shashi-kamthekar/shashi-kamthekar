package java_programmes;

public class Arithmatic {
	
	public int add(int a,int b) {
		System.out.println("the addition is "+(a+b));
		return a+b;
	}
		
		public int sub(int a,int b) {
			System.out.println("the sub is "+(a-b));
			return a-b;
		}
		
		public int mul(int a, int b) {
			System.out.println("the mul is "+(a*b));
			return a*b;
		}
	
	public static void main(String[] args) {

		Arithmatic a1=new Arithmatic();
		a1.add(30, 60);
		
		Arithmatic s1=new Arithmatic();
		s1.sub(30, 60);
		
		Arithmatic m1=new Arithmatic();
		m1.mul(30, 60);
		
		
		
		
	}




}
