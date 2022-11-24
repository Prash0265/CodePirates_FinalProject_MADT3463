public class Car extends Vehicle {
    String gear;
    String type;

    public Car(String make, String plate, String color, String category, String gear, String type ) {

        super(make, plate,color, category);
        this.gear = gear;
        this.type = type;

    }


}
