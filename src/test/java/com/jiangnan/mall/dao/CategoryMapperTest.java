package com.jiangnan.mall.dao;

import com.jiangnan.mall.MallApplicationTests;
import com.jiangnan.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Zhen Ren
 * @create 2023-04-02 23:38
 */

public class CategoryMapperTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findById() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryById() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }
}