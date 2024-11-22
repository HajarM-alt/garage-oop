package org.ies.vehicles.model;
import java.util.Arrays;
import java.util.Objects;

public class Garaje {
    private String name;
    private String direction;
    private String Vehicle[];

  public Garaje(String name, String direction, String Vehicle[] ){
      this.name = name;
      this.direction = direction;
      this.Vehicle = Vehicle;
  }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public String[] getVehicle() {
        return Vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setVehicle(String[] vehicle) {
        Vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garaje garaje = (Garaje) o;
        return Objects.equals(name, garaje.name) && Objects.equals(direction, garaje.direction) && Objects.deepEquals(Vehicle, garaje.Vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, Arrays.hashCode(Vehicle));
    }

}



























