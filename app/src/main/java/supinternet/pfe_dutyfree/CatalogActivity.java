package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CatalogActivity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        Intent i = getIntent();

        mListView = (ListView) findViewById(R.id.listView);

        List<Product> tweets = genererTweets();

        ProductAdapter adapter = new ProductAdapter(CatalogActivity.this, tweets);
        mListView.setAdapter(adapter);
    }

    private List<Product> genererTweets(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(Color.BLACK, "Florent", "Mon premier tweet !"));
        products.add(new Product(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        products.add(new Product(Color.GREEN, "Logan", "Que c'est beau..."));
        products.add(new Product(Color.RED, "Mathieu", "Il est quelle heure ??"));
        products.add(new Product(Color.GRAY, "Willy", "On y est presque"));
        products.add(new Product(Color.BLACK, "Florent", "Mon premier tweet !"));
        products.add(new Product(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        products.add(new Product(Color.GREEN, "Logan", "Que c'est beau..."));
        products.add(new Product(Color.RED, "Mathieu", "Il est quelle heure ??"));
        products.add(new Product(Color.GRAY, "Willy", "On y est presque"));
        products.add(new Product(Color.BLACK, "Florent", "Mon premier tweet !"));
        products.add(new Product(Color.BLUE, "Kevin", "C'est ici que ça se passe !"));
        products.add(new Product(Color.GREEN, "Logan", "Que c'est beau..."));
        products.add(new Product(Color.RED, "Mathieu", "Il est quelle heure ??"));
        products.add(new Product(Color.GRAY, "Willy", "On y est presque"));
        return products;
    }

    public void goToTicketForm(View v){
        Intent refresh =  new Intent(this, TicketFormActivity.class);
        startActivity(refresh);
    }
}
