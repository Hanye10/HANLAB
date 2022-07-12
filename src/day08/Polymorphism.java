package day08;

public class Polymorphism {

	public static void main(String[] args) {

		Human h1=new Human("강철민",171); {
			System.out.println(h1.getInfo());
		}
		Superman s1=new Superman("이소라",170, 600); {
			System.out.println(s1.getInfo("--슈퍼맨 정보---"));
		}
		
		Aquaman a1=new Aquaman("인어공주",144,200);{
			System.out.println(a1.getInfo());
		}
		
		//부모 자식의 상속관계가 있을 경우
		//부모타입 참조변수=new 자식 객체();
		/*- 부모타입의 변수를 선언하고 객체는 자식객체로 생성하는 것이 가능하다 ==>다형성
		 *
		 *- 이럴 경우 부모타입의 참조변수로 접근할 수 있는 변수나 메소드는 제한이 있다. 
		 * 	[1] 부모로부터 물려받은 변수나 메소드는 접근 가능하다.
		 *  [2] 자식만 갖는 고유한 변수나 메소드는 접근할 수 없다.
		 *  [3] 단, 오버라이딩한 메소드가 있을 경우는 자식의 것을 우선적용한다.
		 */
		
		
		Human hs=new Superman("이희재", 175,300);
		System.out.println("hs.name: "+hs.name);
		System.out.println("hs.height: "+hs.height);
		//System.out.println("hs.power: "+hs.power); [x] - 부모타입 변수로는 접근 할 수 없음
		
		System.out.println(hs.getInfo());
		//재정의한 메소드의 경우 hs로 호출하면 자식의 것이 우선적용됨
		
		System.out.println("hs.power: "+((Superman)hs).power); // 형변환에서 ()와 . 중 .이 우선적용됨
		//부모 자식의 상속관계가 있을 경우 형변환이 가능하다. 
		
		System.out.println("s1.power: "+s1.power);
		
		//Superman sm=new Human(" ",0); [x] - 자식 = 부모 안됨
		//Human hm=new String("Hello"); [x] - 상속관계 아님
		
		//hs참조변수로 "@@@슈퍼맨 정보@@@" 제목을 갖는 getInfo()호출해서 출력하기
		String info=((Superman)hs).getInfo("@@@슈퍼맨 정보@@@"); //원래 hs에는 타이틀 항목 없음 ==> 강제형변환
		System.out.println(info);
		
		//[문제1]
		//Human타입 변수 선언, Aquaman 객체 생성하기
		//getInfo()호출하기
		//name, height, speed 각각 출력하기 
		Human ha=new Aquaman("갈치", 120, 382.5);
		System.out.println(ha.getInfo());
		System.out.println("ha.name: "+ha.name);
		System.out.println("ha.height: "+ha.height);
		System.out.println("ha.speed: "+((Aquaman)ha).speed);
		
		//[문제2] h1,s1,a1,hs,ha 객체들을 저장할 배열을 생성하고, 저장한 뒤 for루프문 이용해서 배열에 저장된 객체들 출력하기
		System.out.println("-------문제2-------");
		Human arr[]= {h1,s1,a1,hs,ha};  //부모타입 배열 선언하면 자식 객체를 저장할 수 있음
		
		//arr[i] : Human계열의 객체들
		//instanceof 연산자를 이용하면 참조 변수가 어떤 클래스의 객체인지 알 수 있다.
		//참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체이면 true를 반환, 아니면 false를 반환
			for (int i=0;i<arr.length;i++) {
				
				if(arr[i] instanceof Superman){
					System.out.println(((Superman)arr[i]).getInfo("##슈퍼맨 정보##"));
				}else {
					System.out.println("-------------");
					System.out.println(arr[i].getInfo());
				}
			}
		
	}

}
