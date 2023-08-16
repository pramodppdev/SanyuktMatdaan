package com.sanyuktmatdaan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CandidateAdapter extends RecyclerView.Adapter<CandidateAdapter.PostViewHolder>{
    private List<CandidateModel> itemList;

    public CandidateAdapter(List<CandidateModel> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.candidate_vote_row, parent, false);
        return new PostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        CandidateModel post = itemList.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        private TextView candidate_name;
        private TextView candidate_area;
        private TextView candidate_party;
        private TextView candidate_type;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            candidate_name = itemView.findViewById(R.id.textViewName);
            candidate_area=itemView.findViewById(R.id.textViewArea);
            candidate_party=itemView.findViewById(R.id.textViewParty);
            candidate_type=itemView.findViewById(R.id.textViewType);
        }

        public void bind(CandidateModel insp) {
            candidate_name.setText(insp.getCandidate_name());
            candidate_area.setText(insp.getCandidate_area());
            candidate_party.setText(insp.getCandidate_party());
            candidate_type.setText(insp.getCandidate_type());


            // Bind other data fields here if needed
        }
    }
}