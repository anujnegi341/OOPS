package abstraction;

public class FundTransferEvent extends AbstractEvent {
    public FundTransferEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer : " + super.id + " has made a transfer of Funds. Send them a mail for fund deduction from Account Balance");
    }
}
