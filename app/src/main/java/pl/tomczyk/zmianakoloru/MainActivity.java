package pl.tomczyk.zmianakoloru;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void less(View view) {
        TextView tekst = (TextView) findViewById(R.id.tekst1);
//        int rozmiar = (int) tekst.getTextSize();
//        String t = Integer.toString(rozmiar);
//        //Toast.makeText(this, t, Toast.LENGTH_SHORT).show();
//        rozmiar = rozmiar -2;
//        t = Integer.toString(rozmiar);
//        //Toast.makeText(this, t, Toast.LENGTH_SHORT).show();
        tekst.setTextSize(14);
    }

    public void more(View view) {
        TextView tekst = (TextView) findViewById(R.id.tekst1);
//        int rozmiar = (int) tekst.getTextSize();
//        rozmiar = rozmiar +2;
//
//        tekst.setTextSize(TypedValue.COMPLEX_UNIT_SP, (float)rozmiar);
        tekst.setTextSize(24);
    }

    public void less1(View view) {
        TextView tekst = (TextView) findViewById(R.id.tekst1);
        int rozmiar = (int) tekst.getTextSize();
        rozmiar = rozmiar +2;
//        tekst.setTextSize(rozmiar);
        tekst.setTextSize(TypedValue.COMPLEX_UNIT_SP, (getResources().getDimension(R.dimen.text_size)*1.5f));
    }

    public void kolor(View view) {
        int wybrany=view.getId();
        Button b =(Button) findViewById(wybrany);
        Drawable kolor = b.getBackground();

        findViewById(R.id.tlo).setBackground(kolor);

    }
}