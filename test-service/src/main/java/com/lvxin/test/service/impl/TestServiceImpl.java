package com.lvxin.test.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lvxin.test.common.ServiceResult;
import com.lvxin.test.service.Test1Service;
import com.lvxin.test.vo.query.test1.TestQueryVo;

@Service
@org.springframework.stereotype.Service
public class TestServiceImpl implements Test1Service {

	@Override
	public ServiceResult<TestQueryVo> getTestInfo() {
		ServiceResult<TestQueryVo> s = new ServiceResult<>();
		TestQueryVo tt = new TestQueryVo();
		tt.setAddress("中国江苏南京");
		tt.setName("lvxin");
		s.setData(tt);
		s.setComment("成功查询");
		s.setMsgCode("200");
		s.setOk(Boolean.TRUE);
		return s;
	}

}
