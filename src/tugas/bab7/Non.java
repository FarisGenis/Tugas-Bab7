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
            getBill();
        } else if (Service.equalsIgnoreCase("CukurKumis")){
            Price = CukurKumis;
            Pay = CukurKumis;
            getBill();
        } else {
            System.out.println("The service isn't available");
        }
    }

    @Override
    public void Goods(String Goods) {
        if (Goods.equalsIgnoreCase("Pomade")) {
            Price = Pomade;
            Pay = Pomade;
            getBill();
        } else if (Goods.equalsIgnoreCase("Comb")){
            Price = Comb;
            Pay = Comb;
            getBill();
        } else {
            System.out.println("The goods isn't available");
        }
    }
}
