package xebia.ismail.e_learning.helper.FragmentHelper;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.List;

import xebia.ismail.e_learning.R;
import xebia.ismail.e_learning.fragment.Helper;



public class GridWithTilesAdapter extends RecyclerView.Adapter<GridWithTilesDataViewHolder> {

    private List<GridWithTilesData> data;
    private WeakReference<Context> contextWeakReference;

    public GridWithTilesAdapter(Context context, List<GridWithTilesData> data) {
        this.data = data;
//        this.contextWeakReference = new WeakReference<>(context);
        this.contextWeakReference = new WeakReference<>(context);
    }

    @Override
    public GridWithTilesDataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(contextWeakReference.get()).inflate(
                R.layout.tile, parent, false);
        return new GridWithTilesDataViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(GridWithTilesDataViewHolder holder, final int position) {

        holder.imageView.setImageResource(data.get(position).drawableRes);
        /*Palette palette =
                Palette.from(((BitmapDrawable) holder.imageView.getDrawable()).getBitmap())
                        .generate();
        int color = palette.getDarkVibrantColor(3);

        holder.contentPanel.setBackgroundColor(color);*/
        holder.itemView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Helper.title = data.get(position).name1;
                Helper.id = position+1;
                contextWeakReference.get().startActivity(new Intent(contextWeakReference.get(), Helper.class));

            }
        });
        holder.title1.setText(data.get(position).name1);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
