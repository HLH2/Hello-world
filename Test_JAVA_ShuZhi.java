import java.util.Scanner;
public class Test_JAVA_ShuZhi {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input number:");
        int x = sc.nextInt();
        System.out.println("please input number:");
        int y = sc.nextInt();

        boolean b = Xiangtong(x, y);
        System.out.println(b);
    }

    public static int Maxzhi(int a,int b){
        return a < b ? a : b;
    }

    public static boolean Xiangtong(int a,int b){
        return a == b;
    }
}
