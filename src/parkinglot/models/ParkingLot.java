package parkinglot.models;

import parkinglot.models.enums.VehicleType;

public class ParkingLot extends BaseEntity {

    private int id;

    private int floors;

    private long capacity;

    private Gate entryGate;

    private Gate exitGate;

    private VehicleType vehicleType;

    private String address;


}
