package com.example.elearnings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ImageView leftIcon = findViewById(R.id.menu);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showOptionsDialog();
            }
        });
    }

    private void showOptionsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose an Option")
                .setItems(new CharSequence[]{"Home Page", "Zakat Calculator Page"}, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent;
                        if (which == 0) {
                            // User chose Home Page
                            intent = new Intent(AboutUs.this, com.example.elearnings.MainActivity.class);
                        } else {
                            // User chose Calculate Page
                            intent = new Intent(AboutUs.this, com.example.elearnings.ZakatCalculatorActivity.class);
                        }

                        startActivity(intent);
                        finish();
                    }
                });

        builder.create().show();
    }
}
