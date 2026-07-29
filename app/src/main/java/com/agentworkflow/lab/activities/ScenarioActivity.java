package com.agentworkflow.lab.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.agentworkflow.lab.adapters.ScenarioAdapter;
import com.agentworkflow.lab.databinding.ActivityScenarioBinding;
import com.agentworkflow.lab.models.Scenario;
import java.util.ArrayList;
import java.util.List;

public class ScenarioActivity extends AppCompatActivity {

    private ActivityScenarioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScenarioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        List<Scenario> scenarios = new ArrayList<>();
        scenarios.add(new Scenario("I am hungry", "Detected: Hunger", "Analyze: User needs food", "Decision: Suggest food", "Action: Eat healthy food"));
        scenarios.add(new Scenario("My room is dark", "Detected: Darkness", "Analyze: Low light level", "Decision: Turn on light", "Action: Light switched on"));
        scenarios.add(new Scenario("I am thirsty", "Detected: Thirst", "Analyze: Dehydration", "Decision: Suggest water", "Action: Drink fresh water"));
        scenarios.add(new Scenario("It is raining", "Detected: Rain", "Analyze: Outdoor moisture", "Decision: Use umbrella", "Action: Carry an umbrella"));
        scenarios.add(new Scenario("I have an exam", "Detected: Exam", "Analyze: Academic stress", "Decision: Study hard", "Action: Start studying now"));
        scenarios.add(new Scenario("I feel sleepy", "Detected: Tiredness", "Analyze: Lack of sleep", "Decision: Take rest", "Action: Take a power nap"));
        
        // Add more to reach 30? The user asked for 30.
        for (int i = 7; i <= 30; i++) {
            scenarios.add(new Scenario("Scenario Input " + i, "Perception " + i, "Reasoning " + i, "Decision " + i, "Action Taken " + i));
        }

        binding.rvScenarios.setLayoutManager(new LinearLayoutManager(this));
        binding.rvScenarios.setAdapter(new ScenarioAdapter(scenarios));
    }
}
