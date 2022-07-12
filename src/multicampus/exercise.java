package multicampus;
import java.util.*;
public class exercise {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int score=0;
		score=sc.nextInt();
		
		System.out.println("학년을 입력하세요");
		Scanner sc2=new Scanner(System.in);
		int grade=1;
		grade=sc2.nextInt();
			
		if (score>=60) {
			if (grade!=4) {
			System.out.println("합격입니다");
			}else if (grade==4 && score>=70) {
			System.out.println("합격입니다");
			}else {
			System.out.println("불합격입니다");
			}
		}else {
			System.out.println("불합격입니다");
		}
		
	} 
}