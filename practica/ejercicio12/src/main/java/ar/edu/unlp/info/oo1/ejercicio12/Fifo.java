package ar.edu.unlp.info.oo1.ejercicio12;
import java.util.List;

public class Fifo implements Strategy{
	//metodo
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (jobs != null) {
			nextJob = jobs.get(0);
		}
        return nextJob;
	}
}
