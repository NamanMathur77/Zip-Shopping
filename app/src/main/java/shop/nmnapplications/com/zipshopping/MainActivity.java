package shop.nmnapplications.com.zipshopping;

import android.content.Intent;
import android.os.Build;
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
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);





        String newAU = "Mozilla/5.0(X11; U;Linux i686; en-US;rv:1.9.0.4) Gecko/20110101 Firefox/4.0";

        web = (WebView) findViewById(R.id.web);
        web.getSettings().setUserAgentString(newAU);

        WebSettings WebSettings = web.getSettings();
        WebSettings.setJavaScriptEnabled(true);
        WebSettings.setBuiltInZoomControls(true);
        WebSettings.setSupportZoom(true);
        web.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            web.setLayerType(View.LAYER_TYPE_HARDWARE, null);

        } else {
            web.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
        web.loadUrl("https://www.flipkart.com");
        web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else if(web.canGoBack()){
            web.goBack();

        }

        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.flipkart) {
            web.loadUrl("https://www.flipkart.com");
            web.clearHistory();
            // Handle the camera action
        } else if (id == R.id.amazon) {
            web.loadUrl("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=183d3b57-3cc3-4c96-8e30-56d3285e6e5f&ie=UTF8");
            web.clearHistory();

        } else if (id == R.id.mynta) {
            web.loadUrl("https://www.myntra.com/");
            web.clearHistory();

        } else if (id == R.id.jabong) {
            web.loadUrl("https://www.jabong.com/");
            web.clearHistory();


        } else if (id == R.id.snapdeal) {
            web.loadUrl("https://www.snapdeal.com/");

            web.clearHistory();
        }
        else if (id == R.id.yepme) {
            web.loadUrl("http://www.yepme.com/");

            web.clearHistory();
        }
        else if (id == R.id.limeroad) {
            web.loadUrl("https://www.limeroad.com/");

            web.clearHistory();
        }

        else if (id == R.id.koovs) {
            web.loadUrl("http://www.koovs.com/");

            web.clearHistory();

        }
        else if(id==R.id.zivame){
            web.loadUrl("https://www.zivame.com/");
            web.clearHistory();
        }

        else if(id==R.id.fabindia){
            web.loadUrl("https://www.fabindia.com/");
            web.clearHistory();
        }

        else if(id==R.id.ajio){
            web.loadUrl("https://www.ajio.com/");
            web.clearHistory();
        }
        else if(id==R.id.tatacliq){
            web.loadUrl("https://www.tatacliq.com/");
            web.clearHistory();
        }

        else if(id==R.id.grofers){
            web.loadUrl("https://grofers.com/");
            web.clearHistory();
        }

        else if(id==R.id.bigbasket){
            web.loadUrl("https://www.bigbasket.com/");
            web.clearHistory();
        }

        else if(id==R.id.swigy){
            web.loadUrl("https://www.swiggy.com/");
            web.clearHistory();
        }

        else if(id==R.id.foodpanda)
        {
            web.loadUrl("https://www.foodpanda.in/");
            web.clearHistory();
        }

        else if(id==R.id.lenskart)
        {
            web.loadUrl("http://www.lenskart.com/");
            web.clearHistory();
        }
        else if(id==R.id.coolwinks)
        {
            web.loadUrl("https://www.coolwinks.com/");
            web.clearHistory();
        }

        else if(id==R.id.pepperfry)
        {
            web.loadUrl("https://www.pepperfry.com/");
            web.clearHistory();
        }
        else if(id==R.id.infibeam)
        {
            web.loadUrl("https://www.infibeam.com/");
            web.clearHistory();
        }
        else if(id==R.id.firstcry)
        {
            web.loadUrl("http://www.firstcry.com/");
            web.clearHistory();
        }
        else if(id==R.id.ebay)
        {
            web.loadUrl("https://www.ebay.in/");
            web.clearHistory();
        }
        else if(id==R.id.homeshop)
        {
            web.loadUrl("http://www.homeshop18.com/");
            web.clearHistory();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
