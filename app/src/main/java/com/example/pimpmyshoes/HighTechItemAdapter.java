package com.example.pimpmyshoes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class HighTechItemAdapter extends BaseAdapter{

    // Attribut
    private  Context context;
    private List<HighTechItem>highTechItemList;
    private LayoutInflater inflater;

    //constructeur
    public HighTechItemAdapter(Context context, List<HighTechItem> highTechItemList)
    {
      this.context = context;
      this.highTechItemList  = highTechItemList;
      this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return highTechItemList.size();
    }

    @Override
    public HighTechItem getItem(int position) {
        return highTechItemList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view=inflater.inflate(R.layout.adapter_item1, null);

        // Récuperation des information à propos de l'item
        HighTechItem currentItem = getItem(i);
        String itemName = currentItem.getName();
        String itemMarque=  currentItem.getMarque();

        // Recuperer l'item view name
        TextView itemNameView = view.findViewById(R.id.item_name);
        itemNameView.setText(itemName);
        // Recuperer l'item view  marque
        TextView itemMarqueView= view.findViewById(R.id.item_marque);
        itemMarqueView.setText(itemMarque);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Toast.makeText(context, "Vous essayez d'acheter un " + itemName + ", de la marque " + itemMarque, Toast.LENGTH_SHORT).show();
            }


        });

        return view;
    }
}
