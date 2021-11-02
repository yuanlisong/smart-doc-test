package com.yuanlisong.smartdoctest.controller;

import com.yuanlisong.smartdoctest.common.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品品牌管理
 */
@RestController
@RequestMapping("/test")
public class PmsBrandController {

	/**
	 * 分页查询品牌列表
	 *
	 * @param pageNum 页码
	 * @param pageSize 分页大小
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public CommonResult listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
	                              @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {

		return new CommonResult(200, "测试消息");
	}
}
