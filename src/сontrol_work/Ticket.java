package сontrol_work;

import java.util.*;

public class Ticket {

    private int orderNumber;
    private Date time;

    public Ticket(int orderNumber) {
        this.orderNumber = orderNumber;
        this.time = new Date();
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public Date getTime() {
        return time;
    }
}
