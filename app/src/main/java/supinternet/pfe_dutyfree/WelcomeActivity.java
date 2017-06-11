package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String ticketScan = intent.getStringExtra("ticketScan");
        TextView ticketCheckStatus = (TextView) findViewById(R.id.TicketCheckStatus);
        TextView ticketCheck = (TextView) findViewById(R.id.TicketCheck);
        String welcomeTxt = getResources().getString(R.string.ticketCheckText);
        String welcomeMsg = String.format(welcomeTxt, ticketScan, ticketScan);
        ticketCheckStatus.setText(welcomeMsg);
        ticketCheck.setText(ticketScan);
    }

    public void goToCatalogActivity(View v){
        Intent goToCatalogActivity = new Intent(this, NavigationActivity.class);
        startActivity(goToCatalogActivity);
    }
}
