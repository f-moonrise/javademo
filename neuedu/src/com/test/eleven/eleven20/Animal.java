package com.test.eleven.eleven20;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/20 11:06
 */
public class Animal {
    String name;
    String action;
    String features;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAction(){
        return action;
    }

    public void setAction(String action){
        this.action=action;
    }

    public String getFeatures(){
        return features;
    }

    public void setFeatures(String features){
        this.features=features;
    }

    public void to(){
        System.out.println(name+action+features);
    }
}
