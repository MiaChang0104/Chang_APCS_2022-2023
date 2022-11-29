public class SweetGarage {
    public static void main(String[] args) {
        Car car = new Car();
        //Don't need add anything in ()
        System.out.println(car.year);
        System.out.println(car.milesDriven);
        System.out.print(car.manufacturerName);
        System.out.println(car.modelName);
        Car car1 = new Car(2011,201,"M","4",true );
        System.out.println(car1.year);
        System.out.println(car1.milesDriven);
        System.out.print(car1.manufacturerName);
        System.out.println(car1.modelName);
        Car car2 = new Car(2012,200,"A","4",true );
        System.out.println(car2.year);
        System.out.println(car2.milesDriven);
        System.out.print(car2.manufacturerName);
        System.out.println(car2.modelName);
        Car car3 = new Car(2013,199,"C","4",true );
        System.out.println(car3.year);
        System.out.println(car3.milesDriven);
        System.out.print(car3.manufacturerName);
        System.out.println(car3.modelName);
        Car car4 = new Car(2014,198,"D","4",true );
        System.out.println(car4.year);
        System.out.println(car4.milesDriven);
        System.out.print(car4.manufacturerName);
        System.out.println(car4.modelName);
    }
}

/*

1/1 - Compiles?
1/1 - Accurate versus the instructions?
1/1 - Formatting?
1/1 Comments

 */