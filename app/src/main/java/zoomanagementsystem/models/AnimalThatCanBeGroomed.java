package zoomanagementsystem.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnimalThatCanBeGroomed extends AbstractAnimal {

    protected LocalDateTime lastGroomed;
    protected AnimalThatCanBeGroomed(LocalDate dateOfBirth) {
        super(dateOfBirth);
        lastGroomed = LocalDateTime.now();
    }
    public void groom() {
        lastGroomed = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }
}
