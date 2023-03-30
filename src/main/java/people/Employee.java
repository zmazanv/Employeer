package people;

public abstract class Employee extends Person {

    // Instance variables
    private int identificationNumber;

    // Static variables
    private static int counter = 0;

    // Constructors
    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.identificationNumber = ++counter;
    }

    // Getters
    public int getIdentificationNumber() {
        return this.identificationNumber;
    }

    // Abstract instance methods
    public abstract double calculatePay();

    @Override
    public abstract String toString(); {}
}
