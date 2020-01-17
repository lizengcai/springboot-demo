package com.example.spring_demo.controller;

import com.example.spring_demo.component.api.CommonResult;
import com.example.spring_demo.entity.PmsBrand;
import com.example.spring_demo.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * PmsBrandController
 * 品牌管理Controller
 * @author lizengcai
 * @date 2019/11/9
 */
@Api(tags = "PmsBrandController", description = "品牌管理" )
@RestController
@RequestMapping("/brand")
public class PmsBrandController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @Autowired
    private PmsBrandService pmsBrandService;

    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrand());
    }


    @ApiOperation("分页查询品牌列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1")
                                                      @ApiParam("页码")Integer pageNum,
                                                  @RequestParam(value = "pageSize", defaultValue = "3")
                                                      @ApiParam("每页数量")  Integer pageSize) {
        return CommonResult.success(pmsBrandService.listBrand(pageNum,pageSize));
    }




}
