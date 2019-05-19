public class User 
{

    private int id;
    private String email , name , password;
    
    
    public User(int a)
    {
        this.id = a;
    }
    
    public User(int a , String b , String c , String d )
    {
        this.id = a;
        this.name = b;
        this.password = c;
        this.email = d;
        
    }
    
    public void  setName(String a)
    {
        this.name = a;
    }
    
    public void setPassword(String a)
    {
        this.password = a;
    }
    
    public void setEmail(String a)
    {
        this.email = a;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public int getID()
    {
        return this.id;
    }
    
}
