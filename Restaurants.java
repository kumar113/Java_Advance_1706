import java.util.Scanner;
import java.util.ArrayList;

//Dish Class 
class Dish{
    int dishID;
    String dishName;
    private String creationTime;
    
    public Dish(int dishID, String dishName, String creationTime) {
        super();
        this.dishID=dishID;
        this.dishName=dishName;
        this.creationTime=creationTime;
    }
    @Override
    public String toString(){ return "Dish [dishID=" + dishID + ", DishName=" + dishName + ", CreationTime=" + creationTime +  "]";  }
}
class ManuForRestaurants{
    static {
        ArrayList<Dish> menuListArr = new ArrayList<Dish>();
        menuListArr.add(new Dish(01,"Dosa","9:00 AM"));
        menuListArr.add(new Dish(02,"Bread Sandwich","6:00 PM"));
        menuListArr.add(new Dish(03,"Butter Naan","8:00 PM"));
        for( Dish d: menuListArr){
            System.out.println(d.dishName);
        }
    }
          
                 
}

public class Restaurants{
    public static void main(String[] args)
    {
        int ch;
        Scanner ic= new Scanner(System.in);
        System.out.println("Press 1 to 'Display Dishes' ");
        System.out.println("Press 2 to 'Search Dish'");
        ch=ic.nextInt();
        if(ch==1){
            System.out.println("List of dishes:");
            ManuForRestaurants c1= new ManuForRestaurants();
        }
        if(ch==2){
           int val;
           val=ic.nextInt();
            ArrayList<Dish> menuListArr=new ArrayList<Dish>();
            menuListArr.add(new Dish(01,"Dosa","9:00 AM"));
            menuListArr.add(new Dish(02,"Bread Sandwich","6:00 PM"));
            menuListArr.add(new Dish(03,"Butter Naan","8:00 PM"));
            for( Dish d: menuListArr)
            {
                if(val==d.dishID){
                    System.out.println(d);
                    break;
                }
            }
        }
    }
}