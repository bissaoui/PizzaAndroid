package ma.emsi.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ma.emsi.pizza.classes.Produit;

public class MainActivity extends AppCompatActivity {

    TextView tvPizza,tvDesc,tvPrep,tvIngr  ;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getIntent().getExtras() != null) {
            Produit p = (Produit) getIntent().getSerializableExtra("Produit");
            tvPizza = findViewById(R.id.txtPizza);
            tvDesc = findViewById(R.id.txtDescription);
            tvIngr = findViewById(R.id.txtIngridients);
            tvPrep = findViewById(R.id.txtPreparation);
            img = findViewById(R.id.imagePi);
            tvPizza.setText(p.getNom()+"");
            tvDesc.setText(p.getDescription()+"");
            tvIngr.setText(p.getDetaisIngred()+"");
            tvPrep.setText(p.getPreparation()+"");
            img.setImageResource(p.getPhoto());
        }

    }
}