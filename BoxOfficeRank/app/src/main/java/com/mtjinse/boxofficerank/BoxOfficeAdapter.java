package com.mtjinse.boxofficerank;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BoxOfficeAdapter extends RecyclerView.Adapter<BoxOfficeAdapter.BoxOfficeViewHolder>{
    List<WeeklyBoxOfficeList> weeklyBoxOfficeLists = new ArrayList<>();
    Context context;

    public BoxOfficeAdapter(List<WeeklyBoxOfficeList> weeklyBoxOfficeLists, Context context) {
        this.weeklyBoxOfficeLists = weeklyBoxOfficeLists;
        this.context = context;
    }

    @NonNull
    @Override
    public BoxOfficeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View rootView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.boxoffice_item, viewGroup, false);
        BoxOfficeViewHolder boxOfficeViewHolder = new BoxOfficeViewHolder(rootView);
        return boxOfficeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BoxOfficeViewHolder boxOfficeViewHolder, int i) {
        WeeklyBoxOfficeList weeklyBoxOfficeList = weeklyBoxOfficeLists.get(i);
        boxOfficeViewHolder.rankTextView.setText(weeklyBoxOfficeList.getRank()+"");
        boxOfficeViewHolder.movieNameTextView.setText(weeklyBoxOfficeList.getMovieNm());
        boxOfficeViewHolder.count1TextView.setText(weeklyBoxOfficeList.getAudiCnt()); //일일 관객수
        boxOfficeViewHolder.count2TextView.setText(weeklyBoxOfficeList.getAudiAcc()); //누적관객수

    }

    @Override
    public int getItemCount() {
        return weeklyBoxOfficeLists.size();
    }

    public class BoxOfficeViewHolder extends RecyclerView.ViewHolder {
        TextView rankTextView;
        TextView movieNameTextView;
        TextView count1TextView;
        TextView count2TextView;


        public BoxOfficeViewHolder(@NonNull View itemView) {
            super(itemView);
            rankTextView = itemView.findViewById(R.id.rank);
            movieNameTextView = itemView.findViewById(R.id.movie_name);
            count1TextView = itemView.findViewById(R.id.count1);
            count2TextView = itemView.findViewById(R.id.count2);
        }
    }

}
