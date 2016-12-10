package com.heima.myapplication;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.heima.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        使用db_util.sc_view方法赋值给binding，就拿到含这样的binding对象，方法内带2个参数一个父类对象引用this，一个布局文件名
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        创建类User里的user对象
        User user = new User("麻痹我花了整天", "就这吊玩意我不吃透你不姓林");
//        用对象binding调用setUser方法拿到控件，传入user来运行
        binding.setUser(user);
    }

}
