import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int age=scn.nextInt();
        int sal=scn.nextInt();
        if (age>60)
        System.out.println(sal+1000);
        else if (age>40 && age<=60)
        System.out.println(sal+500);
        else 
        System.out.println(sal+0);
    }
}
