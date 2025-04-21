package dstu.csae.lab8.task2;

public class task2{

    public static void main(String[] args) {
        int age = 25;
        long bigNumber = 1_000_000_000l;
        short smallNumber = 1000;
        byte tinyNumber = 127;

        final int MAX_SPEED = 120;

        System.out.println(age);
        System.out.println(bigNumber);
        System.out.println(MAX_SPEED);

        int sum = age + 10;
        int div = 10 / 3;

        System.out.println("sum =" + sum);
        System.out.println("div =" + div);
    }

}
