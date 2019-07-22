import java.util.Scanner;
public class Test_Num {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个int类型数字，范围为 1 - 100 ：");
        int guessNum = (int) (Math.random() * 100) + 1;
        System.out.println(guessNum);
        while (true) {
            int result = sc.nextInt();
            if (result > guessNum) {
                System.out.println("数字大了");
            } else if (result < guessNum) {
                System.out.println("数字小了");
            } else {
                System.out.println("ok");
                break;
            }    
        }
	}
}