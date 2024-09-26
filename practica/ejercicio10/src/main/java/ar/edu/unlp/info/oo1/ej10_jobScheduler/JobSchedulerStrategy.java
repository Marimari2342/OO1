package main.java.ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.List;

import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobDescription;

public abstract class JobSchedulerStrategy {
    /*clase abstracta que define un metodo abstracto para elegir el 
    siguiente trabajo */
    public abstract JobDescription next(List<JobDescription> jobs);
}
