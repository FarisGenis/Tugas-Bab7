package tugas.bab7;

import java.util.Scanner;

public class TugasBab5 {
    public static String Name, Member;
    public static int Pick;
    public static Scanner in = new Scanner(System.in);
    public static Premium P = new Premium(Name, Member);
    public static Gold G = new Gold(Name, Member);
    public static Silver S = new Silver(Name, Member);
    public static Non N = new Non(Name, Member);
    

    public static void main(String[] args) {
        System.out.println("TOGIL BARBER SHOP");
        System.out.println("=> Service");
        System.out.println("  > CukurRambut         = Rp 20000");
        System.out.println("  > CukurKumis          = Rp 10000");
        System.out.println("=> Goods");
        System.out.println("  > Pomade              = Rp 200000");
        System.out.println("  > Comb                = Rp 45000");
        System.out.println("");
        System.out.println("=> MENU");
        System.out.println("  > 1. Service");
        System.out.println("  > 2. Goods");
        System.out.print("Pick      : ");
        Pick = in.nextInt();
        switch (Pick){
            case 1:
                System.out.println("");
        }
    }

}
