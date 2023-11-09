package zoomanagementsystem.services;

import zoomanagementsystem.models.Animal;
import zoomanagementsystem.models.Keeper;

import java.util.List;

public class FeedingScheduler  implements Scheduler {

    public FeedingScheduler() {
        super();
    }

    @Override
    public void assignJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(keeper::feed));
    }

}
