package com.lvxin.test.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvxin.test.common.Result;
import com.lvxin.test.common.ServiceResult;
import com.lvxin.test.service.Test1Service;
import com.lvxin.test.vo.query.test1.TestQueryVo;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "导购用户信息接口", description = "用户信息接口")
@RestController
@RequestMapping("/Test")
public class TestController {
	@Autowired
	private Test1Service testService;
	@ApiOperation(value = "获取用户信息列表接口", notes = "获取用户信息列表")
	@RequestMapping(value = "/getTestInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Result<TestQueryVo> getUserInfoByShopId() {
		Result<TestQueryVo> result = new Result<>();
		ServiceResult<TestQueryVo> serviceResult = testService.getTestInfo();
		result.setCode(serviceResult.getMsgCode());
		result.setDataMap(serviceResult.getData());
		result.setMessage(serviceResult.getComment());
		return result;
	}
}
