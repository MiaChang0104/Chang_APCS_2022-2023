public class WritingTool {
    protected String type;
    
    public WritingTool(String type) {
        this.type = type;
    }
    
    public void write() {
        System.out.println("Using the " + type + " to write.");
    }
}