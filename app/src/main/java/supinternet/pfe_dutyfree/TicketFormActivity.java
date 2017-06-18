package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TicketFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_form);
        ImageButton dutyStoreLogo = (ImageButton) findViewById(R.id.goToScanImg);
        dutyStoreLogo.setImageResource(R.drawable.logo_white);
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
