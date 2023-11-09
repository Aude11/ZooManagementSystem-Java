package zoomanagementsystem.models;

import java.time.LocalDate;

public class Nemo extends AbstractAnimal implements SmallAnimal, Swim {

    public Nemo(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("<Bubble Bubble>");
        super.feed();
    }

    @Override
    public void swim() {

    }
}