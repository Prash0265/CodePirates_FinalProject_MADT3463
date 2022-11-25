public class Vehicle {
    String make;
    String plate;
    String color;
    String category;
    public Vehicle(String make, String plate, String color, String category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }


    public String getCategory() {
        return category;
    }


    public String toString() {
        String vehicleDescription;
        vehicleDescription = "\t - make:"+getMake()+"\n";
        vehicleDescription += "\t - plate:"+getPlate()+"\n";
        vehicleDescription += "\t - color:"+getColor()+"\n";
        vehicleDescription += "\t - category:"+getCategory()+"\n";
        return vehicleDescription;
    }
}
