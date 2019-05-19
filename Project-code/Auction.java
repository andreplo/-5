
public class Auction 
{
    
    private int id , deadline;
    private String description;
    
    public Auction()
    {
        
    }
    
    public Auction(int a , int b , String c)
    {
        
        this.id = a;
        this.deadline = b;
        this.description = c;
        
    }
    
    public void showAuction()
    {
        System.out.println("Ta xarakthristika ths dhmoprasias");
    }
    
    public void showRequests()
    {
        System.out.println("Deiikse tis dhmoprasies");
    }
    
    public void acceptRequest()
    {
        System.out.println("Dhmoprasia egkri8hke");
    }
}
