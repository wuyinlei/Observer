package yinlei.observer.first;

import java.util.Observable;

/**
 * Created by wuyin on 2016/5/28.
 * 被观察者
 */
public class DownloadManager extends Observable{

    //有内容发生了改变
    @Override
    public boolean hasChanged() {
        return true;
    }
}
