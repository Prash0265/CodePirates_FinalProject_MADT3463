public class Motorcycle extends Vehicle {
    Boolean sidecar;

    public Motorcycle(String make, String plate, String color, String category, Boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;

    }

    @Override
    public String toString() {
        String vehicleDescription;
        vehicleDescription = super.toString();
        vehicleDescription += "\t - sidecar:"+sidecar+"\n";
        return "Employee has a car: \n" + vehicleDescription;
    }
}
