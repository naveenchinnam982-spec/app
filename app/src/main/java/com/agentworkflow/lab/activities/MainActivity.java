package com.agentworkflow.lab.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.agentworkflow.lab.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupClickListeners();
    }

    private void setupClickListeners() {
        binding.cardStart.setOnClickListener(v -> startActivity(new Intent(this, AgentSimulationActivity.class)));
        binding.cardLearn.setOnClickListener(v -> startActivity(new Intent(this, LearnActivity.class)));
        binding.cardWorkflow.setOnClickListener(v -> startActivity(new Intent(this, WorkflowActivity.class)));
        binding.cardScenarios.setOnClickListener(v -> startActivity(new Intent(this, ScenarioActivity.class)));
        binding.cardStats.setOnClickListener(v -> startActivity(new Intent(this, StatisticsActivity.class)));
        binding.cardAbout.setOnClickListener(v -> startActivity(new Intent(this, AboutActivity.class)));
    }
}
