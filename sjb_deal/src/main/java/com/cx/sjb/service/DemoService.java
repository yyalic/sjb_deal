package com.cx.sjb.service;

import com.cx.sjb.mapper.DemoMapper;
import com.cx.sjb.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Administrator on 2018/6/12.
 */
@Service
public class DemoService
{
    @Autowired
    private DemoMapper demoMapper;

    /**
     * 插入demo
     *
     * @param demo
     * @return
     */
    public void insert(Demo demo)
    {
        demoMapper.insert(demo);
    }
}
