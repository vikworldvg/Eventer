package xebia.ismail.e_learning.helper.FragmentHelper;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import xebia.ismail.e_learning.R;


public class GridWithTilesDataViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public ViewGroup contentPanel;
    public TextView title1,title2;

    public GridWithTilesDataViewHolder(View cardView) {
        super(cardView);
        imageView = (ImageView) cardView.findViewById(R.id.image_view);
        contentPanel = (ViewGroup) cardView.findViewById(R.id.content_panel);
        title1 = (TextView) cardView.findViewById(R.id.title);

    }




}
