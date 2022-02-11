import java.io.File;
import java.util.Date;

public class LastModifiesTime {
       public static void main(String[] args) {

       File file = new File("./random.txt");

       Date date=new Date(file.lastModified());
	   System.out.println("\n Modified time of the file was: "+date+"\n");	   
     }
}