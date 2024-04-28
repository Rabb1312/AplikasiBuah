
// Header

package app.uts;

import androidx.appcompat.app.AppCompatActivity;     // Memasukan activity
import android.content.Intent;                       // Proses perpindahan
import android.media.MediaPlayer;
import android.os.Bundle;                            // Memasukan sistem operasi
import android.view.View;                            // Mensupport content intent
import android.widget.ImageButton;



public class Menu_pembelajaran extends AppCompatActivity {


    ImageButton next,prev,play,home;
    MediaPlayer mediaplayer;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_menu_pembelajaran);

            next =findViewById(R.id.next);
            prev =findViewById(R.id.prev);
            play =findViewById(R.id.play);
            home =findViewById(R.id.home);



            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    mediaplayer = MediaPlayer.create(getApplicationContext(), R.raw.belimbing);
                    mediaplayer.start();


                }
            });

            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(Menu_pembelajaran.this, ceri.class);

                    startActivity(intent);

                }
            });

           prev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(Menu_pembelajaran.this, apel.class);

                    startActivity(intent);

                }
            });

            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(Menu_pembelajaran.this, MainActivity.class);

                    startActivity(intent);

                }
            });


        }
    }




