package com.trash.service;

import com.trash.pojo.Rubbish;
import com.trash.pojo.RubbishCan;

import java.util.List;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/30 0:06
 */
public interface GameService {
    List<Rubbish> randomRubbish();

    int checkSort(Rubbish rs, RubbishCan rc);
}
