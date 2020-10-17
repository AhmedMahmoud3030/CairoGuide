package com.example.cairoguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> items=new ArrayList<>();
        items.add(new Item("09:00 – 17:00","The Egyptian Museum","Built in 1901 by the Italian construction company Garozzo-Zaffarani to a design by the French architect Marcel Dourgnon.","50EGP",R.drawable.the_egyptian_museum,"+225620411","cairo","https://www.google.com/search?q=muhammad+ali+mosque&oq=mu&aqs=chrome.0.69i59j46i39i175i199j69i59j69i57j46i131i433i457j69i61j69i60j69i61.1829j0j4&sourceid=chrome&ie=UTF-8"));
        items.add(new Item("09:00 – 00:00","Cairo Tower","It was the tallest structure in Africa for ten years until 1971, when it was surpassed by Hillbrow Tower in South Africa. ","100EGP",R.drawable.cairo_tower,"+225620411","cairo","https://www.google.com/search?q=muhammad+ali+mosque&oq=mu&aqs=chrome.0.69i59j46i39i175i199j69i59j69i57j46i131i433i457j69i61j69i60j69i61.1829j0j4&sourceid=chrome&ie=UTF-8"));
        items.add(new Item("09:00 – 17:00","Mosque of Muhammad Ali","The Great Mosque of Muhammad Ali Pasha or Alabaster Mosque is a mosque situated in the Citadel of Cairo in Egypt and was commissioned by Muhammad Ali Pasha between 1830 and 1848.","60EGP",R.drawable.the_egyptian_museum,"+225620411","cairo","https://www.google.com/search?q=muhammad+ali+mosque&oq=mu&aqs=chrome.0.69i59j46i39i175i199j69i59j69i57j46i131i433i457j69i61j69i60j69i61.1829j0j4&sourceid=chrome&ie=UTF-8"));
        items.add(new Item("09:00 – 17:00","The Coptic Museum","The Coptic Museum is a museum in Coptic Cairo, Egypt with the largest collection of Egyptian Christian artifacts in the world. ","80EGP",R.drawable.the_coptic_museum,"+225620411","cairo","https://www.google.com/search?q=muhammad+ali+mosque&oq=mu&aqs=chrome.0.69i59j46i39i175i199j69i59j69i57j46i131i433i457j69i61j69i60j69i61.1829j0j4&sourceid=chrome&ie=UTF-8"));
        items.add(new Item("08:00 – 15:00","Red Pyramid","he Red Pyramid, also called the North Pyramid, is the largest of the three major pyramids located at the Dahshur necropolis in Cairo, Egypt.","120EGP",R.drawable.red_pyramid,"+225620411","cairo","https://www.google.com/search?q=muhammad+ali+mosque&oq=mu&aqs=chrome.0.69i59j46i39i175i199j69i59j69i57j46i131i433i457j69i61j69i60j69i61.1829j0j4&sourceid=chrome&ie=UTF-8"));

        ListView listView= (ListView)rootView.findViewById(R.id.list);
        ItemAdapter itemAdapter=new ItemAdapter(getActivity(),items);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item=items.get(position);
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(item.getmUrl()));
                startActivity(intent);
            }
        });


        return rootView;
    }
}