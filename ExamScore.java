import java.io.*;

public class ExamScore   {
    int[] ExamScoreArray;
    public void initExamScore () {
    ExamScoreArray = new int[11];
    for (int i = 0; i <= 10; i++) {
        ExamScoreArray[i] = 0;
        }
    }

public   void readScoresIntoExamScore () {
    try {
        BufferedReader rd = new BufferedReader(new FileReader(DATA_FILE));
        while (true) {
            String line = rd.readLine();
            if (line == null) break;
            int score = Integer.parseInt(line);
            if (score < 0 || score > 100) {
        	System.out.print("That score is out of range");
			} else{
            	int range = score / 10;
                ExamScoreArray[range]++;
                }
            }
        } catch (IOException ex) {
        	 System.out.println(ex);
            }
        }
		
public void printExamScore () {
    for (int range = 0; range <= 10; range++) {
         String label;
        switch (range) {
            case 0:
                label = "00-09";
                break;
            case 10:
                label = "  100";
                break;
            default:
                label = (10 * range) + "-" + (10 * range + 9);
                break;
              }
            String stars = createStars(ExamScoreArray[range]);
            System.out.println(label + ": " + stars);
    }
}

public String createStars ( int n){
    String stars = "";
    for (int i = 0; i < n; i++) {
        stars += "*";
    }
    return stars;
}
private static final String DATA_FILE = "./midterm.txt";
 public void run () {
            initExamScore();
            readScoresIntoExamScore();
            printExamScore();
}
public static void main(String... args) {
            ExamScore obj=new ExamScore();
            obj.run();

         }

}