package supinternet.pfe_dutyfree;

import android.accounts.AccountManager;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonEn = (Button) findViewById(R.id.btnEn);
        Button buttonEs = (Button) findViewById(R.id.btnEs);
        Button buttonFr = (Button) findViewById(R.id.btnFr);

        buttonEn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String languageToLoad  = "your language code";
            }
        });

        buttonFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String languageToLoad  = "your language code";
            }
        });

        buttonEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String languageToLoad  = "your language code";
            }
        });


    }
}
