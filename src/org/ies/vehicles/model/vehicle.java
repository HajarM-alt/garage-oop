package org.ies.vehicles.model;

import java.util.Objects;

public class vehicle {
    private VehicleType VehicleType;
    private int maxSpeed;
    private String color;
    private String plate;


    public vehicle(org.ies.vehicles.model.VehicleType vehicleType, int maxSpeed, String color, String plate) {
        VehicleType = vehicleType;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.plate = plate;
    }

    public org.ies.vehicles.model.VehicleType getVehicleType() {
        return VehicleType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }

    public void setVehicleType(org.ies.vehicles.model.VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vehicle vehicle = (vehicle) o;
        return maxSpeed == vehicle.maxSpeed && VehicleType == vehicle.VehicleType && Objects.equals(color, vehicle.color) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VehicleType, maxSpeed, color, plate);
    }

    @Override
    public String toString() {VehicleType;
        return "vehicle{" +
                "VehicleType=" + VehicleType +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }

}






















