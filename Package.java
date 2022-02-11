/*  package P;
    package P1;
    package P2;
    import P1.*;
    import P2.*;*/


/*Package P1*/
class TwoDim {
    private int x;
    private int y;
    public TwoDim() {
        this.x = 0;
        this.y = 0;
    }
    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
    return "Coordinate: x = " + x + " y = " + y;
    }
   }

/*Package P2*/
   
class ThreeDim extends TwoDim {
    private int z;
    public ThreeDim() {
    super(0, 0);
    this.z= 0;
    }
    public ThreeDim(int x, int y, int z) {
    super(x, y);
    this.z = z;
    }
    @Override
    public String toString() {
    return super.toString() + " z= " + z;
    }
}
   /*Package P(Main)*/
public class Package{
    public static void main(String[] args) {
    TwoDim pack;
    pack = new TwoDim(4, 2);
    System.out.println(pack);
    pack = new ThreeDim(1, 2, 3);
    System.out.println(pack);
    }
}