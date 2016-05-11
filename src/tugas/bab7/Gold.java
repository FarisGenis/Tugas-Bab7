package tugas.bab7;

public class Gold extends Super {

    @Override
    public void Service(String Service) {
        if (Service.equalsIgnoreCase("CukurRambut")) {
            Price = CukurRambut;
            Pay = (float) (CukurRambut - (CukurRambut * 0.2));
            getBill(Service);
        } else if (Service.equalsIgnoreCase("CukurKumis")) {
            Price = CukurKumis;
            Pay = (float) (CukurKumis - (CukurKumis * 0.2));
            getBill(Service);
        } else {
            System.out.println("The service isn't available");
        }
    }

    public void Goods(String Goods, int Qty) {
        if (Goods.equalsIgnoreCase("Pomade")) {
            Price = Pomade;
            Pay = (float) ((Pomade * Qty) - (Pomade * 0.1));
            getBill(Goods);
        } else if (Goods.equalsIgnoreCase("Comb")) {
            Price = Comb;
            Pay = (float) ((Comb  * Qty) - (Comb * 0.1));
            getBill(Goods);
        } else {
            System.out.println("The goods isn't available");
        }
    }
}
