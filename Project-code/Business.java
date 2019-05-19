public class Business extends User
{
    
    private String business_name , owner;
    private boolean certified;
    private Service[] servs = new Service[100];
    private Package[] packs = new Package[100];
    
    public Business(int a)
    {
        super(a);
    }
    
    public Business(int a , String b , String c , String d , String e , String f)
    {
        super(a,b,c,d);
        this.business_name = e;
        this.owner = f;
        this.certified = false;
        
    }
    
    public void uploadCertificate()
    {
        System.out.println("Upload your certificate");
    }
    
    public void addService(Service a)
    {
        System.out.println("Proste8hke!");
    }
    
     public void cancelService(Service a)
    {
        System.out.println("Service Cancelled!");
    }
    
      public void addPackage(Package a)
    {
        System.out.println("Proste8hke Paketo");
    }
    
      
}
