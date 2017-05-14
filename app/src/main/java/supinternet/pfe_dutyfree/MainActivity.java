package supinternet.pfe_dutyfree;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String currentLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button currentLangButton = (Button) findViewById(R.id.currentLangButton);
        TextView otherLang = (TextView) findViewById(R.id.otherLangText);

        otherLang.setText(R.string.langSelect);
        //currentLangButton.setText(R.string.currentLangButton);

        currentLang = Locale.getDefault().getDisplayLanguage();
        TextView currentLangString = (TextView) findViewById(R.id.currentLang);
        currentLangString.setText(currentLang);
        TextView textCurrentLang = (TextView) findViewById(R.id.textCurrentLang);
        textCurrentLang.setText(R.string.currentLang);
        ImageView dutyStoreLogo = (ImageView) findViewById(R.id.logoDraw);
        dutyStoreLogo.setImageResource(R.drawable.logotextdutystore);

    }

    public void goToEnActiv(View v){
        changeLanguage("en");
        Intent refresh =  new Intent(this, NavigationActivity.class);
        startActivity(refresh);
    }

    public void goToFrActiv(View v){
        changeLanguage("fr");
        Intent refresh =  new Intent(this, NavigationActivity.class);
        startActivity(refresh);
    }

    public void goToEsActiv(View v){
        changeLanguage("es");
        Intent refresh =  new Intent(this, NavigationActivity.class);
        startActivity(refresh);
    }

    public void goToCurrentLang(View v){
        Intent refresh = new Intent(this, NavigationActivity.class);
        startActivity(refresh);
    }

    public void changeLanguage(String lang){
        Locale myLocal = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocal;
        res.updateConfiguration(conf, dm);
    }

    @SuppressWarnings("deprecation")
    public Locale getSystemLocaleLegacy(Configuration config){
        return config.locale;
    }

    @TargetApi(Build.VERSION_CODES.N)
    public Locale getSystemLocale(Configuration config){
        return config.getLocales().get(0);
    }

    @SuppressWarnings("deprecation")
    public void setSystemLocaleLegacy(Configuration config, Locale locale){
        config.locale = locale;
    }

    @TargetApi(Build.VERSION_CODES.N)
    public void setSystemLocale(Configuration config, Locale locale){
        config.setLocale(locale);
    }

    public void setLanguage(Context context, String languageCode){
        Locale locale = new Locale(languageCode);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            setSystemLocale(config, locale);
        }else{
            setSystemLocaleLegacy(config, locale);
        }
        context.getApplicationContext().getResources().updateConfiguration(config,
                context.getResources().getDisplayMetrics());
    }
}
