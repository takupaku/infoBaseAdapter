package com.example.student.actorinformation;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] names;
    private int[] image;

    private LayoutInflater layoutInflater;


    public CustomAdapter(Context context, String[] names, int[] image) {
        this.context = context;
        this.names = names;
        this.image = image;

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {



        if (view == null)
        {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = layoutInflater.inflate(R.layout.sample_layout,null);
        }

        ImageView photo =view.findViewById(R.id.photoId);
        final TextView name = view.findViewById(R.id.nameId);
        TextView viewDetails = view.findViewById(R.id.viewDetailId);

        photo.setImageResource(image[i]);
        name.setText(names[i]);

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PhotoActivity.class);
                intent.putExtra("photo",image[i]);
                context.startActivity(intent);
            }
        });

        viewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("name",names[i]);
                context.startActivity(intent);

            }
        });
        return null;
    }
}
