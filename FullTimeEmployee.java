public class FullTimeEmployee extends Employee{
    double basePay;
    double bonus;

    public FullTimeEmployee(double basePay, double bonus) {
        this.basePay = basePay;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return basePay + bonus;
    }
}
