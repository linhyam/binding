package com.heima.myapplication;

/**
 * Created by yam on 2016/12/10.
 */
//用binding要创建类User，定义与布局文件控件内描述的类的对象，用Set,get方法设置这些值
public class User
{
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getAge() {
        return this.age;
    }
}
