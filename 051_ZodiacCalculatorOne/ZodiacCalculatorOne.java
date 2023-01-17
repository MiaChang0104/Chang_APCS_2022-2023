import java.util.Scanner;
public class ZodiacCalculatorOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name here:");
        String name = scan.nextLine();
        System.out.println("What year were you born?:");
        int age = scan.nextInt();
        ageUse(age);

    }
    public static void ageUse(int age){
        if(age<1972){
            System.out.println("Sorry");
        }else if(age==1972 || age==1984 || age==1996 || age== 2008 || age== 2020){
            System.out.println("Your Chinese Zodiac is Rat");
        }else if(age==1973 || age==1985 || age== 1997 || age== 2009 || age== 2021){
            System.out.println("Your CHinses Zodiac is Ox");
        }else if(age==1974 || age==1986 || age== 1998 || age== 2010 || age== 2022){
            System.out.println("Your CHinses Zodiac is Tiger");
        }else if(age==1975 || age==1987 || age== 1999 || age== 2011){
            System.out.println("Your CHinses Zodiac is Rabbit");
        }else if(age==1976 || age==1988 || age== 2000 || age== 2012 ){
            System.out.println("Your CHinses Zodiac is Dragon");
        }else if(age==1977 || age==1989 || age== 2001 || age== 2013 ){
            System.out.println("Your CHinses Zodiac is Snake");
        }else if(age==1978 || age==1990 || age== 2002 || age== 2014 ){
            System.out.println("Your CHinses Zodiac is Horse");
        }else if(age==1979 || age==1991 || age== 2003 || age== 2015 ){
            System.out.println("Your CHinses Zodiac is Sheep");
        }else if(age==1980 || age==1992 || age== 2004 || age== 2016 ){
            System.out.println("Your CHinses Zodiac is Monkey");
        }else if(age==1981 || age==1993 || age== 2005 || age== 2017 ){
            System.out.println("Your CHinses Zodiac is Rooster");
        }else if(age==1982 || age==1994 || age== 2006 || age== 2018 ){
            System.out.println("Your CHinses Zodiac is Dog");
        }else if(age==1983 || age==1995 || age== 2007 || age== 2019 ){
            System.out.println("Your CHinses Zodiac is Pig");
        }
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
0/1 Comments

These comments are pretty weak. I need more going forward.

 */