package com.foodaholic.foodaholic.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by maygupta on 11/28/15.
 */
public class PhotoAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mUrls;

    public PhotoAdapter(Context c, List<String> urls) {
        mContext = c;
        mUrls = urls;
    }

    @Override
    public int getCount() {
        return mUrls.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setTag(mUrls.get(position));
        imageView.setImageResource(0);
        Picasso.with(mContext).load(Uri.parse(mUrls.get(position))).into(imageView);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(350, 210));
        return imageView;
    }

//    // references to our images
//    private String[] mThumbIds = {
//            "http://img.grouponcdn.com/deal/84eV2JmLtsCdByaa2LWW/t460x279/4H-4928x3264.jpg",
//            "http://img.grouponcdn.com/deal/4odKiPMBUdBcQgPwbJV3/t460x279/bM-5616x3744.jpg",
//            "http://img.grouponcdn.com/deal/92xKKvp7d8HdYUhNWnpM/t460x279/GG-2000x1200.jpg",
//            "http://img.grouponcdn.com/deal/bNUFETXqUn6cAsQKZ996/t460x279/RN-6048x4032.jpg",
//            "http://img.grouponcdn.com/iam/wa7JCzQucDFBKzBUPmqf/t460x279/jf-5000x3000.jpg",
//            "http://img.grouponcdn.com/iam/oNnztCLW4G1rfpM3qHxq/t460x279/HV-5000x3000.jpg",
//            "http://img.grouponcdn.com/deal/bNUFETXqUn6cAsQKZ996/t460x279/RN-6048x4032.jpg",
//            "http://img.grouponcdn.com/iam/wa7JCzQucDFBKzBUPmqf/t460x279/jf-5000x3000.jpg",
//            "http://img.grouponcdn.com/deal/4odKiPMBUdBcQgPwbJV3/t460x279/bM-5616x3744.jpg",
//            "http://img.grouponcdn.com/iam/oNnztCLW4G1rfpM3qHxq/t460x279/HV-5000x3000.jpg"
//    };

}
