package linjw.demo.injector;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jdk.nashorn.internal.ir.annotations.Reference;

/**
 * Created by linjw on 2017/6/1.
 * e-mail : linjiawei3046@cvte.com
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface InjectView {
    int value();
}
