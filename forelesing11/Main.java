package forelesing11;

import forelesing11.models.Persons;
import forelesing11.util.UniConverter;

public class Main {
    public static void main(String[] args) {
        Persons person1 = new Persons("12345678910");
        System.out.println("Birth number: " + person1.getBirthNumber());

        double result1 = UniConverter.cmTometer(600);
        double result2 = UniConverter.meterToCm(250);



        double result3 = UniConverter.meterToKm(3400);
        System.out.println("Result in kilometers: " + result3 + "km");
        
        double result4 = UniConverter.kmToMeter(6.845);
        System.out.println("Result 6.845: " + result4 + " meter");
        System.out.println("cm/meter convention factor: " + UniConverter.CM_METER_FACTOR);

        System.out.println();
        System.out.println("PI is : " + Math.PI);
        System.out.println("the square root of 25: " + Math.sqrt(25));
        System.out.println("5 to the power of 2 is : " + Math.pow(5, 2));

        System.out.println("Today: " + java.time.LocalDate.now());

    }
}
