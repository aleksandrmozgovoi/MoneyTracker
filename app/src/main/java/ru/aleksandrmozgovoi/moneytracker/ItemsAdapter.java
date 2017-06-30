package ru.aleksandrmozgovoi.moneytracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AleksandrMozgovoy on 30.06.2017.
 */

public class ItemsAdapter  extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {
final List<Item> items = new ArrayList<>();

        ItemsAdapter() {
            items.add(new Item("More More More More More word", 100));
            items.add(new Item("first \n second \n third line", 400));
            items.add(new Item("car", 100));
            items.add(new Item("apple", 400));
            items.add(new Item("car", 100));
            items.add(new Item("apple", 400));
        }

@Override
public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null));
        }

@Override
public void onBindViewHolder(ItemViewHolder holder, int position) {
final Item item = items.get(position);
        holder.name.setText(item.name);
        holder.price.setText(String.valueOf(item.price));
        }

@Override
public int getItemCount() {
        return items.size();
        }

class ItemViewHolder extends RecyclerView.ViewHolder {
    private final TextView name, price;

    ItemViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        price = (TextView) itemView.findViewById(R.id.price);
    }
}
}