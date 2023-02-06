package com.yupi.usercenter.once;

import com.alibaba.excel.EasyExcel;

/**
 * 导入excel数据
 */
public class importExcel {

    /**
     * 读取数据
     *
     * 监听器法
     */
    public static void main(String[] args) {
        // 写法1：JDK8+ ,不用额外写一个DemoDataListener
        // since: 3.0.0-beta1
        String fileName = "/Users/chenjiahan/项目开发/user-center-backend/src/main/resources/testExcel.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        // 这里每次会读取100条数据 然后返回过来 直接调用使用数据就行
        EasyExcel.read(fileName, XingQiuUserInfo.class, new TableListener()).sheet().doRead();

    }

    //
}
