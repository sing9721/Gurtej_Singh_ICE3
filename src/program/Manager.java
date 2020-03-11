package program;

public class Manager extends Employee {

    protected double _VacPay;
    protected double _bonus;

    public Manager(String Name, double hours, double Wages, double bonus, double VacPay) {
        super(Name, hours, Wages);
        _bonus = bonus;
        _VacPay = VacPay;
    }

   
    @Override
    public double Calculatepay() {
        return super.Calculatepay() + _VacPay + _bonus;
    }

}
