package cn.itcast.day06.Demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "iPhone";
        one.price = 11888.0;
        one.color = "土豪金";

        method(one); // 传递进去的参数其实就是地址值
    }

    public static void method(Phone param){
        System.out.println(param.brand); // 苹果
        System.out.println(param.price); // 11888.0
        System.out.println(param.color); // 土豪金
    }
}
