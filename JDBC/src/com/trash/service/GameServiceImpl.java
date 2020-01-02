package com.trash.service;

import com.trash.pojo.Rubbish;
import com.trash.pojo.RubbishCan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 0:07
 */
public class GameServiceImpl implements GameService{
    private RubbishService rs = new RubbishServiceImpl();
    private RubbishCanService rcs = new RubbishCanServiceImp();

    @Override
    public List<Rubbish> randomRubbish() {
        //从数据获取所有的垃圾
        List<Rubbish> all = rs.getAll();
        //创建集合用来存储随机拿出来的垃圾
        List<Rubbish> newLi = new ArrayList<Rubbish>();

        if(all.size() != 0){
            //创建一个随机数，用来确定随机几个垃圾
            long round = Math.round(Math.random() * all.size());
            //遍历拿出垃圾
            for(int i = 0; i < round; i++){
                //随机拿出
                int rou = (int)Math.round(Math.random() * round);
                //取出一个垃圾
                Rubbish rubbish = all.get(rou);
                //放到新的集合里
                newLi.add(rubbish);
            }
        }
        return null;
    }

    @Override
    public int checkSort(Rubbish rs, RubbishCan rc) {
        if(!rcs.man(rc)){
            return 0;
        }
        if(rs.getRtype().equals(rs.getRtype())){
            return 1;
        }else {
            return 0;
        }
    }
}
