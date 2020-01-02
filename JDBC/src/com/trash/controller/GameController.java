package com.trash.controller;

import com.trash.pojo.Rubbish;
import com.trash.pojo.RubbishCan;
import com.trash.service.GameService;
import com.trash.service.GameServiceImpl;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/29 23:56
 */
public class GameController {
    private GameService gs = new GameServiceImpl();

    //随机分配垃圾
    public List<Rubbish> randomRubbish(){
        return gs.randomRubbish();
    }

    //积分排序
    public int checkSort(Rubbish rs, RubbishCan rc){
        int i = gs.checkSort(rs,rc);
        return 0;
    }
}
