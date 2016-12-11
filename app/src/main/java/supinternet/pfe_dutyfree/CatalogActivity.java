package supinternet.pfe_dutyfree;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CatalogActivity extends AppCompatActivity {

    ListView mListView;
    List<String> shopSelection;
    Map<String, String> data = new HashMap<String, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        Intent i = getIntent();

        mListView = (ListView) findViewById(R.id.listView);
        final List<Product> products = generateProducts();

        final ProductAdapter adapter = new ProductAdapter(this, products);
        mListView.setAdapter(adapter);
        shopSelection = adapter.getShopSelection();
        data = adapter.data;
    }

    private List<Product> generateProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(Color.RED, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        products.add(new Product(Color.BLUE, "Bottega 750ml", "Bottega Stardust is a unique Italian sparkling wine made from grapes from the romantic Prosecco hills.", "129"));
        products.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        products.add(new Product(Color.RED, "Toblerone Pack", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        products.add(new Product(Color.GRAY, "Warm Regards Travel Gift ", "Whether you’re embarking on a journey or returning from one, what better way to relax than with a unique travel gift. ", "18"));
        products.add(new Product(Color.BLACK, "Bolzano Black Watch", "Bolzano’s sleek and stylish black ceramic watch is the perfect addition to any collection.", "125"));
        products.add(new Product(Color.BLUE, "Michael D Leather Watch", "Enjoy the simplicity and luxury of Michael D’s innovative designs. Combining elements of distinction as its beautiful matte leather strap with a flat mineral glass, stainless steel back case, 14K Gold ion-plated sphere you could just indulge in perfection. Swiss movement and Water resistant up to 5 ATM.", "99"));
        products.add(new Product(Color.GREEN, "Alien Initiatic Thierry Mugler", "Illuminate yourself with the luminous and vibrant notes of Alien Eau de Parfum, or sparkle with the radiant and dazzling Eau de Toilette miniature.30ml NR + 5ml Miniature.", "62"));
        products.add(new Product(Color.RED, "Marlboro Box Carton", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        products.add(new Product(Color.BLUE, "Bottega Prosecco 750ml", "Bottega Stardust is a unique Italian sparkling wine made from grapes from the romantic Prosecco hills.", "129"));
        products.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        products.add(new Product(Color.RED, "Toblerone Variety ", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        products.add(new Product(Color.GRAY, "Warm Regards Travel London", "Whether you’re embarking on a journey or returning from one, what better way to relax than with a unique travel gift. ", "18"));
        products.add(new Product(Color.BLACK, "Bolzano Black Ceramic ", "Bolzano’s sleek and stylish black ceramic watch is the perfect addition to any collection.", "125"));
        products.add(new Product(Color.BLUE, "Michael D Brown Leather ", "Enjoy the simplicity and luxury of Michael D’s innovative designs. Combining elements of distinction as its beautiful matte leather strap with a flat mineral glass, stainless steel back case, 14K Gold ion-plated sphere you could just indulge in perfection. Swiss movement and Water resistant up to 5 ATM.", "99"));
        products.add(new Product(Color.GREEN, "Alien Initiatic Thierry Mugler", "Illuminate yourself with the luminous and vibrant notes of Alien Eau de Parfum, or sparkle with the radiant and dazzling Eau de Toilette miniature.30ml NR + 5ml Miniature.", "62"));
        return products;
    }

    public void goToCart(View v){
        Intent refresh =  new Intent(this, CartActivity.class);
        System.out.println("Intent GoToCart : "+shopSelection);
        System.out.println("Intent data : "+data);
        refresh.putExtra("shopList", (HashMap<String, String>) data);
        startActivity(refresh);
    }
}
