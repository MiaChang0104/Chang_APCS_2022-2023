public class AreasOfRectangles {
    public static void main(String[] args) {
        double inch=30.48;
        double mm=0.1;
        double cm=1;
//All units of calculation are converted to centimeters
        double Rec1Arealnlnches=5.5*inch*7.8*inch;
        double Rec2Arealnlnches=99.4*cm*500.352*cm;
        double Rec3Arealnlnches=75*inch*800*cm;
        double Rec4Arealnlnches=600000*cm*8343491034d*mm;
        System.out.println("The first one is "+Rec1Arealnlnches+"cm. The second one is "+Rec2Arealnlnches+"cm. The Third one is "+Rec3Arealnlnches+"cm. The last one is "+Rec4Arealnlnches+"cm.");
    }   
}


/*

1/1 - Compiles?
0/1 - Accurate versus the instructions?
-Most of this stuff is supposed to be stored out in unique varaibles, as per the isntructions.

1/1 - Formatting?
1/1 Comments

 */