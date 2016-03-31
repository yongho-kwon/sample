package code.app;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	int plan, UseMinute, Line;
        System.out.println("plan을 선택해주세요 : 1.골드 2. 실버");
        Scanner scan = new Scanner(System.in);
        plan = scan.nextInt();
        System.out.println("총 사용시간을 분단위로 입력해주세요 : ");
        UseMinute = scan.nextInt();
        System.out.println("사용 회선 수를 입력해주세요 : ");
        Line = scan.nextInt();
        
        System.out.println("사용 금액은 : " + (UseMinute*1000)*4 + "원 입니다.");
        
  
    }
}
