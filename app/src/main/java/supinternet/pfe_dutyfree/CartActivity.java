package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.NumberPicker;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends ActionBarActivity {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        mListView = (ListView) findViewById(R.id.listView);

        List<Cart> cart = generateCartProducts();

        CartAdapter adapter = new CartAdapter(this, cart);
        mListView.setAdapter(adapter);

    }

    private List<Cart> generateCartProducts(){
        List<Cart> cart = new ArrayList<Cart>();
        cart.add(new Cart("Cigarette Malboro", "15", 1));
        cart.add(new Cart("Parfum Coco CHANNEL", "60", 1));
        cart.add(new Cart("Crocodile Haribo", "1.50", 3));
        return cart;
    }

    public void goToTicketForm(View v){
        Intent refresh =  new Intent(this, TicketFormActivity.class);
        startActivity(refresh);
    }
}
