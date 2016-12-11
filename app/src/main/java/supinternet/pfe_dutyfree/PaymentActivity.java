package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_activity);
        Intent i = getIntent();
        String code = i.getStringExtra("CatalogActivity.code");
        TextView textView = (TextView)findViewById(R.id.text_view);
        textView.setText(code);

        Button cashPayement = (Button) findViewById(R.id.cashPayment);
        cashPayement.setText(R.string.cashPayment);
    }

    public void goToPaymentCheckActivity(View v){
        Intent goToPaymentCheck = new Intent(this, PaymentCheck.class);
        startActivity(goToPaymentCheck);
    }
}
