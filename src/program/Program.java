package program;

public class Program {

    public static void main(String[] args) {
        Employee emp = new Employee("GURTEJ SINGH", 37.5, 27.00);
        Manager mgr = new Manager("Gurtej Singh", 39.5, 80.00, 500, 100);
        SalesAssociation SA = new SalesAssociation("Singh", 45.5, 23.4, 32);

        System.out.printf("The Pay of " + emp.getName() + " is: $%.2f \n", emp.Calculatepay());
        System.out.printf("The Pay of " + mgr.getName() + " is: $%.2f \n", mgr.Calculatepay());
        System.out.printf("The Pay of " + SA.getName() + " is: $%.2f \n", SA.Calculatepay());
    }

}
