package sg.edu.np.s10205286;

import java.util.Random;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        View icon = findViewById(R.id.listImage);

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

                builder.setTitle("Profile")
                    .setMessage("MADness")
                    .setCancelable(true)
                    .setPositiveButton("View", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                        Random random = new Random();

                        Intent movePage = new Intent(ListActivity.this, MainActivity.class);
                        movePage.putExtra("ranNum", random.nextInt());

                        startActivity(movePage);
                    }
                })
                    .setNegativeButton("Close", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int id){
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}