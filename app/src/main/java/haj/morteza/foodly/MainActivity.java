package haj.morteza.foodly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    String SinceTime = "k";
    String GoesAddress = "k";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        URL url = null;
        try {
            url = new URL("https://localhost:5000/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        new ReceiveData(this, SinceTime, GoesAddress).execute(url);
    }
}
