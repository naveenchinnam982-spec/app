package com.agentworkflow.lab.activities;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.agentworkflow.lab.databinding.ActivityStatisticsBinding;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import java.util.List;

public class StatisticsActivity extends AppCompatActivity {

    private ActivityStatisticsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStatisticsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupPieChart();
    }

    private void setupPieChart() {
        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(50f, "Matched Rules"));
        entries.add(new PieEntry(20f, "Unknown Inputs"));
        entries.add(new PieEntry(30f, "Recent Actions"));

        PieDataSet dataSet = new PieDataSet(entries, "Agent Activity");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(12f);

        PieData data = new PieData(dataSet);
        binding.pieChart.setData(data);
        binding.pieChart.getDescription().setEnabled(false);
        binding.pieChart.setCenterText("Agent Stats");
        binding.pieChart.animateY(1000);
        binding.pieChart.invalidate();
    }
}
