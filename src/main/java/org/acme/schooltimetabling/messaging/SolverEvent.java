package org.acme.schooltimetabling.messaging;

public class SolverEvent {
    private Long problemId;
    private SolverEventType solverEventType;

    public SolverEvent() {
        // Used by Jackson
    }

    public SolverEvent(Long problemId, SolverEventType solverEventType) {
        this.problemId = problemId;
        this.solverEventType = solverEventType;
    }

    public Long getProblemId() {
        return problemId;
    }

    public SolverEventType getSolverEventType() {
        return solverEventType;
    }
}
