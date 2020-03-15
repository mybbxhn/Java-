package cn.itcast.day06.Demo02;

public class Demo03PhoneSane {

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

        System.out.println("===================");

        //将one当中保存的对象地址值赋值给two
        Phone two = one;
        System.out.println(two.brand); // 苹果
        System.out.println(two.price); // 5888.0
        System.out.println(two.color); // 黑色
        System.out.println("==============");

        two.brand = "小米";
        two.price = 3999.0;
        two.color = "土豪金";
        System.out.println(two.brand); // 小米
        System.out.println(two.price); // 3999.0
        System.out.println(two.color); // 土豪金
        System.out.println("==============");

        two.call("欧巴"); // 给欧巴打电话
        two.sendMessage(); // 群发短信
    }
}
