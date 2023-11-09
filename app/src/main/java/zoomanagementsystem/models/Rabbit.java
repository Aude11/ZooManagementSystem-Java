package zoomanagementsystem.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rabbit extends AnimalThatCanBeGroomed implements SmallAnimal {


    public Rabbit(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void feed() {
        System.out.println("<Munch munch>");
        super.feed();
    }

}
