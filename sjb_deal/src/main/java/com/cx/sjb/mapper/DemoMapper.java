package com.cx.sjb.mapper;

import com.cx.sjb.model.Demo;

import java.util.List;


/**
 * 示例
 */
public interface DemoMapper
{
    void insert(Demo demo);

    List<Demo> select();
}
