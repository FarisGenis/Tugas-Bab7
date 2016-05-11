package tugas.bab7;

public class Non extends Super {

    public Non(String Name, String Member) {
        super(Name, Member);
    }

    @Override
    public void Service(String Service) {
        if (Service.equalsIgnoreCase("CukurRambut")) {
            Price = CukurRambut;
            Pay = CukurRambut;
            getBill(Service);
        } else if (Service.equalsIgnoreCase("CukurKumis")) {
            Price = CukurKumis;
            Pay = CukurKumis;
            getBill(Service);
        } else {
            System.out.println("The service isn't available");
        }
    }

    public void Goods(String Goods) {
        if (Goods.equalsIgnoreCase("Pomade")) {
            Price = Pomade;
            Pay = (float) (Pomade - (Pomade * 0.1));
            getBill(Goods);
        } else if (Goods.equalsIgnoreCase("Comb")) {
            Price = Comb;
            Pay = (float) (Comb - (Comb * 0.1));
            getBill(Goods);
        } else {
            System.out.println("The goods isn't available");
        }
    }
}
