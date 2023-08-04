package Car_Pooling_System;

public abstract class Passenger {
    private String name;
    private String id;
    private Car car;

    private Double trip_cost;


    public Passenger(String name, String id ,Car car) {
        this.name = name;
        this.id = id;
        this.car  = car;

    }



    public abstract double reserved_Car();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getTrip_cost() {
        return trip_cost;
    }

    public double setTrip_cost(Double trip_cost) {

        return  this.trip_cost = trip_cost;
    }

    public abstract void displayInfo();











}
