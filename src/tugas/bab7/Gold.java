package tugas.bab7;

public class Gold extends Super {

    public Gold(String Name, String Member) {
        super(Name, Member);
    }

    @Override
    public void Service(String Service) {
        if (Service.equalsIgnoreCase("CukurRambut")) {
            Price = CukurRambut;
            Pay = (float) (CukurRambut - (CukurRambut * 0.1));
            getBill();
        } else if (Service.equalsIgnoreCase("CukurKumis")) {
            Price = CukurKumis;
            Pay = (float) (CukurKumis - (CukurKumis * 0.1));
            getBill();
        } else {
            System.out.println("The service isn't available");
        }
    }

    @Override
    public void Goods(String Goods) {
        if (Goods.equalsIgnoreCase("Pomade")) {
            Price = Pomade;
            Pay = (float) (Pomade - (Pomade * 0.1));
            getBill();
        } else if (Goods.equalsIgnoreCase("Comb")) {
            Price = Comb;
            Pay = (float) (Comb - (Comb * 0.1));
            getBill();
        } else {
            System.out.println("The goods isn't available");
        }
    }

}
