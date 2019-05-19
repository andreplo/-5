public class Administrator extends User
{
    private String Onoma , Dikaiwmata;
    public Administrator(int a)
    {
        super(a);
    }
    
    public Administrator(int a , String b , String c , String d , String e , String f)
    {
        super(a,b,c,d);
        this.Onoma = e;
        this.Dikaiwmata = f;
        
    }
    
    public void getRequests()
    {
        System.out.println("Ta aithmata sas einai ta");
    }
    
}
