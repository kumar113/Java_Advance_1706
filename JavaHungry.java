public class JavaHungry {
    public static void main(String args[])
    {
        try 
        {   
            int arr[]= {1, 2, 3, 4, 5}; 
            for (int i = 0; i <= 5; i++) 
            { 
                System.out.print ("Array elements are : " + arr[i] + "\n"); 
            } 
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception : " + e); 
        } 
        catch (ArrayIndexOutOfBoundsException ex) 
        { 
            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex); 
        }  
    }
}
//Answer: This program will show an error like "Exception ArrayIndexOutOfBoundsException has already been caught".
//Explanation:Mentioned error has occured because the same ArrayOutOfBounds Exception was mentioned in the base class of the program in line number 12 
//during catch(e) and then again in line 16, subclass exception as catch(ArrayIndexOutOfBounds) mentioned again, thus the same error has been caught twice.