public class NameData {
    public static void main(String[] args) {
    NameTransmogrifier name = new NameTransmogrifier("Mia");
    //making a new object
    System.out.println(name.name);
    System.out.println(name.nameReversed);
    System.out.println(name.nameUpperCase);
    System.out.println(name.nameLowerCase);
    System.out.println(name.nameLength);
    System.out.println(name.nameFirstLetter);
    System.out.println(name.nameLastLetter);
    }
}