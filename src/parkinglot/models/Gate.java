package parkinglot.models;

import parkinglot.models.enums.GateType;
import parkinglot.models.enums.VehicleType;

public class Gate extends BaseEntity{

    private int id;

    private GateType gateType;

    private VehicleType vehicleType;

    private String status;

    private Operator operator;

}
