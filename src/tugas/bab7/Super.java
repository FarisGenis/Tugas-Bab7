package tugas.bab7;

public abstract class Super {
    
    public String Name, Member;
    public float Pay, Price;
    public final int CukurRambut = 15000,
            CukurKumis = 5000,
            Pomade = 150000,
            Comb = 45000;
            

    public Super(String Name, String Member) {
        this.Name = Name;
        this.Member = Member;
    }
    
    public void getBill(String SG) {
            System.out.println("Service/Goods     : " + SG);
            System.out.println("Price             : " + "Rp" +  Price);
            System.out.println("Discount          : " + (Price - Pay));
            System.out.println("Pay               : " + "Rp" +  Pay);
    }
    
    public abstract void Service(String Service);
    public abstract void Goods(String Goods);
}
