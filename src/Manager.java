public class Manager extends Employee{
    final int GAIN_FACTOR_CLIENT = 500;
    final int GAIN_FACTOR_TRAVEL = 100;
    int nbTravelDays;
    int nbClients;
    int bonus;

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate) {
        super(name, birthYear, rate, "Manager");
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        System.out.println("We have a new employee: " + name + ", a " + getRole());
        bonus = GAIN_FACTOR_CLIENT * nbClients + GAIN_FACTOR_TRAVEL * nbTravelDays;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate, Vehicle employeeVehicle) {
        super(name, birthYear, rate, "Manager", employeeVehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        System.out.println("We have a new employee: " + name + ", a " + getRole());
    }

    @Override
    public String toString() {
        String output;
        output = super.toString();
        output += "He/She travelled " + nbTravelDays + " days and has brought " + nbClients + " new clients." + "\n";

        return output;
    }
}
