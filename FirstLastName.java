import java.util.*;
public class FirstLastName {
  public static void main(String[] args) {
      int option;
      String fstName;
      String lstName;
      Vector<String> vc = new Vector<>();
      try{
        do{
            System.out.println("Enter 1 for Enter Name \n 2 for Information \n 3 for Exit.");
            Scanner ic = new Scanner(System.in);
            option = ic.nextInt();
            if(option ==1){
                System.out.println("Enter First and Last Name of the person");
                fstName = ic.next();
                lstName = ic.next();
                vc.add(fstName + " " + lstName);
            }
            else if(option ==2)
                System.out.println(vc);

        }while(option !=3);
        
      }
      catch(Exception E){
            System.out.println(E);
      } 
    }
}

