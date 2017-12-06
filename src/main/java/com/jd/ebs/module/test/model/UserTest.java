package com.jd.ebs.module.test.model;

import com.jd.ebs.jframework.model.AutoIncrementIdModel;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by trons on 16-4-17.
 */
@Table(name = "user_test")
public class UserTest extends AutoIncrementIdModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private Integer createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

}
