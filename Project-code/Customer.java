public class Customer extends User{
    private String firstName , lastName;
    private int dateOfbirth;
    
    
    public Customer(int a)
    {
        super(a);    
    }
    
    public Customer(int a , String b , String c , String d , String e , String f , int g)
    {
        super(a,b,c,d);
        this.firstName = e;
        this.lastName = f;
        this.dateOfbirth = g;
        
        
    }
    
    public void create_Auction()
    {
        System.out.println("8a psaxnei gia kati sygkekrimeno");
    }
    
    public void requestService(Service a)
    {
        System.out.println("zhteitai h sygkekrimenh Service");
    }
    
    public void requestPackage(Package a)
    {
        System.out.println("Zhteitai to sygkekrimeno package");
    }
    
    
}
