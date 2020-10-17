package com.example.cairoguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> resource) {
        super(context,0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item item=getItem(position);

        if (convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);

        }
        ImageView imageView= (ImageView) convertView.findViewById(R.id.image);
        TextView title= (TextView) convertView.findViewById(R.id.header);
        TextView paragraph= (TextView) convertView.findViewById(R.id.paragraph);
        TextView phone= (TextView) convertView.findViewById(R.id.phone_text);
        TextView time= (TextView) convertView.findViewById(R.id.time_text);
        TextView price= (TextView) convertView.findViewById(R.id.price_text);
        TextView location= (TextView) convertView.findViewById(R.id.location_text);

        imageView.setImageResource(item.getmImage());
        title.setText(item.getmTitle());
        paragraph.setText(item.getmParagraph());
        phone.setText(item.getmPhone());
        time.setText(item.getmTime());
        price.setText(item.getmPrice());
        location.setText(item.getmLocation());

        return convertView;


    }
}
