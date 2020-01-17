package com.example.spring_demo.service;

import com.example.spring_demo.entity.PmsBrand;

import java.util.List;

/**
 * PmsBrandService
 *
 * @author lizengcai
 * @date 2019/12/30
 */
public interface PmsBrandService {

    /**
     * 展示所有的品牌
     * @return
     */
    List<PmsBrand> listAllBrand();

    List<PmsBrand> listBrand(int pageNum, int pageSize);
}
