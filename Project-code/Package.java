
public class Package 
{
    private String package_Name , gewgrafikh_perioxh;
    private int owner , package_dates;
    private double packagePrice;
    public Package()
    {
        
    }
    
    public Package(String a , int b , String c , int d)
    {
        this.package_Name = a;
        this.package_dates = b;
        this.gewgrafikh_perioxh = c;
        this.owner = d;
    }
    
   
    
    public void showPackage()
    {
        System.out.println("Ayto einai to paketo");
    }
    
    public void browsePackage()
    {
        System.out.println("Bre8hke to paketo");
    }
    
    public void package_info()
    {
        System.out.println("Plhrofories paketou");
    }
    
    public void services_of_package()
    {
        System.out.println("Ta services toy paketoy");
    }
}
