import people.employ.HourlyEmployee;
import people.employ.SalariedEmployee;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        // Hourly employee
        HourlyEmployee hourler = new HourlyEmployee("Jon", "Jones", 10.83, 40);
        System.out.println(hourler);

        System.out.println();

        // Salaried employee
        SalariedEmployee salarier = new SalariedEmployee("Jimmy", "Jenkins", 70_000.9432);
        System.out.println(salarier);
    }
}
