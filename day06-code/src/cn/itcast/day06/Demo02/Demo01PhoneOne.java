package cn.itcast.day06.Demo02;

public class Demo01PhoneOne {

    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        // 格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("========");

        one.brand = "iPhone 7";
        one.price = 5888.0;
        one.color = "黑色";
        System.out.println(one.brand); // 苹果
        System.out.println(one.price); // 5888.0
        System.out.println(one.color); // 黑色
        System.out.println("=============");

        one.call("乔布斯");
        one.sendMessage();
    }
}
