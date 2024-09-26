import java.util.List;

import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobDescription;
import main.java.ar.edu.unlp.info.oo1.ej10_jobScheduler.JobSchedulerStrategy;

public class HighestPriorityStrategy extends JobSchedulerStrategy{
    @Override
    public JobDescription next(List<JobDescription> jobs) {
        return jobs.stream()
                   .max((j1, j2) -> Integer.compare(j1.getPriority(), j2.getPriority()))
                   .orElse(null);
    }
}
