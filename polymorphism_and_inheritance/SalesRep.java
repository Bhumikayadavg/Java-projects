package polymorphism_and_inheritance;



public class SalesRep extends Employee {
    int salesMade;

    public int calculateCommission() {
        return (int) (0.1 * salesMade);
    }
}
