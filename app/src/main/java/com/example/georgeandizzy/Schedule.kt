package com.example.georgeandizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.georgeandizzy.Utils.DataBaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Schedule extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton addButton;
    DataBaseHelper myDB;

    private Button backButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_schedule);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);
        addButton = findViewById(R.id.addButton);
        myDB = new DataBaseHelper(Schedule.this);

        addButton.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                         }
                                     });

        backButton1 = findViewById(R.id.backButton1);

        backButton1.setOnClickListener(v -> {
            Intent intent = new Intent(Schedule.this, HomePage.class);
            startActivity(intent);
        });
    }
}