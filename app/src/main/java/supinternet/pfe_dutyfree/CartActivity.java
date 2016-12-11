package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.NumberPicker;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartActivity extends ActionBarActivity {
    ListView mListView;
    HashMap<String, String> data = new HashMap<String, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        mListView = (ListView) findViewById(R.id.listView);
        Intent i = getIntent();
        data = (HashMap<String, String>) i.getSerializableExtra("shopList");
        List<Cart> cart = generateCartProducts();
        CartAdapter adapter = new CartAdapter(this, cart);
        mListView.setAdapter(adapter);

    }

    private List<Cart> generateCartProducts(){
        List<Cart> cart = new ArrayList<Cart>();
        for (HashMap.Entry<String, String> entry : data.entrySet()){
            cart.add(new Cart(entry.getKey(), entry.getValue(), 1));
        }
        return cart;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.out.println("Back pressed : "+ data);
    }

    public void goToTicketForm(View v){
        Intent refresh =  new Intent(this, TicketFormActivity.class);
        startActivity(refresh);
    }
}
