package com.example.androidstudyjam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

/**
 * Created by Дом on 04.04.2016.
 */
public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.ViewHolder> {

    private Context mContext;

    private String mDataSet[];

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.mImageView = (ImageView) itemView.findViewById(R.id.image_view_buildigs);
        }
    }

    public BuildingAdapter(Context context, String[] mDataSet) {
        this.mContext = context;
        this.mDataSet = mDataSet;
    }

    @Override
    public BuildingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_view, parent, false);
        ViewHolder mViewHolder = new ViewHolder(view);
        return mViewHolder;

    }



    @Override
    public void onBindViewHolder(BuildingAdapter.ViewHolder holder, int position) {
        Picasso.with(mContext)
                .load(mDataSet[position])
                .resizeDimen(R.dimen.image_width, R.dimen.image_height)
                .into(holder.mImageView);


    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
