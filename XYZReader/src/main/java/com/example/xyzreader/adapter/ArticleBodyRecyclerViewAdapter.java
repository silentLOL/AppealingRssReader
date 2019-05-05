package com.example.xyzreader.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class ArticleBodyRecyclerViewAdapter extends RecyclerView.Adapter<ArticleBodyRecyclerViewAdapter.ArticleBodyViewHolder> {

    private String[] mArticleBodyPortions;

    @NonNull
    @Override
    public ArticleBodyRecyclerViewAdapter.ArticleBodyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int itemLayout = R.layout.article_body_list_item;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(itemLayout, viewGroup, shouldAttachToParentImmediately);
        return new ArticleBodyViewHolder(view);
    }

    public void setArticleBodyPortions(String[] portions) {
        this.mArticleBodyPortions = portions;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleBodyRecyclerViewAdapter.ArticleBodyViewHolder articleBodyViewHolder, int i) {
        String currElem = mArticleBodyPortions[i];
        articleBodyViewHolder.mPortionTextView.setText(currElem);
    }

    @Override
    public int getItemCount() {
        return mArticleBodyPortions == null ? 0 : mArticleBodyPortions.length;
    }


    public class ArticleBodyViewHolder extends RecyclerView.ViewHolder {

        public final TextView mPortionTextView;

        public ArticleBodyViewHolder(@NonNull View itemView) {
            super(itemView);
            mPortionTextView = itemView.findViewById(R.id.article_body_portion_tv);
        }
    }
}
