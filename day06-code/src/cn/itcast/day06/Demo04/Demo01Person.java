package cn.itcast.day06.Demo04;

public class Demo01Person {

    public static void main(String[] args) {
        Person person = new Person();
        // 设置我自己的名字
        person.name = "你爸爸";
        person.sayHello("马云");

        System.out.println(person); // 地址值
    }
}
