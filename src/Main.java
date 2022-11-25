public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[6];

        Motorcycle m1 = new Motorcycle("Kawasaki", "Custom Plate","Yellow", "Race Motorcycle", false);
        Motorcycle m2 = new Motorcycle("Honda", "Custom Plate","Black", "Not for Race", true);
        Car v1 = new Car("Lamborghini", "Custom Plate","White", "Family", "Manual","Sport" );
        Car v2 = new Car("BMW", "Custom Plate","Black", "Family", "Automatic","Sedan" );
        Car v3 = new Car("Renault Clio", "Custom Plate","Blue", "Family", "Manual","Hatchback" );
        Car v4 = new Car("Mazda", "Custom Plate","White", "Family", "Automatic","SUV" );

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
        System.out.println("Employee description:");
        employees[0] = new Manager("Serge", 1985, 30, 4, 100,v1);
        employees[1] = new Manager("Cindy", 1974, 20 , 6, 80,v2) ;
        employees[2] = new Programmer("Paul", 1993, 3,  75,m1);
        employees[3] = new Tester("Pierre", 1987, 124, 50,m2 );
        employees[4] = new Programmer("Matt", 1981, 5 , 110,v4);
        employees[5] = new Programmer("Sarah", 1986, 3 , 100,v3);

        System.out.println("-----------------------------------------------------");
        for (int i =0;i<=length-1;i++) {
            System.out.println(employees[i]);
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
        }

        System.out.println("Test 3:");
        System.out.println("Employee description:");
        Employee Serge = new Manager("Serge", 1985, 30, 4, 100,v1);
        Employee Cindy = new Manager("Cindy", 1974, 20 , 6, 80,v2) ;
        Employee Paul = new Programmer("Paul", 1993, 3,  75,m1);
        Employee Pierre = new Tester("Pierre", 1987, 124, 50,m2 );
        Employee Matt = new Programmer("Matt", 1981, 5 , 110,v4);
        Employee Sarah = new Programmer("Sarah", 1986, 3 , 100,v3);



        Permanent p1 = new Permanent(2,true,6000,200,17);
        Permanent p2 = new Permanent(3,  false, 5000,  150,  19);
        Temporary t1 = new Temporary(60, 30);
        Temporary t2 = new Temporary(50, 60);
        Permanent p3 = new Permanent(1,  true,  4000, 100,  20);
        Permanent p4 = new Permanent(4,  true,  4500,  100, 19);

        Serge.signContract(p1);
        Cindy.signContract(p2);
        Paul.signContract(t1);
        Matt.signContract(t2);
        Pierre.signContract(p3);
        Sarah.signContract(p4);

        employees[0] = Serge;
        employees[1] = Cindy;
        employees[2] = Paul;
        employees[3] = Matt;
        employees[4] = Pierre;
        employees[5] = Sarah;
        System.out.println("-----------------------------------------------------");
        for (int i =0;i<=length-1;i++) {
            System.out.println(employees[i]);
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
        }

        System.out.println("CONTRACTS:");
        System.out.println("-----------------------------------------------------");
        for (int i =0;i<=length-1;i++) {
            System.out.println(employees[i].contractInfo()+employees[i].employeeContract);
        }
        System.out.println("-----------------------------------------------------");

        Permanent p5 = new Permanent(1,  true,  5000,  200, 30);
        Matt.signContract(p5);

        System.out.println("CONTRACTS:");
        System.out.println("-----------------------------------------------------");
        for (int i =0;i<=length-1;i++) {
            System.out.println(employees[i].contractInfo()+employees[i].employeeContract);
        }
    }



}