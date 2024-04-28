
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


public class Menu_info extends AppCompatActivity {


    ImageButton home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu_info);


        home =findViewById(R.id.home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Menu_info.this, MainActivity.class);

                startActivity(intent);

            }
        });


    }
}




