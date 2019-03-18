public class Calculator {

    //inside the class - outside the methods with static keyword
    static int a = 25;   //static class variable
    static int b = 17;

    //This metod will perform addition
    static void add() {

        System.out.println(a+b);
    }

    //This method will perform substraction
     static void sub() {

        System.out.println(a-b);
     }

    //This method will perform multiplication
    static void multi() {

        System.out.println(a*b);
    }

    //This method will perform division
    static void divide() {

        System.out.println(a/b);
    }
    //java main method
    public static void main(String[] args) {
        add();
        sub();
        multi();
        divide();

    }

    }

