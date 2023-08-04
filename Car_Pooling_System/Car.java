package Car_Pooling_System;

public class Car  {
    private String code;
    private Route fixed_route;
    private double max_cap_pass_trip;


    public Car(String code, Route fixed_route, double max_cap_pass_trip) {
        this.code = code;
        this.fixed_route = fixed_route;
        this.max_cap_pass_trip = max_cap_pass_trip;
    }

    public Car(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixed_route() {
        return fixed_route;
    }

    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }

    public double getMax_cap_pass_trip() {
        return max_cap_pass_trip;
    }

    public void setMax_cap_pass_trip(double max_cap_pass_trip) {
        if (max_cap_pass_trip==0){
            System.out.println("Zero Number of Capacity");
        } else {
            this.max_cap_pass_trip = max_cap_pass_trip;
        }
    }

}
