package com.example.spring_demo.service.impl;

import com.example.spring_demo.entity.PmsBrand;
import com.example.spring_demo.entity.PmsBrandExample;
import com.example.spring_demo.mapper.PmsBrandMapper;
import com.example.spring_demo.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * PmsBrandServiceImpl
 *
 * @author lizengcai
 * @date 2019/12/30
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Resource
    private PmsBrandMapper brandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        //return brandMapper.selectByExample(new PmsBrandExample());
        return brandMapper.getAll();
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        //设置分页参数
        PageHelper.startPage(pageNum,pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }
}
