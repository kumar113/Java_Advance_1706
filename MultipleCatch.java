
public class MultipleCatch {  
    public static void main(String[] args) {  
          int a=10,b=0;
           try{    
                int arr[]=new int[5];    
                arr[5]=a/b;    
            }    
            catch(ArithmeticException e)  
                {  
                   System.out.println("Arithmetic Exception occurs");  
                }    
            catch(ArrayIndexOutOfBoundsException e)  
                {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                }    
            catch(Exception e)  
                {  
                   System.out.println("Parent Exception occurs");  
                }     
    }  
}  
