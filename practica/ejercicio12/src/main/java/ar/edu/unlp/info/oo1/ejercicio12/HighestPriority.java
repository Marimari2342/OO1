package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.List;

public class HighestPriority implements Strategy {

	//metodo
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = null;
		if (jobs != null) {
			nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
		}
        return nextJob;
	}
}
