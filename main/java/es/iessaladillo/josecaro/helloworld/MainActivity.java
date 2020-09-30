package es.iessaladillo.josecaro.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.text.DateFormat.*;

public class MainActivity extends AppCompatActivity {


    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatHour = new SimpleDateFormat("HH:mm");
    Date date = new Date();
    String result ="Date\n"+ formatDate.format(date)+"\n" + "Time\n" + formatHour.format(date);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView lblDate = findViewById(R.id.lblDate);

        lblDate.setText(result);

    }
}