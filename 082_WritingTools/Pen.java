public class Pen extends WritingTool {
    private String inkColor;
    
    public Pen(String type, String inkColor) {
        super(type);
        this.inkColor = inkColor;
    }
    
    public void draw() {
        System.out.println("Using the " + inkColor + " pen to draw.");
    }
}