package yinlei.observer.first;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wuyin on 2016/5/28.
 * 观察者
 */
public class DetailView implements Observer {

    //当被观察者数据发生变化的时候，调用该方法
    @Override
    public void update(Observable observable, Object data) {
        Log.d("DetailView", "观察到了变化");
        System.out.println("你好");
    }
}
