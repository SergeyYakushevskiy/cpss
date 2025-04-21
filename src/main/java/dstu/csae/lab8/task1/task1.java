package dstu.csae.lab8.task1;

public class task1 {

    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isKotlinBetter = false;

        System.out.println("Java is fun? " + isJavaFun);
        System.out.println("Kotlin is better? " + isKotlinBetter);

        boolean andResult = isJavaFun & isKotlinBetter;
        boolean orResult = isJavaFun | isKotlinBetter;
        boolean notResult = !isJavaFun;

        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT: " + notResult);
    }

}
