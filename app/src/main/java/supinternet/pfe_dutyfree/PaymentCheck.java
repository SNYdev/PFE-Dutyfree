package supinternet.pfe_dutyfree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PaymentCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_check);

        TextView paymentCheckStatus = (TextView) findViewById(R.id.PaymentCheckStatus);
        paymentCheckStatus.setText(R.string.cashPaymentCheckText);
    }
}
