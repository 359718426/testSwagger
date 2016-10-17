package com.lvxin.test.service;

import com.lvxin.test.common.ServiceResult;
import com.lvxin.test.vo.query.test1.TestQueryVo;

public interface Test1Service {
    ServiceResult<TestQueryVo> getTestInfo();
}
