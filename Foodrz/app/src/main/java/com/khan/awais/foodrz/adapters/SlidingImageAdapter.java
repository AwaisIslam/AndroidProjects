package com.khan.awais.foodrz.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.khan.awais.foodrz.Models.ImageModel;
import com.khan.awais.foodrz.R;

import java.util.ArrayList;

/**
 * Created by Awais on 12/5/2018.
 */

public class SlidingImageAdapter extends PagerAdapter {

    private ArrayList<ImageModel> imageSliderList;
    private LayoutInflater layoutInflater;
    private Context context;

    public SlidingImageAdapter(Context context, ArrayList<ImageModel> imageSliderList) {
        this.imageSliderList = imageSliderList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return imageSliderList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup view, int position) {
        View imageLayout = layoutInflater.inflate(R.layout.slidingimages_layout,view,false);
        assert imageLayout != null;
        final ImageView imageView = (ImageView )imageLayout.findViewById(R.id.imageSlider);
        imageView.setImageResource(imageSliderList.get(position).getImage_drawable());
        view.addView(imageLayout,0);
        return imageLayout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
