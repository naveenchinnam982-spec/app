package com.agentworkflow.lab.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agentworkflow.lab.R;
import com.agentworkflow.lab.models.Scenario;
import java.util.List;

public class ScenarioAdapter extends RecyclerView.Adapter<ScenarioAdapter.ScenarioViewHolder> {

    private List<Scenario> scenarios;

    public ScenarioAdapter(List<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    @NonNull
    @Override
    public ScenarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_scenario, parent, false);
        return new ScenarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ScenarioViewHolder holder, int position) {
        Scenario scenario = scenarios.get(position);
        holder.tvInput.setText(scenario.getInput());
        holder.tvAction.setText(scenario.getAction());
    }

    @Override
    public int getItemCount() {
        return scenarios.size();
    }

    public static class ScenarioViewHolder extends RecyclerView.ViewHolder {
        TextView tvInput, tvAction;

        public ScenarioViewHolder(@NonNull View itemView) {
            super(itemView);
            tvInput = itemView.findViewById(R.id.tvScenarioInput);
            tvAction = itemView.findViewById(R.id.tvScenarioAction);
        }
    }
}
