package abstraction;

public class PayBillEvent extends AbstractEvent {

    public PayBillEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer : " + super.id + " has payed their Credit Card Monthly Bill. Send them Statement PDF with updated CC limit");
    }
}
