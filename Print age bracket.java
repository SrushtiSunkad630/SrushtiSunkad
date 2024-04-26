import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if (a>=70)
        System.out.println("Super Senior Citizen");
        else if (a<=70 && a>=59)
        System.out.println("Senior Citizen");
        else if (a<59 && a>=18)
        System.out.println("Adult");
        else if (a<18 && a>1)
        System.out.println("Underage");
        else
        System.out.println("New Born");

    }
}
