package com.trash.service;

import com.trash.dao.RubbishDao;
import com.trash.pojo.Rubbish;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/29 23:46
 */
public class RubbishServiceImpl implements RubbishService{
    private RubbishDao rd = new RubbishDao();

    @Override
    public List<Rubbish> getAll() {
        List<Rubbish> li = rd.selectAll();
        return li;
    }
}
