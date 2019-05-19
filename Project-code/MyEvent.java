import java.util.Scanner;
public class MyEvent {

    public static void main(String[] args) 
    {
        User[] user_array = new User[200];
        int end = 0 ,  user_counter = 1 , idz = 1;
        Scanner sc = new Scanner(System.in);
        
        while(end !=1)
        {
        System.out.println("Select a type of User:");
        System.out.println("1)Business\n" + "2)Freelancer\n" + "3)Administrator\n" + "4)Customer\n" + "5)Exit" );
        int i = sc.nextInt();
        System.out.println("H epilogh sas einai:" + i);
        
        switch(i)
        {
            case 1:
             System.out.println("Epi8ymeite na synde8eite ws Business");
             
             
             System.out.println("Dwste onoma xrhsth.");
             String name = sc.next();
             System.out.println("Dwste password.");
             String pass = sc.next();
             System.out.println("Dwste email.");
             String em = sc.next();
             System.out.println("Dwste onoma epixeirhshs");
             String on_ep = sc.next();
             System.out.println("Dwste onoma idiokthth.");
             String on_id = sc.next();
             Business b = new Business(idz,name,pass,em,on_ep,on_id);
             System.out.println("H epixeirhsh dhmioyrgh8hke alla den einai pistopoihmenh!");
             user_array[user_counter] = b;
             idz += 1;
             
             break;
             
            case 2:
             System.out.println("Synde8hkate ws Freelancer");
             System.out.println("Dwste onoma xrhsth.");
              name = sc.next();
             System.out.println("Dwste password.");
              pass = sc.next();
             System.out.println("Dwste email.");
             em = sc.next();
             System.out.println("Epilekste eidos");
             String eidos = sc.next();
             System.out.println("Dwste Perioxh");
             String perioxh = sc.next();
             Freelancer f = new Freelancer(idz,name,pass,em,eidos,perioxh);
             System.out.println("To profile dhmioyrgh8hke");
             user_array[user_counter] = f;
             idz += 1;
             
             break;
             
            case 3:
             System.out.println("Synde8hkate ws Administrator");
             System.out.println("Dwste onoma xrhsth.");
              name = sc.next();
             System.out.println("Dwste password.");
              pass = sc.next();
             System.out.println("Dwste email.");
             em = sc.next();
             System.out.println("Dwste onoma ypey8ynoy.");
             String on_yp = sc.next();
             System.out.println("Dwste dikaiwmata.");
             String dik = sc.next();
             Administrator ad = new Administrator(idz,name,pass,em,on_yp,dik);
             user_array[user_counter] = ad;
             
             idz += 1;
             break;   
             
            case 4:
             System.out.println("Synde8hkate ws Customer");
             break;
             
            case 5:
             System.out.println("Epileksate Eksodo");
             end = 1;
             break;
        }
        user_counter += 1;
        }
        
       
        
    }
    
}
