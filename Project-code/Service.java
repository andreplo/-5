
public class Service {
    private String Category , name , description , location;
    private int id;
    private double price;
    
    public Service()
    {
        
    }
    
    public Service(String a , String b , int c , String d , String e )
    {
        this.Category = a;
        this.name = b;
        this.id = c;
        this.description = d;
        this.location = e;
    }
    
    
    
   
    public void belongsToPackage(Service a)
    {
        System.out.println("Belongs or Not");
    }
    
    public void showService(Service a)
    {
        System.out.println("Auto einai to Service!");
    }
    
    public void setPrice(double a)
    {
        this.price = a;
        
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public String getCategory()
    {
        return this.Category;
    }
}
