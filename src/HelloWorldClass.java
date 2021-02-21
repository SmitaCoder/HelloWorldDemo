import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorldClass {

    public static void main(String args[]){
        System.out.println("hello world there !!" + " may name is : "+getName()+ " !!");
    }

    public static String getName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }
}
