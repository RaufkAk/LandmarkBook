package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.landmarkbook.databinding.ActivityDetails2Binding;

public class DetailsActivity2 extends AppCompatActivity {
    private ActivityDetails2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.countryText.setText("Test");

        Intent intent = getIntent();
        //Casting
        Landmark selectedLandmark =(Landmark)intent.getSerializableExtra("landmark");
        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);



    }
}
