public class Desk {
    private static final Pen Pencil = null;
    private static final Pencil Pen = null;

    public static void main(String[] args) {
        WritingTool tool = new WritingTool("Generic Tool");
        Pen pen = new Pen("Blue", null);
        Pencil pencil = new Pencil(null, 2);
        
        System.out.println("Is WritingTool an instance of Pen? " + (tool instanceof Pen));
        System.out.println("Is WritingTool an instance of Pencil? " + (tool instanceof Pencil));
        System.out.println("Is Pen an instance of WritingTool? " + (pen instanceof WritingTool));
        System.out.println("Is Pen an instance of Pencil? " + (Pen instanceof Pencil));
        System.out.println("Is Pencil an instance of WritingTool? " + (pencil instanceof WritingTool));
        System.out.println("Is Pencil an instance of Pen? " + (Pencil instanceof Pen));
    }
}