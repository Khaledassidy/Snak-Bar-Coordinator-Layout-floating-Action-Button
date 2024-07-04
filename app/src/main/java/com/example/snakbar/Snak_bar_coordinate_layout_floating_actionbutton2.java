package com.example.snakbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Snak_bar_coordinate_layout_floating_actionbutton2 extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snak_bar_coordinate_layout_floating_actionbutton2);
        floatingActionButton=findViewById(R.id.flowting_action_button_coordinate);
        coordinatorLayout=findViewById(R.id.main2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //snak bar
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"hi snakbar",Snackbar.LENGTH_LONG);
                snackbar.setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getBaseContext(), "clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                snackbar.show();
            }
        });

    }
}