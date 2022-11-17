public class BlackjackOne {
    public static void main(String[] args) {
        String [] number = new String []{"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int index = (int) (Math.random()*number.length);
        System.out.println(number[index]);
        
        
    }
    
}
