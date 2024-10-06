import java.util.Scanner;   //导入包
public class Odd_和_even_number_judges {
    public static void main(String[] args) {
        System.out.println("奇数偶数判断器(整数)");
            System.out.println("请输入数字以判断偶数/奇数：");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("结果:偶数");
            } else {
                System.out.println("结果:奇数");
            }
            System.out.println("程序执行完成");
    }
}
