package myPackage.subPackage;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            main2();
        }
        catch(MyException e){
            System.out.println("Exception caught is :"+e);
        }
        {
            System.out.println("Normal Block");
        }
    }
    public static void main2() throws MyException{
        main3();
    }
    public static void main3() throws MyException{
        main4();
        System.out.println("Main4");
    }
    public static void main4() throws MyException{
        Scanner sc = new Scanner(System.in);
        throw new MyException(sc.nextLine());
    }
}
class MyException extends Exception{
    MyException(String exception){
        super(exception);
    }
}