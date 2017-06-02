package linjw.demo.processordemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import linjw.demo.injector.InjectView;
import linjw.demo.injector.ViewInjector;

/**
 * Created by linjw on 2017/6/1.
 * e-mail : linjiawei3046@cvte.com
 */

public class SecondActivity extends Activity {
    @InjectView(R.id.label)
    TextView mLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //使用findViewById注入被InjectView修饰的成员变量
        ViewInjector.inject(this);

        // ViewInjector.inject(this) 已经将mLabel赋值了,可以直接使用
        mLabel.setText("SecondActivity");
    }
}
