package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView mListview;
    List<String> shopSelection;
    Map<String, String> data = new HashMap<String, String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Boolean france = intent.getBooleanExtra("detax", true);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mListview = (ListView) findViewById(R.id.listView);
        List<Product> products = new ArrayList<Product>();
        if (france) {
            products = generateProducts();
        } else {
            products = generateDetaxProducts();
        }
        final ProductAdapter adapter = new ProductAdapter(this, products);
        mListview.setAdapter(adapter);
        data = adapter.data;
    }

    private List<Product> generateDetaxProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(R.drawable.marlboro, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "35.0"));
        products.add(new Product(R.drawable.bottega, "Bottega 750ml", "Bottega Stardust is a unique Italian sparkling wine made from grapes from the romantic Prosecco hills.", "103.0"));
        products.add(new Product(R.drawable.grey_goose, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "27.0"));
        products.add(new Product(R.drawable.toblerone_pack, "Toblerone Pack", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "18.0"));
        products.add(new Product(R.drawable.warm_regardst_ravel_gift, "Warm Regards Travel Gift", "Whether you’re embarking on a journey or returning from one, what better way to relax than with a unique travel gift. ", "14.0"));
        products.add(new Product(R.drawable.bolzano_black_watch, "Bolzano Black Watch", "Bolzano’s sleek and stylish black ceramic watch is the perfect addition to any collection.", "100.0"));
        products.add(new Product(R.drawable.michael_d_leather_watch, "Michael D Leather Watch", "Enjoy the simplicity and luxury of Michael D’s innovative designs. Combining elements of distinction as its beautiful matte leather strap with a flat mineral glass, stainless steel back case, 14K Gold ion-plated sphere you could just indulge in perfection. Swiss movement and Water resistant up to 5 ATM.", "89.0"));
        products.add(new Product(R.drawable.alien_initiatic_thierry_mugler, "Alien Initiatic Thierry Mugler", "Illuminate yourself with the luminous and vibrant notes of Alien Eau de Parfum, or sparkle with the radiant and dazzling Eau de Toilette miniature.30ml NR + 5ml Miniature.", "59.0"));
        return products;
    }

    private List<Product> generateProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(R.drawable.marlboro, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42.0"));
        products.add(new Product(R.drawable.bottega, "Bottega 750ml", "Bottega Stardust is a unique Italian sparkling wine made from grapes from the romantic Prosecco hills.", "129.0"));
        products.add(new Product(R.drawable.grey_goose, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34.0"));
        products.add(new Product(R.drawable.toblerone_pack, "Toblerone Pack", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23.0"));
        products.add(new Product(R.drawable.warm_regardst_ravel_gift, "Warm Regards Travel Gift", "Whether you’re embarking on a journey or returning from one, what better way to relax than with a unique travel gift. ", "18.0"));
        products.add(new Product(R.drawable.bolzano_black_watch, "Bolzano Black Watch", "Bolzano’s sleek and stylish black ceramic watch is the perfect addition to any collection.", "125.0"));
        products.add(new Product(R.drawable.michael_d_leather_watch, "Michael D Leather Watch", "Enjoy the simplicity and luxury of Michael D’s innovative designs. Combining elements of distinction as its beautiful matte leather strap with a flat mineral glass, stainless steel back case, 14K Gold ion-plated sphere you could just indulge in perfection. Swiss movement and Water resistant up to 5 ATM.", "99.0"));
        products.add(new Product(R.drawable.alien_initiatic_thierry_mugler, "Alien Initiatic Thierry Mugler", "Illuminate yourself with the luminous and vibrant notes of Alien Eau de Parfum, or sparkle with the radiant and dazzling Eau de Toilette miniature.30ml NR + 5ml Miniature.", "62.0"));
        return products;
    }

    private List<Product> generateProductTobacco(){
        List<Product> TobaccoProducts = new ArrayList<Product>();
        TobaccoProducts.add(new Product(R.drawable.marlboro, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42.0"));
        return TobaccoProducts;
    }

    private List<Product> generateProductAlcohol(){
        List<Product> AlcoholProducts = new ArrayList<Product>();
        AlcoholProducts.add(new Product(R.drawable.grey_goose, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34.0"));
        return AlcoholProducts;
    }

    private List<Product> generateProductSweets(){
        List<Product> SweetsProducts = new ArrayList<Product>();
        SweetsProducts.add(new Product(R.drawable.toblerone_pack, "Toblerone Pack", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23.0"));
        return SweetsProducts;

    }

    private List<Product> generateProductJewelry(){
        List<Product> JewelryProducts = new ArrayList<Product>();
        JewelryProducts.add(new Product(R.drawable.bohemian_harmony_bracelet, "Bohemian Harmony Bracelet", "It’s all about the nature of simplicity and charm. Black, light yellow and gunmetal stones dance harmoniously in a brown leather cord to give you the daily look you are going for. 33.5’’ long", "22.0"));
        return JewelryProducts;

    }

    private List<Product> generateProductKids(){
        List<Product> KidsProducts = new ArrayList<Product>();
        KidsProducts.add(new Product(R.drawable.lego_star_wars_stormtrooper_kids_watch, "Lego® Star Wars™ Stormtrooper™ Kids’ Watch", "Stop that ship!!! Blast them!!! This fantastic new addition to the LEGO® Star Wars universe will be a delight to any wearer.", "26.0"));
        return KidsProducts;
    }

    private List<Product> generateProductPromotion(){
        List<Product> PromotionProducts = new ArrayList<Product>();
        PromotionProducts.add(new Product(R.drawable.pack_beauty, "Pack Family", "SWEETS + kids jewerly + Wireless Mobile Phone Monopod", "60.0"));
        return PromotionProducts;
    }

    public void goToCart(View v){
        Intent refresh =  new Intent(this, CartActivity.class);
        refresh.putExtra("shopList", (HashMap<String, String>) data);
        startActivity(refresh);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProductTobacco();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        } else if (id == R.id.nav_camera_sny){
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProducts();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        } else if (id == R.id.nav_gallery) {
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProductAlcohol();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        } else if (id == R.id.nav_slideshow) {
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProductSweets();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        } else if (id == R.id.nav_manage) {
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProductJewelry();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        } else if (id == R.id.nav_share) {
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProductPromotion();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        } else if (id == R.id.nav_send) {
            mListview = (ListView) findViewById(R.id.listView);
            final List<Product> products = generateProductKids();
            final ProductAdapter adapter = new ProductAdapter(this, products);
            mListview.setAdapter(adapter);
            data = adapter.data;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
