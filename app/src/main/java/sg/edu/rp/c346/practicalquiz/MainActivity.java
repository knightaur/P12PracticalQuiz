package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spn1;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = findViewById(R.id.wvView);
        spn1 = findViewById(R.id.spinner1);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(false);
        webSettings.setBuiltInZoomControls(true);

        if(spn1.getSelectedItem().toString().equalsIgnoreCase("facebook")){
            wv.loadUrl("https://www.facebook.com");
        }else{
            wv.loadUrl("https://www.twitter.com");
        }

        wv.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

    }
}
