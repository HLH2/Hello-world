import java.util.Scanner;
public class Test_Num {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("������һ��int�������֣���ΧΪ 1 - 100 ��");
        int guessNum = (int) (Math.random() * 100) + 1;
        System.out.println(guessNum);
        while (true) {
            int result = sc.nextInt();
            if (result > guessNum) {
                System.out.println("���ִ���");
            } else if (result < guessNum) {
                System.out.println("����С��");
            } else {
                System.out.println("ok");
                break;
            }    
        }
	}
}