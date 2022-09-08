public class Worker extends Person{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = 0;
        if (hoursWorked <= 40) {
            weeklyPay = hoursWorked * hourlyPayRate;
        } else if (hoursWorked > 40) {
            weeklyPay = 40 * hourlyPayRate;
            weeklyPay += (hoursWorked - 40) * hourlyPayRate * 1.5;
        }
        return weeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked) {


        if (hoursWorked <= 40) {
            return (
                    "Hours Worked of Regular Pay: " + hoursWorked + "\n" + "Money Made from Regular Pay: " + calculateWeeklyPay(hoursWorked) + "\n" + "Hours Worked of OT Pay: 0" + "\n" + "Money Made From OT Pay: $0" + "\n" + "Total Hours Worked: " + hoursWorked + "\n" + "Total Money Made: " + calculateWeeklyPay(hoursWorked) + "\n");

        } else {

            return (
                    "Hours Worked of Regular Pay: 40" + "\n" +
                            "Money Made from Regular Pay: " + 40 * hourlyPayRate + "\n" +
                            "Hours Worked of OT Pay: " + (hoursWorked - 40) + "\n" +
                            "Money Made from OT Pay: " + (hoursWorked - 40) * 1.5 + "\n" +
                            "Total Hours Worked: " + hoursWorked + "\n" +
                            "Total Money Made: " + calculateWeeklyPay(hoursWorked) + "\n"
                    );

        }
    }
}
