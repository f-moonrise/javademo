package com.trash.controller;

import com.trash.pojo.Rubbish;
import com.trash.pojo.RubbishCan;
import com.trash.service.RubbishCanService;
import com.trash.service.RubbishCanServiceImp;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 0:32
 */
public class RubbishCanController {
    RubbishCanService rs = new RubbishCanServiceImp();

    //判断当前垃圾桶是否满了
    public boolean man(RubbishCan rc){
        boolean b = rs.man(rc);
        return b;
    }
}
