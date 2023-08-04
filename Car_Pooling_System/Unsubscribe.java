package Car_Pooling_System;

public class Unsubscribe extends Passenger {

    private boolean isCoupon = true;


    public Unsubscribe(String name, String id, Car car, boolean isCoupon) {
        super(name, id, car);
        this.isCoupon = isCoupon;
    }

    @Override
    public double reserved_Car() {
        double cost = getCar().getFixed_route().getTrip_price();
        double pass_number = getCar().getMax_cap_pass_trip();
        try {
            if (pass_number==0){
                throw new IllegalArgumentException("The Passengers Capacity is Zero, must be at least 1 !!");
            } else if (isCoupon){
                return super.setTrip_cost(cost-cost*0.1) ;
            } else return super.setTrip_cost(cost);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return 0;
        }

    }

    @Override
    public void displayInfo() {
        System.out.println("The Name: "+getName());
        System.out.println("The Id: "+getId());
        System.out.println("The Trip Cost: "+getTrip_cost());
        System.out.println("Car Code: " +getCar().getCode());
        System.out.println("Number of Passenger: "+getCar().getMax_cap_pass_trip());
        System.out.println("The Distination is: "+getCar().getFixed_route().getDest_addr());
    }
}
