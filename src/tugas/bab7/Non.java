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
        } else if (Service.equalsIgnoreCase("CukurKumis")){
            Price = CukurKumis;
            Pay = CukurKumis;
        }
    }

    @Override
    public void Goods(String Goods) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
