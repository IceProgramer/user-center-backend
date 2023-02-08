package com.yupi.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author chenjiahan
 */
@Data
public class PageRequest implements Serializable {

    private static final long serivalVersionUID = 1L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 当前第几页
     */
    protected int pageNum = 1;
}
