public class Employee {
    private String name;
    private int birthYear;
    private int rate;
    private String role;
    Vehicle employeeVehicle;
    //Contract employeeContract;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee(String name, int birthYear, int rate, String role) {
        this.name = name;
        this.birthYear = birthYear;
        if (rate > 100) {
            this.rate = 100;
        } else if (rate < 10) {
            this.rate = 10;
        } else {
            this.rate = rate;
        }
        //this.rate = rate;
        this.role = role;
        //this.employeeVehicle= employeeVehicle;
    }
}
