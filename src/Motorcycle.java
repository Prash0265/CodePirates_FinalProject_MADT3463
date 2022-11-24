public class Motorcycle extends Vehicle {
    Boolean sidecar;

    public Motorcycle(String make, String plate, String color, String category, Boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;

    }

    @Override
    public String toString() {
        String vehicleDescription;
        vehicleDescription = "\t - make:"+getMake()+"\n";
        vehicleDescription += "\t - plate:"+getPlate()+"\n";
        vehicleDescription += "\t - color:"+getColor()+"\n";
        vehicleDescription += "\t - category:"+getCategory()+"\n";
        vehicleDescription += "\t - sidecar:"+sidecar+"\n";
        return super.toString()+ "Employee has a car: \n" + vehicleDescription;
    }
}
