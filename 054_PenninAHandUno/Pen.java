public class Pen {
    private String colorOfInk;
    private String colorOfPen;
    private boolean cap = true;
    private int inkRemaining;

    public Pen() {
        colorOfInk = "blick";
        colorOfPen = "red";
        inkRemaining = 5;
    }

    public Pen(String ci, String cp, int ir, boolean isCap){
        colorOfInk = ci;
        colorOfPen = cp;
        inkRemaining = ir;
        cap = isCap;
    }
    
    public static void main(String[] args) {
        
    }
}
