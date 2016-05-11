package tugas.bab7;

import java.util.Scanner;

public class TugasBab5 {

    public static String Name, Member, Service, Goods;
    public static int Pick, Qty;
    public static Scanner in = new Scanner(System.in);
    public static Premium P = new Premium();
    public static Gold G = new Gold();
    public static Silver S = new Silver();
    public static Non N = new Non();

    public static void main(String[] args) {
        String Line = "===========================================";
        do {
            System.out.println(Line);
            System.out.println("TOGIL BARBER SHOP");
            System.out.println(Line);
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
            System.out.println("  > 0. Exit");
            System.out.println(Line);
            System.out.print("Pick      : ");
            Pick = in.nextInt();
            System.out.println(Line);
            switch (Pick) {
                case 1:
                    System.out.println("Service Bill");
                    System.out.print("Name              : ");
                    Name = in.next();
                    System.out.print("Service           : ");
                    Service = in.next();
                    System.out.print("Member            : ");
                    Member = in.next();
                    if (Member.equalsIgnoreCase("Premium")) {
                        P.Service(Service);
                    } else if (Member.equalsIgnoreCase("Gold")) {
                        G.Service(Service);
                    } else if (Member.equalsIgnoreCase("Silver")) {
                        S.Service(Service);
                    } else if (Member.equalsIgnoreCase("Non")) {
                        N.Service(Service);
                    } else {
                        System.out.println("Member isn't available");
                    }
                    break;
                case 2:
                    System.out.println("Goods Bill");
                    System.out.print("Name              : ");
                    Name = in.next();
                    System.out.print("Goods             : ");
                    Goods = in.next();
                    System.out.print("Qty               : ");
                    Qty = in.nextInt();
                    System.out.print("Member            : ");
                    Member = in.next();
                    if (Member.equalsIgnoreCase("Premium")) {
                        P.Goods(Goods, Qty);
                    } else if (Member.equalsIgnoreCase("Gold")) {
                        G.Goods(Goods, Qty);
                    } else if (Member.equalsIgnoreCase("Silver")) {
                        S.Goods(Goods, Qty);
                    } else if (Member.equalsIgnoreCase("Non")) {
                        N.Goods(Goods, Qty);
                    } else {
                        System.out.println("Member isn't available");
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }
        } while (Pick != 0);
    }

}
