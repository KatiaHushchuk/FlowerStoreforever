package ua.edu.ucu.apps.delivery;

public class PostDeliveryStrategy implements Delivery {
    public double delivery(double price) {
        if (price > 1000) {
            return 0;
        } else {
            return 100;
        }
    }
}
