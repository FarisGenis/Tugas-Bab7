package tugas.bab7;

public abstract class Super {

    public String Name, Member;
    public float Pay, Price;
    public final int CukurRambut = 20000,
            CukurKumis = 10000,
            Pomade = 200000,
            Comb = 45000;

    public void getBill(String SG) {
        System.out.println("Service/Goods     : " + SG);
        System.out.println("Price             : " + "Rp " + Price);
        System.out.println("Discount          : " + "Rp " + (Price - Pay));
        System.out.println("___________________________________________");
        System.out.println("Pay               : " + "Rp " + Pay);
    }

    public abstract void Service(String Service);
}
