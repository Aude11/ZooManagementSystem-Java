package zoomanagementsystem.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zebra extends AnimalThatCanBeGroomed implements LargeAnimal {

    public Zebra(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

}
