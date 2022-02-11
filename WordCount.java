import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException
    {
        File txt = new File("./lear.txt");
        FileInputStream fileio = new FileInputStream(txt);
        InputStreamReader inputio = new InputStreamReader(fileio);
        BufferedReader bufferedReader = new BufferedReader(inputio);
  
        String line;
        int word = 0;
        int cc = 0;
        int linec = 0;

        while ((line = bufferedReader.readLine()) != null) {
                cc += line.length();
                String words[] = line.split("\\s+");
                word += words.length;
                String sentence[] = line.split("[!?.:]+");
                linec += sentence.length;
            
        }
        System.out.println("Total word count = " + word);
        System.out.println("Total number of lines = " + (linec-1));
        System.out.println("Total number of characters = " + cc);
    }
}