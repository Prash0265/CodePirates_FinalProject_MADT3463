public class Programmer extends Employee {
    final int GAIN_FACTOR_ERROR = 200;
    int nbProjects;
    int bonus;

    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        super(name, birthYear, rate, "Programmer");
        this.nbProjects = nbProjects;
        System.out.println("We have a new employee: " + name + ", a " + getRole());

    }

    public Programmer(String name, int birthYear, int nbProjects, int rate,Vehicle employeeVehicle) {
        super(name, birthYear, rate, "Programmer",employeeVehicle);
        this.nbProjects = nbProjects;
        System.out.println("We have a new employee: " + name + ", a " + getRole());

    }
}
