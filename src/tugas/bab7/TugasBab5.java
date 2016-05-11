package tugas.bab7;

import java.util.Scanner;

public class TugasBab5 {

    public static String Name, Member, Service, Goods;
    public static int Pick;
    public static Scanner in = new Scanner(System.in);
    public static Premium P = new Premium(Name, Member);
    public static Gold G = new Gold(Name, Member);
    public static Silver S = new Silver(Name, Member);
    public static Non N = new Non(Name, Member);

    public static void main(String[] args) {
        do {
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
            switch (Pick) {
                case 1:
                    System.out.println("Service Bill");
                    System.out.print("Name      : ");
                    Name = in.next();
                    System.out.print("Service   : ");
                    Service = in.next();
                    System.out.print("Member    : ");
                    Member = in.next();
                    if (Member.equalsIgnoreCase("Premium")) {
                        P.Service(Service);
                    } else if (Member.equalsIgnoreCase("Gold")) {
                        G.Service(Service);
                    } else if (Member.equalsIgnoreCase("Silver")) {
                        S.Service(Service);
                    } else if (Member.equalsIgnoreCase("Non")) {
                        N.Service(Service);
                    }
                    break;
                case 2:
                    System.out.println("Goods Bill");
                    System.out.print("Name      : ");
                    Name = in.next();
                    System.out.print("Service   : ");
                    Goods = in.next();
                    System.out.print("Member    : ");
                    Member = in.next();
                    if (Member.equalsIgnoreCase("Premium")) {
                        P.Goods(Goods);
                    } else if (Member.equalsIgnoreCase("Gold")) {
                        G.Goods(Goods);
                    } else if (Member.equalsIgnoreCase("Silver")) {
                        S.Goods(Goods);
                    } else if (Member.equalsIgnoreCase("Non")) {
                        N.Goods(Goods);
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
