package com.agentworkflow.lab.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.agentworkflow.lab.databinding.ActivityAgentBinding;
import com.agentworkflow.lab.engine.RuleEngine;
import com.agentworkflow.lab.engine.WorkflowEngine;
import com.agentworkflow.lab.models.Rule;
import com.agentworkflow.lab.utils.AnimationUtils;

public class AgentSimulationActivity extends AppCompatActivity {

    private ActivityAgentBinding binding;
    private RuleEngine ruleEngine;
    private WorkflowEngine workflowEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAgentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ruleEngine = new RuleEngine();
        workflowEngine = new WorkflowEngine();

        binding.btnAnalyze.setOnClickListener(v -> startSimulation());
    }

    private void startSimulation() {
        String input = binding.etInput.getText().toString().trim();
        if (input.isEmpty()) {
            binding.etInput.setError("Please enter something");
            return;
        }

        // Reset visibility
        binding.cardPerception.setVisibility(View.GONE);
        binding.cardReasoning.setVisibility(View.GONE);
        binding.cardDecision.setVisibility(View.GONE);
        binding.cardAction.setVisibility(View.GONE);

        workflowEngine.processInput(input, ruleEngine);
        Rule rule = workflowEngine.getCurrentRule();

        Handler handler = new Handler();

        // Step 1: Perception
        handler.postDelayed(() -> {
            binding.tvPerceptionDetail.setText(rule.getPerception());
            AnimationUtils.applySlideUp(this, binding.cardPerception);
        }, 500);

        // Step 2: Reasoning
        handler.postDelayed(() -> {
            binding.tvReasoningDetail.setText(rule.getReasoning());
            AnimationUtils.applySlideUp(this, binding.cardReasoning);
        }, 1500);

        // Step 3: Decision
        handler.postDelayed(() -> {
            binding.tvDecisionDetail.setText(rule.getDecision());
            AnimationUtils.applySlideUp(this, binding.cardDecision);
        }, 2500);

        // Step 4: Action
        handler.postDelayed(() -> {
            binding.tvActionDetail.setText(rule.getAction());
            AnimationUtils.applySlideUp(this, binding.cardAction);
        }, 3500);
    }
}
