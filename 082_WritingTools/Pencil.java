public class Pencil extends WritingTool {
    public Pencil(String type, int hardness) {
        super(type);
    }
    
    public void erase() {
        System.out.println("Using the pencil to erase.");
    }
}