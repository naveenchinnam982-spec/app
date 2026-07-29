package com.agentworkflow.lab.models;

/**
 * Model representing an AI Agent rule.
 */
public class Rule {
    private String keyword;
    private String perception;
    private String reasoning;
    private String decision;
    private String action;

    public Rule(String keyword, String perception, String reasoning, String decision, String action) {
        this.keyword = keyword;
        this.perception = perception;
        this.reasoning = reasoning;
        this.decision = decision;
        this.action = action;
    }

    public String getKeyword() { return keyword; }
    public String getPerception() { return perception; }
    public String getReasoning() { return reasoning; }
    public String getDecision() { return decision; }
    public String getAction() { return action; }
}
