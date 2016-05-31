package yinlei.observer.first;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wuyin on 2016/5/28.
 */
public class DetailViewTwo implements Observer {
    @Override
    public void update(Observable observable, Object data) {
        Log.d("DetailViewTwo", "你的爸爸观察到了你哈");
    }
}
