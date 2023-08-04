package Car_Pooling_System;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Route r1 = new Route("Hail", "Riyadh",200);
        Car c1 = new Car("HHR123",r1,2);

        Route r2 = new Route("Dammam","Jeddah",500);
        Car c2 = new Car("FFG432",r2,0);


        try {
            Passenger[] passengers = new Passenger[3];
            passengers[0] = new Subscribe("Majed", "1", c1);
            passengers[1] = new Unsubscribe("Farhan", "2", c2, true);
            passengers[2] = new Unsubscribe("Mohamad","3",c1,false);
            for (int i = 0; i < passengers.length; i++) {
                System.out.println("Trip Cost: " + passengers[i].reserved_Car());
                System.out.println("--------");
                passengers[i].displayInfo();
                System.out.println("-----------------------------");
            }
        } catch (IndexOutOfBoundsException e1){
            System.out.println("Array Index out of Bound");
        } catch (Exception e2){
            System.out.println("Something Wrong");
        }


    }
}
