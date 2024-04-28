
// Header

package app.uts;

import androidx.appcompat.app.AppCompatActivity;     // Memasukan activity
import android.content.Intent;                       // Proses perpindahan
import android.media.MediaPlayer;
import android.os.Bundle;                            // Memasukan sistem operasi
import android.view.View;                            // Mensupport content intent
import android.widget.Button;                       // Memasukan widget button bergambar
import android.widget.ImageButton;
import android.widget.ImageView;


public class apel extends AppCompatActivity {


    ImageButton button1;
    int kondisi=0;
    ImageButton next,prev,play,home;
    ImageView imageviewbingkai,imageviewobjek;
    MediaPlayer mediaplayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apel);

        next =findViewById(R.id.next);
        prev =findViewById(R.id.prev);
        play =findViewById(R.id.play);
        home =findViewById(R.id.home);



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.apel);
                mediaplayer.start();


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(apel.this, Menu_pembelajaran.class);

                startActivity(intent);

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(apel.this, MainActivity.class);

                startActivity(intent);

            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(apel.this, semangka.class);

                startActivity(intent);

            }
        });

    }
}




