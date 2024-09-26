import java.util.List;

import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobDescription;
import main.java.ar.edu.unlp.info.oo1.ej10_jobScheduler.JobSchedulerStrategy;

public class LifoStrategy extends JobSchedulerStrategy{
    @Override
    public JobDescription next(List<JobDescription> jobs) {
        return jobs.isEmpty() ? null : jobs.get(jobs.size() - 1);
    }
}
