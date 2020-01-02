package com.trash.controller;

import com.trash.pojo.Rubbish;
import com.trash.service.RubbishService;
import com.trash.service.RubbishServiceImpl;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/29 23:44
 */
public class RubbishController {
    private RubbishService rs = new RubbishServiceImpl();

    public List<Rubbish> getAll(){
        List<Rubbish> all = rs.getAll();
        return all;
    }
}
