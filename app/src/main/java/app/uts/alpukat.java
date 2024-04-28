
// Header

package app.uts;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class alpukat extends AppCompatActivity {


    ImageButton button1;
    int kondisi=0;
    ImageButton next,prev,play,home;
    ImageView imageviewbingkai,imageviewobjek;
    MediaPlayer mediaplayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alpukat);

        next =findViewById(R.id.next);
        prev =findViewById(R.id.prev);
        play =findViewById(R.id.play);
        home =findViewById(R.id.home);



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.alpukat);
                mediaplayer.start();


            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(alpukat.this, jeruk.class);

                startActivity(intent);

            }
        });


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(alpukat.this, MainActivity.class);

                startActivity(intent);

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(alpukat.this, mangga.class);

                startActivity(intent);

            }
        });


    }
}




