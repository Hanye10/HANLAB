package day11;

public class InnerClassTest {

	public static void main(String[] args) {
		//1) Outer클래스의 a,b변수값을 출력하세요
		Outer o=new Outer();
		System.out.println("o.a= "+o.a);
		System.out.println("Ouber.b= "+Outer.b);
		
		//2) Inner클래스의 c변수값 출력하고 sub()메소드 호출하기
		Outer.Inner oi=o.new Inner();
		System.out.println("oi.c= "+oi.c);
		oi.sub();
		
		Outer.Inner oi2=new Outer().new Inner();
		oi2.sub();
		
		//3) SInner클래스의 d 출력하고 foo(), bar()호출하기
		Outer.SInner os=new Outer.SInner();
		System.out.println("os.d= "+os.d);
		os.foo();
		
		System.out.println("Outer.SInner.e="+Outer.SInner.e);
		Outer.SInner.bar();
	}

}
