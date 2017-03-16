package com.hdu.hanjianhao.scrollerlayouttest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by hanjianhao on 17/3/16.
 */

public class ScrollerLayoutAdapter extends RecyclerView.Adapter<ScrollerLayoutAdapter.ViewHolder> {

    private List<ScrollerLayoutButtonText> mButtonTextList;

    static class ViewHolder extends RecyclerView.ViewHolder{

        Button firstButton;
        Button secondButton;
        Button thirdButton;

        public ViewHolder(View view){
            super(view);
            firstButton = (Button) view.findViewById(R.id.first_btn);
            secondButton = (Button) view.findViewById(R.id.second_btn);
            thirdButton = (Button) view.findViewById(R.id.third_btn);
        }
    }

    public ScrollerLayoutAdapter(List<ScrollerLayoutButtonText> buttonTextList){
        mButtonTextList = buttonTextList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.scroller_layout_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ScrollerLayoutButtonText buttonText = mButtonTextList.get(position);
        holder.firstButton.setText(buttonText.getFirstButtonText());
        holder.secondButton.setText(buttonText.getSecondButtonText());
        holder.thirdButton.setText(buttonText.getThirdButtonText());
    }

    @Override
    public int getItemCount() {
        return mButtonTextList.size();
    }
}
