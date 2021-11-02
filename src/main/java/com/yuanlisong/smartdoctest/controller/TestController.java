package com.yuanlisong.smartdoctest.controller;

import com.yuanlisong.smartdoctest.common.CommonResult;
import com.yuanlisong.smartdoctest.entity.PmsBrand;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2商品品牌管理
 */
@RestController
@RequestMapping("/test2")
public class TestController {

	/**
	 * 分页查询品牌列表
	 *
	 * @param pmsBrand 查询条件
	 */
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public CommonResult listBrand(@RequestBody PmsBrand pmsBrand) {

		return new CommonResult(200, "测试消息");
	}
}
