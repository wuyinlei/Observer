package yinlei.observer.second;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyin on 2016/5/28.
 * 被观察者
 */
public class DownloadManager {

    public interface Observer{
        void update();
    }

    List<Observer> observers = new ArrayList<>();


    /**
     * 添加观察者
     * @param observer  观察者
     */
    public void addObserver(Observer observer){
        if (observer == null){
            throw new RuntimeException();
        }
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }


    /**
     * 通知数据发生变化
     */
    public void notifyObservers(){
        for (Observer observer:observers) {
            observer.update();
        }
    }

}
