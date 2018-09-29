package baiduloading.ly.com.baiduloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private BaiduLoadingView baiduloading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baiduloading = (BaiduLoadingView)findViewById(R.id.baiduloading);

        baiduloading.start();
    }
}
