package com.trash.service;

import com.trash.dao.RubbishCanDao;
import com.trash.pojo.Rubbish;
import com.trash.pojo.RubbishCan;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 0:34
 */
public class RubbishCanServiceImp implements RubbishCanService{
    private RubbishCanDao rcd = new RubbishCanDao();

    @Override
    public boolean man(RubbishCan rc) {
        RubbishCan rcl = rcd.selectByRname(rc);

        if(rcl.getSjlr() >= rcl.getRl()){
            return false;
        }
        return true;
    }
}
