package com.agentworkflow.lab.activities;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.agentworkflow.lab.databinding.ActivityWorkflowBinding;
import com.agentworkflow.lab.utils.AnimationUtils;

public class WorkflowActivity extends AppCompatActivity {

    private ActivityWorkflowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkflowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAnimate.setOnClickListener(v -> runWorkflowAnimation());
    }

    private void runWorkflowAnimation() {
        Handler handler = new Handler();

        handler.postDelayed(() -> AnimationUtils.applyZoomIn(this, binding.boxInput), 0);
        handler.postDelayed(() -> AnimationUtils.applyZoomIn(this, binding.boxPerception), 800);
        handler.postDelayed(() -> AnimationUtils.applyZoomIn(this, binding.boxReasoning), 1600);
        handler.postDelayed(() -> AnimationUtils.applyZoomIn(this, binding.boxDecision), 2400);
        handler.postDelayed(() -> AnimationUtils.applyZoomIn(this, binding.boxAction), 3200);
    }
}
