package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
* 题目：用代码模拟猜数字的小游戏。
* 
* 思路：
* 1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
* 2. 需要键盘输入，所以用到了Scanner
* 3. 获取键盘输入的数字，用Scanner当中的nextInt方法
* 4. 已经得到了两个数字，判断if一下
*       如果太大了，提示太大，并且重试；
*       如果太小了，提示太小，并且重试；
*       如果猜中了，游戏结束。
* 5. 重试就是再来一次，循环次数不确定，用while(true)。
* */
public class Demo04RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100)+1; // [1,100]
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); // 键盘输入猜测的数字
            count++;
            if(guessNum > randomNum){
                System.out.println("太大了，请重试。");
            } else if(guessNum < randomNum){
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break; // 如果猜中，不再重试
            }
        }
        System.out.println("猜了 " + count + "次");
        System.out.println("游戏结束。");
    }
}
