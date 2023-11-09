package zoomanagementsystem.services;

import zoomanagementsystem.models.Animal;
import zoomanagementsystem.models.CanBeGroomed;
import zoomanagementsystem.models.Keeper;

import java.util.List;

public class GroomingScheduler implements Scheduler {

    public GroomingScheduler() {
        super();
    }

    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanBeGroomed) {
                keeper.groom((CanBeGroomed) animal);
            }
        }));
    }
}
