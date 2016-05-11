package tugas.bab7;

public abstract class Super {
    
    public String Name, Member;
    public int Pay, Price;
    public final int CukurRambut = 15000,
            CukurKumis = 5000;

    public Super(String Name, String Member) {
        this.Name = Name;
        this.Member = Member;
    }
    
    public void getBill() {
        
    }
    
    public abstract void Service(String Service);
    public abstract void Goods(String Goods);
}
