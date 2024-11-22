package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garaje {
    private String name;
    private String address;
    private String Vehicle;

    public Garaje(String name, String direction, String Vehicle[]) {
        this.name = name;
        this.address = direction;
        this.Vehicle[] = Vehicle;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return address;
    }

    public String[] getVehicle() {
        return Vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirection(String direction) {
        this.address = direction;
    }

    public void setVehicle(String[] vehicle) {
        Vehicle = vehicle[];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garaje garaje = (Garaje) o;
        return Objects.equals(name, garaje.name) && Objects.equals(address, garaje.address) && Objects.deepEquals(Vehicle, garaje.Vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, Arrays.hashCode(Vehicle));
    }

}



























