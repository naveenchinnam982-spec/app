package com.agentworkflow.lab.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.agentworkflow.lab.adapters.TopicAdapter;
import com.agentworkflow.lab.databinding.ActivityLearnBinding;
import com.agentworkflow.lab.models.Topic;
import java.util.ArrayList;
import java.util.List;

public class LearnActivity extends AppCompatActivity {

    private ActivityLearnBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLearnBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        List<Topic> topics = new ArrayList<>();
        topics.add(new Topic("What is AI Agent", "An autonomous entity which observes through sensors and acts upon an environment using actuators."));
        topics.add(new Topic("Agent Architecture", "The internal structure of an agent including sensors, processors, and actuators."));
        topics.add(new Topic("Perception", "The process of interpreting sensory information to understand the environment."));
        topics.add(new Topic("Reasoning", "The cognitive process of looking at facts and making logical deductions."));
        topics.add(new Topic("Decision Making", "Selecting a particular course of action from among several alternatives."));
        topics.add(new Topic("Action", "The final execution of the decision made by the agent."));
        topics.add(new Topic("Environment", "The external world in which the agent operates."));
        topics.add(new Topic("Sensors", "Components that allow the agent to perceive its environment."));
        topics.add(new Topic("Actuators", "Components that allow the agent to take actions in the environment."));

        binding.rvTopics.setLayoutManager(new LinearLayoutManager(this));
        binding.rvTopics.setAdapter(new TopicAdapter(topics));
    }
}
