package Car_Pooling_System;

public class Route {

    private String start_pickup_addr;
    private String dest_addr;
    private double trip_price ;

    public Route(String start_pickup_addr, String dest_addr, double trip_price) {
        this.start_pickup_addr = start_pickup_addr;
        this.dest_addr = dest_addr;
        this.trip_price = trip_price;
    }

    public String getStart_pickup_addr() {
        return start_pickup_addr;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }

    public void setStart_pickup_addr(String start_pickup_addr) {
        this.start_pickup_addr = start_pickup_addr;
    }

    public String getDest_addr() {
        return dest_addr;
    }

    public void setDest_addr(String dest_addr) {
        this.dest_addr = dest_addr;
    }


}
