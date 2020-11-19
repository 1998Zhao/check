package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * M46 电子属性
 * M52 数字化属性
 * M219 编码描述
 *─M220 反编码关键字
 *─M221 编码数据
 */
@Data
public class Encoding {
    private ElectronicAttributes electronicAttributes;
    private DigitizationAttributes digitizationAttributes;
    private String encodingDescription;
    private String renderingKeyword;
    /**
     * 编码数据 = 编码数据id 引用编码数据id
     */
    private List<String> encodingData;
    public static int b(int [] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=i+1){
                return a[i]-1;
            }
        }
        return a[0];
    }

    public static void main(String[] args) {
        System.out.println(String.format("%04d",87));
    }
}
