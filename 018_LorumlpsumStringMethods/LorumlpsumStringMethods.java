public class LorumlpsumStringMethods {
    public static void main(String[] args) {
        String world = "Lorem ipsum dolor sit amet Dolor purus quen non enim praesent elementum facilisis leo. Odio ut enim blandit volutpat maecenas. Nibh mauris cursus mattis molestie. Ornare suspendisse sed nisi lacus sed viverra.";
        System.out.println(world.length());
        String first = "Lorem ipsum dolor sit amet Dolor purus quen non enim praesent elementum facilisis leo. Odio ut enim blandit volutpat maecenas. Nibh mauris cursus mattis molestie.";
        String first2= first.toUpperCase();
        String first3= first.toLowerCase();
        System.out.println(first.length());
        System.out.println(first2);
        System.out.println(first3);
        if (world == first){
            System.out.println("They are same");
        }   else {
            System.out.println("No");
        }
        if (first2 ==first){
            System.out.println("Same");
        }   else{
            System.out.println("No");
        }
        System.out.println(first.indexOf("q"));
        System.out.println(first.replace("o", "x"));
        System.out.println(first.indexOf("z"));
        //if it don't have z will show -1
    }
}