package xyz.sangcomz.xotextviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import xyz.sangcomz.xotextview.XOBuilder;

import static xyz.sangcomz.xotextview.XOBuilder.STYLE_COMMENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup root = (ViewGroup) findViewById(R.id.root);


        root.addView(
                XOBuilder.with(this, "XOBuilder")
                        .setStyle(STYLE_COMMENT)
                        .setTextSize(20)
                        .get()
        );
    }
}
