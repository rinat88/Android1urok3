package com.example.android1urok3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1urok3.R;
import com.example.android1urok3.interfa.OnItemClickListener;
import com.example.android1urok3.ui.QuestionModel;

import java.util.ArrayList;
import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {
    List<QuestionModel> list = new ArrayList<>();
    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public GameAdapter(List<QuestionModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public GameAdapter.GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_holder,parent,false);
        return new GameHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.GameHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class GameHolder extends RecyclerView.ViewHolder {
        TextView tvLevel;
        public GameHolder(@NonNull View itemView) {
            super(itemView);
            tvLevel = itemView.findViewById(R.id.tv_level);
        }

        public void bind(QuestionModel questionModel) {
            tvLevel.setText(questionModel.getCurrentLevel());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.itemClick(getAdapterPosition(),questionModel);
                }
            });
        }
    }
}
