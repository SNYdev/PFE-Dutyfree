package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UnknownAirportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unknown_airport);

        Intent intent = getIntent();
        String welcomeMsg = intent.getStringExtra("welcomeMsg");

        TextView ticketCheckStatus = (TextView) findViewById(R.id.TicketCheckStatus);

        ticketCheckStatus.setText(welcomeMsg);
    }

    public void goToCatalogActivity(View v){
        Intent goToCatalogActivity = new Intent(this, MainActivity.class);
        startActivity(goToCatalogActivity);
    }
}
