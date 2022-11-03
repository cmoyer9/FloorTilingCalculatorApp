package android.bootcamp.floortilingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    //declare variables
    double lengthRoom;
    double widthRoom;
    double tileNumber;
    double area;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText length = (EditText) findViewById(R.id.txtLength);
        final EditText width = (EditText) findViewById(R.id.txtWidth);
        final RadioButton Tile12Inches  = (RadioButton) findViewById(R.id.rad12Inches);
        final RadioButton Tile18Inches = (RadioButton) findViewById(R.id.rad18Inches);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        Button btn = (Button) findViewById(R.id.btnCalculate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lengthRoom = Double.parseDouble(length.getText().toString());
                widthRoom = Double.parseDouble(width.getText().toString());

                if(Tile12Inches.isChecked()) {
                    area = lengthRoom * widthRoom;
                    tileNumber = lengthRoom * widthRoom / 1;
                    DecimalFormat tiles = new DecimalFormat("0.00");
                    result.setText("Tiles needed: " + tiles.format(tileNumber) + " sq.ft.");
                }
                if(Tile18Inches.isChecked()) {
                    area = lengthRoom * widthRoom;
                    tileNumber = lengthRoom * widthRoom / 1.5;
                    DecimalFormat tiles = new DecimalFormat("0.00");
                    result.setText("Tiles needed: " + tiles.format(tileNumber) + " sq.ft.");
                }

            }
        });
    }
}


