package yinlei.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import yinlei.observer.second.DetailView;
import yinlei.observer.second.DownloadManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        //观察者

        //被观察者
        manager = new DownloadManager();
       /* //添加第一个观察者
        manager.addObserver(new DetailView());  //当被观察者数据发生变化的时候，会通知观察者
        //添加第二个观察者
        manager.addObserver(new DetailViewTwo());*/

        manager.addObserver(new DetailView());
        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        manager.notifyObservers();
        Log.d("MainActivity", "你好");
        System.out.println("你好");
    }
}
