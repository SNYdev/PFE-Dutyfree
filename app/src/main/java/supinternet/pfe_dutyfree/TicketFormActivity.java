package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TicketFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_form);
    }

    public void sendTicketNumber(View v) {
        Intent refresh =  new Intent(this, NavigationActivity.class);
        startActivity(refresh);
    }

    public void goToScan(View v) {
        Intent refresh =  new Intent(this, ScannerActivity.class);
        startActivity(refresh);
    }
}
