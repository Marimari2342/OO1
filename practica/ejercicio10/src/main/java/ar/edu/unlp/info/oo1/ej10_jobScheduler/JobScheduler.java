package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

import main.java.ar.edu.unlp.info.oo1.ej10_jobScheduler.JobSchedulerStrategy;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected JobSchedulerStrategy strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
        this.strategy = strategy;
    }

    /*schedule(job: JobDescription) recibe un job (trabajo) y lo agrega al final 
    de la colección de trabajos pendientes. */
    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    /*next() determina cuál es el siguiente trabajo de la colección que debe ser 
    atendido, lo retorna, y lo quita de la colección */
    public JobDescription next() {
        JobDescription nextJob = this.strategy.next(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }
}
