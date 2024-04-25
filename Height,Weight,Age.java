import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       int H=scn.nextInt();
       int W=scn.nextInt();
       int A=scn.nextInt();
       if (H==5 && W==50 && A==10)
       System.out.println("Overweight");
       else if (H==5||W==60)
       System.out.println("Fat");
       else if (H==6 && W==50)
       System.out.println("Slim");
       else 
       System.out.println("None");
    }
}
