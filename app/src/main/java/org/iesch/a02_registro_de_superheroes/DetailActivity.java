package org.iesch.a02_registro_de_superheroes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

import org.iesch.a02_registro_de_superheroes.databinding.ActivityDetailBinding;
import org.iesch.a02_registro_de_superheroes.databinding.ActivityMainBinding;
import org.iesch.a02_registro_de_superheroes.model.SuperHero;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding binding = ActivityDetailBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_main);
        setContentView(binding.getRoot());
        // 1 - Obtengo en un objeto Bundle todos los datos traídos de origen
        Bundle extras = getIntent().getExtras();
        //  4 - Recibo el Objeto Superhero de extras
        SuperHero superHero = extras.getParcelable("superHero");

        // 12.- Recibimos la imagaen recibida
        Bitmap bitmap = extras.getParcelable("fotoSuperheroe");
        if(bitmap != null){
            binding.imageView.setImageBitmap(bitmap);
        }

        // 5 - Simplificamos el código del paso 3
        binding.setSuperhero(superHero);

        // 2 - Creo las variables para obtener los valores del intent desde extras con el valor de la llave
        //String heroName = extras.getString("superhero_name");
        //String alterEgo = extras.getString("alterEgo");
        //String bio = extras.getString("bio");
        //float rating = extras.getFloat("rating");
        // 3 - Utilizamos los valores obtenidos
//        binding.nombreHeroeText.setText(superHero.getName());
//        binding.textView3.setText(superHero.getAlterEgo());
//        binding.textView4.setText(superHero.getBio());
//        binding.ratingBar.setRating(superHero.getPower());
    }
}












