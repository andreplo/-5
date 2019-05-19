public class Create_Event
{
    private String category , location;
    private int Atoma , event_date;
    private boolean finalised;
    private Service[] servs = new Service[10];
    private Package[] packs = new Package[10];
    public Create_Event()
    {
        
    }
    
    public Create_Event(String a, int b , int c , String d)
    {
        this.category = a;
        this.Atoma = b;
        this.event_date = c;
        this.location = d;
        this.finalised = false;
    }
    
    public void setDate(int a)
    {
        this.event_date = a;
    }
    
    public void setLocation(String a)
    {
        this.location = a;
    }
    
    public void confirmServices(Service a)
    {
        System.out.println("Service Confirmed");
    }
    
    public void confirmPackage(Package a)
    {
        System.out.println("Package Confirmed");
    }
    
    public void finalise_Event()
    {
        this.finalised = true;
    }
    
    public void payEvent()
    {
        System.out.println("Diey8ethmeno");
    }
    
    public void enterFields()
    {
        System.out.println("Eisagete pedia");
    }
    
    
}

