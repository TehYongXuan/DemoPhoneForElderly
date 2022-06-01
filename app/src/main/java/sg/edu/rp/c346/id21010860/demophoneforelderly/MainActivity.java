package sg.edu.rp.c346.id21010860.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonCall1;
    Button buttonCall2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCall1 = findViewById(R.id.buttonCallSon);
        buttonCall2 = findViewById(R.id.buttonCallDaughter);

        buttonCall1.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
             Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 92240336));
             startActivity(intentCall);
              }
        });
        buttonCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 89675543));
                startActivity(intentCall);
            }
        });
    }

        }