package com.goxda.check.util;

import cn.hutool.core.util.StrUtil;

public class Utils {
    public static String getMethodName(String name){
        String[] strs = name.split(" ");
        StringBuilder res = new StringBuilder("get");
        for (String str : strs) {
            str = StrUtil.upperFirst(str);
            res.append(str);
        }
        return res.toString();
    }

}
