package com.gomcarter.developer.params;

import java.util.Date;

/**
 * @ClassName JTestCase
 * @Description
 * @author gomcarter
 * @date 2019-06-17 16:41:02
 */
public class JTestCaseQueryParams {

    /**
     * @Description 主键
     */
    private Long id;

    /**
     * @Description 用例名称
     */
    private String name;
    /**
     * @Description 用户id（谁建的）
     */
    private Long fkUserId;
    /**
     * @Description 用户名称（谁建的）
     */
    private String userName;
    /**
     * @Description 备注
     */
    private String mark;
    /**
     * @Description
     */
    private Date createTime;
    /**
     * @Description
     */
    private Date modifyTime;

    public Long getId() {
       	return id;
    }

    public JTestCaseQueryParams setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public JTestCaseQueryParams setName(String name) {
        this.name = name;
        return this;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public JTestCaseQueryParams setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public JTestCaseQueryParams setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getMark() {
        return mark;
    }

    public JTestCaseQueryParams setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public JTestCaseQueryParams setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public JTestCaseQueryParams setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

}