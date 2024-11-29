package abstraction;

import java.sql.Timestamp;

public abstract class AbstractEvent implements Events {
    protected final String id;
    protected final Long timestamp;


    public AbstractEvent(String id) {
        this.id = id;
        this.timestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long getTimeStamp() {
        return this.timestamp;
    }

    public abstract void process();
}
