package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaymentCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_check);

        TextView paymentCheckStatus = (TextView) findViewById(R.id.PaymentCheckStatus);
        paymentCheckStatus.setText(R.string.cashPaymentCheckText);
    }

    public void goToCatalogActivity(View v){
        Intent goToCatalogActivity = new Intent(this, CatalogActivity.class);
        startActivity(goToCatalogActivity);
    }
}
