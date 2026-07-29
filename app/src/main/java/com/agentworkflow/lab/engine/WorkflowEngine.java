package com.agentworkflow.lab.engine;

import com.agentworkflow.lab.models.Rule;

/**
 * Manages the transition of agent states.
 */
public class WorkflowEngine {
    
    public enum State {
        IDLE, PERCEPTION, REASONING, DECISION, ACTION
    }

    private Rule currentRule;
    private State currentState;

    public WorkflowEngine() {
        currentState = State.IDLE;
    }

    public void processInput(String input, RuleEngine engine) {
        currentRule = engine.matchRule(input);
        currentState = State.PERCEPTION;
    }

    public State getNextState() {
        switch (currentState) {
            case IDLE: return State.PERCEPTION;
            case PERCEPTION: return State.REASONING;
            case REASONING: return State.DECISION;
            case DECISION: return State.ACTION;
            case ACTION: return State.IDLE;
            default: return State.IDLE;
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }

    public Rule getCurrentRule() {
        return currentRule;
    }
}
