package org.acme.schooltimetabling;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.acme.schooltimetabling.domain.TimeTable;
import org.acme.schooltimetabling.messaging.SolverEvent;
import org.acme.schooltimetabling.messaging.SolverEventType;
import org.acme.schooltimetabling.persistence.TimeTableRepository;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.optaplanner.core.api.solver.SolverManager;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class EntryPoint {

    @ConfigProperty(name = "solver.problem-id")
    Long problemId;

    @Channel("solver")
    Emitter<SolverEvent> solverEventEmitter;

    @Inject
    TimeTableRepository repository;

    @Inject
    SolverManager<TimeTable, Long> solverManager;

    void onStart(@Observes StartupEvent event) {
        TimeTable inputProblem = repository.load(problemId);
        System.out.println("Solving problemId " + problemId);
        solverManager.solve(problemId, inputProblem, solution -> {
            System.out.println("Solving finished: " + solution.getScore());
            repository.save(problemId, solution);
            solverEventEmitter.send(new SolverEvent(problemId, SolverEventType.SOLVER_FINISHED));
        });
    }
}
