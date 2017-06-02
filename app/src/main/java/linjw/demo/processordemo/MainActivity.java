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

//    //在非View上使用InjectView就会报错
//    @InjectView(R.id.button)
//    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //使用findViewById注入被InjectView修饰的成员变量
        ViewInjector.inject(this);

        // ViewInjector.inject(this) 已经将mLabel和mButton赋值了,可以直接使用
        mLabel.setText("MainActivity");

        mButton.setText("jump to SecondActivity");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
