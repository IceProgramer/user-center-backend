package com.yupi.usercenter.once;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * 导入星球用户到数据库
 */
public class ImportXingQiuUser {

    public static void main(String[] args) {
        String fileName = "/Users/chenjiahan/项目开发/user-center-backend/src/main/resources/testExcel.xlsx";
        List<XingQiuUserInfo> totalDataList =
                EasyExcel.read(fileName).head(XingQiuUserInfo.class).sheet().doReadSync();
        for (XingQiuUserInfo xingQiuUserInfo : totalDataList) {
            System.out.println(xingQiuUserInfo);
        }
        
    }

}
