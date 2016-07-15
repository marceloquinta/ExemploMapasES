package examples.android.exemplomapases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView imageView = (ImageView) findViewById(R.id.imagem);
        String url = "http://www.useragentman.com/tests/html5ImageConverter/examples/cn-tower-retina/cn-tower-600.webp";
        Picasso.with(this).load(url).placeholder(R.mipmap.ic_launcher).into(imageView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}
