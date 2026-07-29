package com.agentworkflow.lab.models;

/**
 * Model representing a predefined scenario.
 */
public class Scenario {
    private String input;
    private String perception;
    private String reasoning;
    private String decision;
    private String action;

    public Scenario(String input, String perception, String reasoning, String decision, String action) {
        this.input = input;
        this.perception = perception;
        this.reasoning = reasoning;
        this.decision = decision;
        this.action = action;
    }

    public String getInput() { return input; }
    public String getPerception() { return perception; }
    public String getReasoning() { return reasoning; }
    public String getDecision() { return decision; }
    public String getAction() { return action; }
}
