import java.util.Random;
class RandomNumberGenerate extends Thread{
    public void run(){
        Random ram = new Random();
        int rn1 = ram.nextInt(50);
        System.out.println(rn1);

        if(rn1%2 == 0){
            SqThread st = new SqThread(rn1);
			st.start();
        }
        else {
            CuThread ct = new CuThread(rn1);
            ct.start();
        }
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ex) {
            System.out.println(ex);
        }
    } 
} 
//class for square thread
class SqThread extends Thread {
    int number;
    SqThread(int rnum) {
		number = rnum;
    }
    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}
// class for cube thread
class CuThread extends Thread {
	int number;
	CuThread(int number2) {
		number = number2;
	}
	public void run() {
		System.out.println("Cube of " + number + " = " + (number * number * number));
	}
}

//driving class
public class Threethread{
    public static void main(String[] args) {
        RandomNumberGenerate rm = new RandomNumberGenerate();
        rm.start();
    }
}
