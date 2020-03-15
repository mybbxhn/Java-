package cn.itcast.day06.Demo03;

public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "李冰冰";
//        person.age = -19; // 直接访问private内容，错误写法！
        person.setAge(19);
        person.show();
    }
}
