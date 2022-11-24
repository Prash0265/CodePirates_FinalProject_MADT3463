public interface Contract {
    float getFinalAmount();
}
class Permanent implements Contract {
    int nbChildren;
    boolean married;
    int monthlySalary;
    int bonusPerChildPerMonth;
    int accumulatedDays;

    public int getNbChildren() {
        return nbChildren;
    }

    public void setNbChildren(int nbChildren) {
        this.nbChildren = nbChildren;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public void setBonusPerChildPerMonth(int bonusPerChildPerMonth) {
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public void setAccumulatedDays(int accumulatedDays) {
        this.accumulatedDays = accumulatedDays;
    }

    Permanent(int nbChildren, boolean married, int monthlySalary, int bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    public float getFinalAmount() {
        int finalAmount = monthlySalary;
        if (isMarried()) {
            finalAmount += (nbChildren * bonusPerChildPerMonth);
        }
        return finalAmount * accumulatedDays / 20;
    }

    @Override
    public String toString() {
        String output;
        //output = super.toString();
        output = ". he is " + isMarried() + " and he/she has " + getNbChildren() + " children.\nHe/She has worked for " + getAccumulatedDays() + " days and upon contract his/her monthly salary is " + getMonthlySalary();
        return output;
    }


    class Temporary implements Contract {
        int hourlySalary;
        int accumulatedHours;

        public int getHourlySalary() {
            return hourlySalary;
        }

        public void setHourlySalary(int hourlySalary) {
            this.hourlySalary = hourlySalary;
        }

        public int getAccumulatedHours() {
            return accumulatedHours;
        }

        public void setAccumulatedHours(int accumulatedHours) {
            this.accumulatedHours = accumulatedHours;
        }

        Temporary(int hourlySalary, int accumulatedHours) {
            this.hourlySalary = hourlySalary;
            this.accumulatedHours = accumulatedHours;
        }



    }
}
