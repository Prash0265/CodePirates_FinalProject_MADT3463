public class Car extends Vehicle {
    String gear;
    String type;

    public Car(String make, String plate, String color, String category, String gear, String type ) {

        super(make, plate,color, category);
        this.gear = gear;
        this.type = type;

    }

    @Override
    public String toString() {
        String vehicleDescription;
        vehicleDescription = "\t - make:"+getMake()+"\n";
        vehicleDescription += "\t - plate:"+getPlate()+"\n";
        vehicleDescription += "\t - color:"+getColor()+"\n";
        vehicleDescription += "\t - category:"+getCategory()+"\n";
        vehicleDescription += "\t - gear type:"+gear+"\n";
        vehicleDescription += "\t - type:"+type+"\n";
        return super.toString()+ "Employee has a car: \n" + vehicleDescription;
    }

}
