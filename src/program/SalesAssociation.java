package program;

public class SalesAssociation extends Employee {

    protected double _VacPay;

    public SalesAssociation(String Name, double hours, double Wages, double VacPay) {
        super(Name, hours, Wages);
        _VacPay = VacPay;
    }



    @Override
    public double Calculatepay() {
        return super.Calculatepay() + _VacPay;
    }
}
