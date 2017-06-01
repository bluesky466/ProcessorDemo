package linjw.demo.processordemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import linjw.demo.injector.InjectView;
import linjw.demo.injector.ViewInjector;

public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.label)
    TextView mLabel;

    @InjectView(R.id.button)
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewInjector.inject(this);

        mLabel.setText("MainActivity");

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
