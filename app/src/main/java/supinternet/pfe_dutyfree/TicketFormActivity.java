package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class TicketFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_form);
        ImageButton dutyStoreLogo = (ImageButton) findViewById(R.id.goToScanImg);
        dutyStoreLogo.setImageResource(R.drawable.logo_white);
    }

    public void sendTicketNumber(View v) {
        EditText ticketNumber = (EditText) findViewById(R.id.ticketNumber);
        if (ticketNumber.getText().toString().trim().length() == 0) {
            String emptyTxt = getResources().getString(R.string.emptyTxt);
            Toast.makeText(this, emptyTxt, Toast.LENGTH_LONG).show();
        } else {
            Intent refresh = new Intent(this, NavigationActivity.class);
            startActivity(refresh);
        }
    }

    public void goToScan(View v) {
        Intent refresh =  new Intent(this, ScannerActivity.class);
        startActivity(refresh);
    }
}
