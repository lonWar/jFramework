package com.jd.ebs.jframework.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by jinlong.hao on 16/5/25.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
