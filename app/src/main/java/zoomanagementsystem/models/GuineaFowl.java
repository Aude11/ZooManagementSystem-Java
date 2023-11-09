package zoomanagementsystem.models;

import java.time.LocalDate;

public class GuineaFowl extends AbstractAnimal implements LargeAnimal, Fly {
    public GuineaFowl(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void fly() {
        System.out.println("Fly!!");
    }
}
