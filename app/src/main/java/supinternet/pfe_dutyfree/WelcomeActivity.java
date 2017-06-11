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

        TextView ticketCheckStatus = (TextView) findViewById(R.id.TicketCheckStatus);
        ticketCheckStatus.setText(R.string.ticketCheckText);
    }

    public void goToCatalogActivity(View v){
        Intent goToCatalogActivity = new Intent(this, CatalogActivity.class);
        startActivity(goToCatalogActivity);
    }
}
