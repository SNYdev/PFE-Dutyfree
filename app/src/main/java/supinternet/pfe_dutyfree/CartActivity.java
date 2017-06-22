package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartActivity extends NavigationActivity {
    ListView mListView;
    HashMap<String, String> data = new HashMap<String, String>();
    public float total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        final TextView priceTotal = (TextView) findViewById(R.id.priceTotal);
        mListView = (ListView) findViewById(R.id.listView);
        Intent i = getIntent();
        data = (HashMap<String, String>) i.getSerializableExtra("shopList");
        final List<Cart> cart = generateCartProducts();
        CartAdapter adapter = new CartAdapter(this, cart);
        mListView.setAdapter(adapter);
        final TextView deliveryFeeTxt = (TextView) findViewById(R.id.deliveryFeeTxt);
        if (cart.size() > 0) {
            deliveryFeeTxt.setText("2.0€");
            total = total + (float)2;
        } else  {
            deliveryFeeTxt.setText("0.0€");
        }
        updateTotal(priceTotal, cart, total);

        mListView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                updateTotal(priceTotal, cart, total);
                return true;
            }
        });
    }

    private List<Cart> generateCartProducts(){
        List<Cart> cart = new ArrayList<Cart>();
        for (HashMap.Entry<String, String> entry : data.entrySet()){
            System.out.println(cart);
            cart.add(new Cart(entry.getKey(), entry.getValue(), 1));
        }
        return cart;
    }

    public void updateTotal(TextView priceTotal, List<Cart> cart, float total){
        for (int idx=0; idx<cart.size(); idx++) {
            total += Float.parseFloat(cart.get(idx).getPrice());
        }
        String priceText = Float.toString(total)+"€";
        priceTotal.setText(priceText);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.out.println("Back pressed : "+ data);
    }

    public void goToPaymentForm(View v){
        if (data.size() == 0) {
            String emptyCart = getResources().getString(R.string.emptyCart);
            Toast.makeText(this, emptyCart, Toast.LENGTH_LONG).show();
        } else {
            Intent refresh = new Intent(this, PaymentActivity.class);
            startActivity(refresh);
        }
    }
}
