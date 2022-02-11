import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook{
    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        Scanner ic=new Scanner(System.in);

        int input;
        do {
            System.out.println("Enter 1 for 'To add contact' \n "+"Enter 2 for 'Search contact' "+" \n" + "Enter 3 for 'Exit");
            input = ic.nextInt();

            if (input == 1) {
                System.out.println("Enter Name and Phone Number");
                String name = ic.next();
                String number = ic.next();
                map.put(name, number);
            }
            else if (input == 2) {
                System.out.println("Enter Contact Name");
                String searchName = ic.next();
                if(map.containsKey(searchName) ){ 
                System.out.println(map.get(searchName));
                }
                else{
                    System.out.println("Name does not match");
                }
            }
        }while(input!=3);
        
    }
}