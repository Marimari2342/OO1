import java.util.List;

import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobDescription;
import main.java.ar.edu.unlp.info.oo1.ej10_jobScheduler.JobSchedulerStrategy;

public class MostEffortStrategy extends JobSchedulerStrategy {
    @Override
    public JobDescription next(List<JobDescription> jobs) {
        return jobs.stream()
                   .max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                   .orElse(null);
    }
}
