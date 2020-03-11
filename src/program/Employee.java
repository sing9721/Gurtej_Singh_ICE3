package program;

public class Employee {

    protected String _Name;
    protected double _hours;
    protected double _Wages;

    public Employee(String Name, double hours, double Wages) {
        _Name = Name;
        _hours = hours;
        _Wages = Wages;
    }

    public String getName() {
        return _Name;
    }

    public void setName(String Name) {
        _Name = Name;
    }


    public double Calculatepay() {
        return _hours * _Wages;
    }

}
