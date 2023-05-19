import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        
        // 生成一个随机整数
        int randomNumber = random.nextInt();
        System.out.println("随机整数: " + randomNumber);
        
        // 生成一个指定范围内的随机整数（1到1000之间）
        int randomInRange = random.nextInt(120) + 1;
        System.out.println("1到1000之间的随机整数: " + randomInRange);
        
        // 生成一个随机浮点数（0.0到1.0之间）
        double randomDouble = random.nextDouble();
        System.out.println("随机浮点数: " + randomDouble);
    }
}