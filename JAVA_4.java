package Java_1;

import java.awt.*;
import java.util.Scanner;

public class JAVA_4 {
    public static void main(String[] args) {
        /*Frame frame = new Frame("智能年龄查询");  //设置标题
        frame.setVisible(true);     //设置可见性
        frame.setSize(500,500);     //设置窗口大小
        frame.setBackground(new Color(255, 0, 0));      //设置背景颜色
        frame.setLocation(200,200);     //设置初始位置
        frame.setResizable(false);      //设置大小固定
*/
        System.out.println("智能年龄查询");
        System.out.println("请输入被查人的年龄(岁)");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("被查人年龄为:"+num+"岁");
    }
}