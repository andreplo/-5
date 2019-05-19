public class Collaboration 
{
    private int ID , collaborator;
    public Collaboration()
    {
        
    }
    
    public Collaboration(Business a , Freelancer b)
    {
        this.ID = a.getID();
        this.collaborator = b.getID();
    }
    
}
