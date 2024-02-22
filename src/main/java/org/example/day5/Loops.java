package org.example.day5;

public class Loops {

    public void practiceWhileLoop(){
        int x = 0;
        while (x < 5){
            System.out.println("The value of x is : " + x);
            x += 1;
        }
    }

    public static void practiceDoWhileLoop(){
        int x = 0;
        do {
            System.out.println("The value of is " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoop(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("("+i+","+j+")");
            }
        }
    }

    public static void main(String[] args) {
        Loops test = new Loops();
//        test.practiceWhileLoop();
//        test.practiceDoWhileLoop();
        test.practiceForLoop();
    }
}
