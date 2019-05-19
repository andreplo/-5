public class Freelancer extends User
{
    private String Eidos , Perioxh;
    
    public Freelancer(int a)
    {
        super(a);
    }
    
    public Freelancer(int a , String b , String c , String d , String e , String f)
    {
        super(a,b,c,d);
        this.Eidos = e;
        this.Perioxh = f;
        
    }
    
    public  void collaborationRequests()
    {
        System.out.println("Emfanizei ta incoming Requests.");
    }
    
}
