package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    private List<JobDescription> jobs;
    private Strategy strategy;

    public JobScheduler (Strategy strategy) {
        this.jobs = new ArrayList<>();
        this.strategy = strategy;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Strategy getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public JobDescription next() {
        JobDescription nextJob = this.strategy.next(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }

}
