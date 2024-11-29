package abstraction;

public class PasswordChangeEvent extends AbstractEvent {
    public PasswordChangeEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer : " + super.id + " has changed their password");
    }
}
