public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[6];
        System.out.println("Test 1:");
        int length = employees.length;
        employees[0] = new Manager("Serge", 1985, 30, 4, 100);
        employees[1] = new Manager("Cindy", 1974, 20 , 6, 80) ;
        employees[2] = new Programmer("Paul", 1993, 3,  75);
        employees[3] = new Tester("Pierre", 1987, 124, 50 );
        employees[4] = new Programmer("Matt", 1981, 5 , 110);
        employees[5] = new Programmer("Sarah", 1986, 3 , 100);
    }
}