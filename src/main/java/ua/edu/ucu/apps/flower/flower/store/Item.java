package ua.edu.ucu.apps.flower.flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {

    public abstract double getPrice();

    public String getDescription() {
        return "Simple Item";
    }
    
}
