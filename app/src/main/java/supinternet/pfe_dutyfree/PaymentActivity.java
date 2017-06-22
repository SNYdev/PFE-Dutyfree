package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_activity);
        Button cashPayement = (Button) findViewById(R.id.cashPayment);
        cashPayement.setText(R.string.cashPayment);
    }

    public void goToPaymentCheckActivity(View v){
        EditText creditCardNumber = (EditText) findViewById(R.id.creditCardNumber);
        EditText creditCardCryptogram = (EditText) findViewById(R.id.creditCardCryptogram);
        if (creditCardNumber.getText().toString().trim().length() != 16 || creditCardCryptogram.getText().toString().trim().length() != 3) {
            String invalidCardInfo = getResources().getString(R.string.invalidCardInfo);
            Toast.makeText(this, invalidCardInfo, Toast.LENGTH_LONG).show();
        } else {
            Intent goToPaymentCheck = new Intent(this, PaymentCheck.class);
            startActivity(goToPaymentCheck);
        }
    }
}
