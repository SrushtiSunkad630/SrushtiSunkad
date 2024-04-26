import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int unit=scn.nextInt();
        int totalcost=unit*100;
        if (totalcost>1000)
        System.out.println(totalcost-(int)(totalcost*0.1));
        else
        System.out.println(totalcost);
    }
}
