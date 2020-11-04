package com.goxda.check.result;

import java.util.HashMap;
import java.util.Map;

/**
 * 结果定义
 * @author zgq
 */
public class Result {
    boolean check;
    Map<String,String> msgMap;

    public Result(boolean check, Map<String, String> msgMap) {
        this.check = check;
        this.msgMap = msgMap;
    }

    public Result(boolean check) {
        this.check = check;
        this.msgMap=new HashMap<>();
    }

    public Result() {
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public Map<String, String> getMsgMap() {
        return msgMap;
    }

    public void setMsgMap(Map<String, String> msgMap) {
        this.msgMap = msgMap;
    }
}
