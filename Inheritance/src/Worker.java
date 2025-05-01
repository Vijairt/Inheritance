public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            return (40 * hourlyPayRate) + (overtimeHours * hourlyPayRate * 1.5);
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;

        System.out.printf("Regular Hours: %.2f, Pay: $%.2f\n", regularHours, regularPay);
        System.out.printf("Overtime Hours: %.2f, Pay: $%.2f\n", overtimeHours, overtimePay);
        System.out.printf("Total Pay: $%.2f\n", totalPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }

    @Override
    public String toXML() {
        return super.toXML() + "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate>";
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"hourlyPayRate\": " + hourlyPayRate + "}");
    }
}
