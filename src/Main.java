public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[6];

        Motorcycle v1 = new Motorcycle("Kawasaki", "Custom Plate","Yellow", "Race Motorcycle", false);
        Motorcycle v2 = new Motorcycle("Honda", "Custom Plate","Black", "Not for Race", true);
        Car v3 = new Car("Lamborghini", "Custom Plate","White", "Family", "Manual","Sport" );
        Car v4 = new Car("BMW", "Custom Plate","Black", "Family", "Automatic","Sedan" );
        Car v5 = new Car("Renault Clio", "Custom Plate","Blue", "Family", "Manual","Hatchback" );
        Car v6 = new Car("Mazda", "Custom Plate","White", "Family", "Automatic","SUV" );
        System.out.println("Test 1:");
        int length = employees.length;
        employees[0] = new Manager("Serge", 1985, 30, 4, 100);
        employees[1] = new Manager("Cindy", 1974, 20 , 6, 80) ;
        employees[2] = new Programmer("Paul", 1993, 3,  75);
        employees[3] = new Tester("Pierre", 1987, 124, 50 );
        employees[4] = new Programmer("Matt", 1981, 5 , 110);
        employees[5] = new Programmer("Sarah", 1986, 3 , 100);

        System.out.println(" ");
        System.out.println("Test 2:");
//        employees[0] = new Manager("Serge", 1985, 30, 4, 100,v1);
//        employees[1] = new Manager("Cindy", 1974, 20 , 6, 80,v2) ;
//        employees[2] = new Programmer("Paul", 1993, 3,  75,v3);
//        employees[3] = new Tester("Pierre", 1987, 124, 50,v4 );
//        employees[4] = new Programmer("Matt", 1981, 5 , 110,v5);
//        employees[5] = new Programmer("Sarah", 1986, 3 , 100,v6);
    }
}