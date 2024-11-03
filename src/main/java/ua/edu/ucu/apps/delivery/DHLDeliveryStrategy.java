package ua.edu.ucu.apps.delivery;

public class DHLDeliveryStrategy implements Delivery{
    
    @Override
    public double delivery(double price) {
        return 120;
    }
}
