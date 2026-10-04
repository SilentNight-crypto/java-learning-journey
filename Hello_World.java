import java.util.*;
public class Hello_World{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your choice 0 or 1 :");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.println("Hello world!This is Shreejita beginning my java journey.");
        }else{
            System.out.println("I will start my journey tomorrow.");
        }
    }
}