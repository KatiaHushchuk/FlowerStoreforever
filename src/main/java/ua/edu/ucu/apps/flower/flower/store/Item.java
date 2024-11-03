package ua.edu.ucu.apps.flower.flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {

    private FlowerBucket flowerBucket;

    public double getPrice() {
        return flowerBucket != null ? flowerBucket.getPrice() : 0;
    }

    public String getDescription() {
        return "Simple Item";
    }
    
}
