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
}
