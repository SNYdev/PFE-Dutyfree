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

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "dutystore@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mListview = (ListView) findViewById(R.id.listView);
        final List<Product> products = generateProducts();
        final ProductAdapter adapter = new ProductAdapter(this, products);
        mListview.setAdapter(adapter);
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

    private List<Product> generateProductTobacco(){
        List<Product> TobaccoProducts = new ArrayList<Product>();
        TobaccoProducts.add(new Product(Color.RED, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        TobaccoProducts.add(new Product(Color.RED, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        TobaccoProducts.add(new Product(Color.RED, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        TobaccoProducts.add(new Product(Color.RED, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        TobaccoProducts.add(new Product(Color.RED, "Marlboro Box", "Marlboro Box. 10 packs per carton. Under age sales prohibited. (200 cigarettes)", "42"));
        return TobaccoProducts;
    }

    private List<Product> generateProductAlcohol(){
        List<Product> AlcoholProducts = new ArrayList<Product>();
        AlcoholProducts.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        AlcoholProducts.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        AlcoholProducts.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        AlcoholProducts.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        AlcoholProducts.add(new Product(Color.GREEN, "Grey Goose 1 Liter", "Grey Goose Vodka is the winner of the World Spirits Championships and it’s the only Platinum Medal recipient.", "34"));
        return AlcoholProducts;
    }

    private List<Product> generateProductSweets(){
        List<Product> SweetsProducts = new ArrayList<Product>();
        SweetsProducts.add(new Product(Color.YELLOW, "Toblerone Variety ", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        SweetsProducts.add(new Product(Color.YELLOW, "Toblerone Variety ", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        SweetsProducts.add(new Product(Color.YELLOW, "Toblerone Variety ", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        SweetsProducts.add(new Product(Color.YELLOW, "Toblerone Variety ", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        SweetsProducts.add(new Product(Color.YELLOW, "Toblerone Variety ", "Discover the Toblerone flavor variety in an attractive and travel retail exclusive pack depicting the Swiss mountain landscape.", "23"));
        return SweetsProducts;

    }

    private List<Product> generateProductJewelry(){
        List<Product> JewelryProducts = new ArrayList<Product>();
        JewelryProducts.add(new Product(Color.CYAN, "Bohemian Harmony Bracelet", "It’s all about the nature of simplicity and charm. Black, light yellow and gunmetal stones dance harmoniously in a brown leather cord to give you the daily look you are going for. 33.5’’ long", "22"));
        JewelryProducts.add(new Product(Color.CYAN, "Bohemian Harmony Bracelet", "It’s all about the nature of simplicity and charm. Black, light yellow and gunmetal stones dance harmoniously in a brown leather cord to give you the daily look you are going for. 33.5’’ long", "22"));
        JewelryProducts.add(new Product(Color.CYAN, "Bohemian Harmony Bracelet", "It’s all about the nature of simplicity and charm. Black, light yellow and gunmetal stones dance harmoniously in a brown leather cord to give you the daily look you are going for. 33.5’’ long", "22"));
        JewelryProducts.add(new Product(Color.CYAN, "Bohemian Harmony Bracelet", "It’s all about the nature of simplicity and charm. Black, light yellow and gunmetal stones dance harmoniously in a brown leather cord to give you the daily look you are going for. 33.5’’ long", "22"));
        JewelryProducts.add(new Product(Color.CYAN, "Bohemian Harmony Bracelet", "It’s all about the nature of simplicity and charm. Black, light yellow and gunmetal stones dance harmoniously in a brown leather cord to give you the daily look you are going for. 33.5’’ long", "22"));
        return JewelryProducts;

    }

    private List<Product> generateProductKids(){
        List<Product> KidsProducts = new ArrayList<Product>();
        KidsProducts.add(new Product(Color.BLACK, "Lego® Star Wars™ Stormtrooper™ Kids’ Watch", "Stop that ship!!! Blast them!!! This fantastic new addition to the LEGO® Star Wars universe will be a delight to any wearer.", "26"));
        KidsProducts.add(new Product(Color.BLACK, "Lego® Star Wars™ Stormtrooper™ Kids’ Watch", "Stop that ship!!! Blast them!!! This fantastic new addition to the LEGO® Star Wars universe will be a delight to any wearer.", "26"));
        KidsProducts.add(new Product(Color.BLACK, "Lego® Star Wars™ Stormtrooper™ Kids’ Watch", "Stop that ship!!! Blast them!!! This fantastic new addition to the LEGO® Star Wars universe will be a delight to any wearer.", "26"));
        KidsProducts.add(new Product(Color.BLACK, "Lego® Star Wars™ Stormtrooper™ Kids’ Watch", "Stop that ship!!! Blast them!!! This fantastic new addition to the LEGO® Star Wars universe will be a delight to any wearer.", "26"));
        KidsProducts.add(new Product(Color.BLACK, "Lego® Star Wars™ Stormtrooper™ Kids’ Watch", "Stop that ship!!! Blast them!!! This fantastic new addition to the LEGO® Star Wars universe will be a delight to any wearer.", "26"));
        return KidsProducts;
    }

    private List<Product> generateProductPromotion(){
        List<Product> PromotionProducts = new ArrayList<Product>();
        PromotionProducts.add(new Product(Color.MAGENTA, "Pack Family", "SWEETS + kids jewerly + Wireless Mobile Phone Monopod", "60"));
        PromotionProducts.add(new Product(Color.MAGENTA, "Pack Beauty", "Azzaro pour Homme EDT 100ml and Free 30ml + Azzaro pour Elle EDP 75ml + Skin Caviar Luxe Cream 50m", "145"));
        PromotionProducts.add(new Product(Color.MAGENTA, "Pack Adult", "Jack Daniel's Sinatra Select 1 Liter + Marlboro Gold Pack Box Jumbo Carton ", "140"));
        return PromotionProducts;
    }

    public void goToCart(View v){
        Intent refresh =  new Intent(this, CartActivity.class);
        System.out.println("Intent GoToCart : "+shopSelection);
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
