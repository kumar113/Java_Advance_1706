import java.io.*;
import java.util.*;

import static java.lang.System.out;

public class EmployeeData {
    private int empID;
    private String empName;
    private int empAge;

    public Integer getEmpID() {return empID; }

    public void setEmpID(Integer empID) { this.empID = empID;  }

    public String getEmpName() {  return empName; }

    public void setEmpName(String empName) { this.empName = empName; }

    public int getempAge() { return empAge; }

    public void setempAge(int empAge) { this.empAge = empAge; }

    static {
        try {

            ArrayList<String> empList = new ArrayList<>();
            File file = new File("./Employee.txt");

            String line;
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                System.out.print(empList);
                while ((line = br.readLine()) != null) {
                    if (line.contains("Aman"))
                        line = line.replace("jatin", "Sachin");
                    line = line.replace("26", "20");
                    empList.add(line);
                }
                fr.close();
                br.close();

                FileWriter fw = new FileWriter(file);
                BufferedWriter out = new BufferedWriter(fw);
                System.out.print(empList);
                for (String s : empList)
                    out.write(s);
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            out.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main (String[]args) throws FileNotFoundException {
        
    }


}