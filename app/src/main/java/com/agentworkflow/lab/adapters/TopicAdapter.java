package com.agentworkflow.lab.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.agentworkflow.lab.R;
import com.agentworkflow.lab.models.Topic;
import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {

    private List<Topic> topics;

    public TopicAdapter(List<Topic> topics) {
        this.topics = topics;
    }

    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topic, parent, false);
        return new TopicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicViewHolder holder, int position) {
        Topic topic = topics.get(position);
        holder.tvTitle.setText(topic.getTitle());
        holder.tvDesc.setText(topic.getDescription());
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    public static class TopicViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDesc;

        public TopicViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTopicTitle);
            tvDesc = itemView.findViewById(R.id.tvTopicDesc);
        }
    }
}
