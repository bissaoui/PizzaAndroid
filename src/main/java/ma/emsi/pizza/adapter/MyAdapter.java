package ma.emsi.pizza.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import ma.emsi.pizza.R;
import ma.emsi.pizza.classes.Produit;
import ma.emsi.pizza.service.ProduitService;

public class MyAdapter extends ArrayAdapter<Produit> {
    ArrayList <Produit> produits;
    LayoutInflater inf;

    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Produit> p) {
        super(context, resource, p);
        this.produits=p;
        this.inf= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

         convertView= inf.inflate(R.layout.listpiazza,parent,false);
        ImageView img = convertView.findViewById(R.id.img);
        TextView tvPizza = convertView.findViewById(R.id.NomPizza);
        TextView tvDuree = convertView.findViewById(R.id.Duree);
        TextView id = convertView.findViewById(R.id.id);
        tvPizza.setText(produits.get(position).getNom().toString());
        id.setText(produits.get(position).getId()+"");
        tvDuree.setText(produits.get(position).getDuree()+"");
        img.setImageResource(produits.get(position).getPhoto());
        return convertView;

    }

}
