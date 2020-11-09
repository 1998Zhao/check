package com.goxda.check.check.authenticity.impl;

import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.goxda.check.api.entity.CheckStep;
import com.goxda.check.api.entity.Metadata;
import com.goxda.check.api.entity.MetadataRule;
import com.goxda.check.api.service.IMetadataService;
import com.goxda.check.api.service.impl.MetadataServiceImpl;
import com.goxda.check.check.authenticity.IAuthenticity;

import com.goxda.check.factory.MetadataServiceSingle;
import com.goxda.check.metadate.aip.ArchivalInformationPackage;
import com.goxda.check.metadate.fixity.FixityInformation;
import com.goxda.check.result.Result;
import com.goxda.check.util.Utils;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 真实性检测
 * @author zgq
 * createTime 2020-10-27
 */
@Slf4j
public class Authenticity implements IAuthenticity {
    /**
     * 真实性检测环节
     */
    private final CheckStep checkStep;
    /**
     * 元数据
     */
    private final Metadata metadata;
    /**
     * 归档信息包
     */
    private final ArchivalInformationPackage aip;
    /**
     * 固化信息
     */
    private final FixityInformation fixityInformation;
    private final List<MetadataRule> metadataRules;

    public Authenticity(CheckStep checkStep, Metadata metadata, ArchivalInformationPackage aip, FixityInformation fixityInformation, List<MetadataRule> metadataRules) {
        this.checkStep = checkStep;
        this.metadata = metadata;
        this.aip = aip;
        this.fixityInformation = fixityInformation;
        this.metadataRules = metadataRules;
    }

    /**
     * 来源真实性检测 检测项目为固化信息有效性检测
     * 对归档电子文件中包含的数字摘要、电子签名、电子印章、时间戳等技术措施的固化信息的有效性进行验证
     * @return 是否通过
     */
    @Override
    public Result provenanceAuthenticity() {
        //数字摘要、电子签名、电子印章、时间戳

        return null;
    }

    /**
     * 数字摘要检测
     * @return 1
     */
    public Result messageDigestCheck(){
        return null;
    }
    /**
     * 电子签名检测
     * @return 1
     */
    public Result digitalSignaturesCheck(){
        return null;
    }
    /**
     * 电子印章检测
     * @return 1
     */
    public Result electronicSealCheck(){
        return null;
    }
    /**
     * 时间戳检测
     * @return 1
     */
    public Result timeStampCheck(){
        return null;
    }


    /**
     * 电子文件元数据准确性
     * 元数据项数据长度检测 a) 对数据库中电子文件元数据项进行数据项长度检测；b) 对归档信息包中元数据项进行长度检测。
     * 元数据项数据类型、格式检测 a) 对数据库中电子文件元数据项进行数据类型和格式的检测；b) 对归档信息包中元数据项进行数据类型和格式的检测
     * 设定值域的元数据项值域符合度检测 a) 对数据库中电子文件元数据项进行值域范围的检测；b) 对归档信息包中元数据项进行值域范围的检测。
     * 元数据项数据值合理性检测 a) 对数据库中电子文件元数据项进行数据值是否在合理范围内的检测；b) 对归档信息包中元数据项进行数据值是否在合理范围内的检测
     * 元数据项数据包含特殊字符检测 a) 对数据库中电子文件元数据项进行数据值是否包含特殊字符的检测；b) 对归档信息包中元数据项进行数据值是否包含特殊字符的检测
     * 档号规范性检测 a) 对数据库中的归档号/档号进行检测；b) 对归档信息包中的归档号/档号进行检测。
     * 元数据项数据重复性检测 依据用户自定义的元数据项（如：档号、文号、题名）进行数据库记录和归档信息包的数据重复性检测
     * @return 是否通过
     */
    @Override
    public Result metadataAuthenticity() {
        return null;
    }
    public Object getMetadataAttr(String name) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String methodName = Utils.getMethodName(name);
        Class<? extends Metadata> clasz = metadata.getClass();
        Method method = clasz.getDeclaredMethod(methodName);
        return method.invoke(metadata);
    }
    boolean lenCheck(MetadataRule rule) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        //获取元数据
        String name = rule.getName();
        Object attr = getMetadataAttr(name);
        return attr!=null;
    }

    /**
     * 对数据库中电子文件元数据项进行数据项长度检测
     * 检查其是否为空 再检查长度
     * @return 1
     */
    public Map<String,String> databaseMDLenCheck(MetadataRule metadataRule){
        Map<String,String> map = new HashMap<>();
        String namecn = metadataRule.getNameCn();
        String msg = "数据为空";
        try{
            if ("必选".equals(metadataRule.getConstraintion())){
                if (!lenCheck(metadataRule)){
                    map.put(namecn,msg);
                }
            }
            else if ("条件选".equals(metadataRule.getConstraintion())){
                String condition = metadataRule.getConditions();
                if (StrUtil.isNotBlank(condition)){
                    if (condition.contains(",")){
                        String [] a = condition.split(",");
                        for (String c : a) {
                            String[] kv = c.split(":");
                            //如果匹配成功 则 改元数据项必选
                            if (kv[1].equals(getMetadataAttr(kv[0]))) {
                                if (!lenCheck(metadataRule)){
                                    map.put(namecn,msg);
                                }
                            }
                        }
                    }
                    else {
                        String [] kv = condition.split(":");
                        //如果匹配成功 则 改元数据项必选
                        if (kv[1].equals(getMetadataAttr(kv[0]))){
                            if (!lenCheck(metadataRule)){
                                map.put(namecn,msg);
                            }
                        }
                    }

                }
            }
            return map;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put(namecn,"系统错误");
            log.error(e.toString());
            return map;
        }
    }

    /**
     * 对归档信息包中元数据项进行长度检测
     * @return 1
     */
    public Result archivalMDLenCheck(){
        return null;
    }
    /**
     * 此处默认已经经过长度检查 可进行类型及格式检测
     * 对数据库中电子文件元数据项进行数据类型和格式的检测
     * @return 1
     */
    public Map<String, String> databaseMDTypeCheck(MetadataRule metadataRule){
        Map<String,String> map = new HashMap<>();
        String namecn = metadataRule.getNameCn();
        String regex = metadataRule.getRegex();
        try{
            if("——".equals(metadataRule.getRegex())){
                String name = metadataRule.getName();
                Object value = getMetadataAttr(name);
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(value.toString());
                boolean b = matcher.matches();
                if (!b){
                    map.put(metadataRule.getNameCn(),"格式违规!");
                }
            }
            return map;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put(namecn,"系统错误"+e.toString());
            log.error(e.getMessage());
            return map;
        }
    }

    /**
     * 对归档信息包中元数据项进行数据类型和格式的检测
     * @return 1
     */
    public Result archivalMDTypeCheck(){
        return null;
    }
    /**
     * 对数据库中电子文件元数据项进行值域范围的检测
     * @return 1
     */
    public Map<String, String> databaseMDRangeCheck(MetadataRule metadataRule){
        Map<String,String> map = new HashMap<>();
        String namecn = metadataRule.getNameCn();
        String name = metadataRule.getName();
        String range = metadataRule.getValueRange();
        try {
            if (!"——".equals(range)){
                String [] ranges = range.split(",");
                Object value = getMetadataAttr(name);
                if (!ArrayUtil.contains(ranges,value.toString())){
                    map.put(namecn,"未按规定值");
                }
            }
            return map;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put(namecn,"系统错误");
            log.error(e.getMessage());
            return map;
        }
    }

    /**
     * 对归档信息包中元数据项进行值域范围的检测
     * @return 1
     */
    public Map<String, String> archivalMDRangeCheck(MetadataRule metadataRule){
       return null;
    }
    /**
     * 对数据库中电子文件元数据项进行数据值是否在合理范围内的检测
     * @return 1
     */
    public Result databaseMDRationalCheck(){
        return null;
    }
    /**
     * 对归档信息包中元数据项进行数据值是否在合理范围内的检测
     * @return 1
     */
    public Map<String, String> archivalMDRationalCheck(MetadataRule metadataRule){
        return databaseMDTypeCheck(metadataRule);
    }
    /**
     * 对数据库中电子文件元数据项进行数据值是否包含特殊字符的检测
     * @return 1
     */
    public Result databaseMDCharCheck(){

        return null;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Object s = 123123;
        System.out.println(s.toString());
    }
    /**
     * 对归档信息包中元数据项进行数据值是否包含特殊字符的检测
     * @return 1
     */
    public Result archivalMDCharCheck(){
        return null;
    }
    /**
     * 对归档信息包中中的归档号/档号进行检测
     * @return 1
     */
    public Map<String, String> archivalMDCodeCheck(){
        Map<String,String> map = new HashMap<>();
        //获取档号命名规则 对档号的构成部分进行检测
        try {
            String rule = (String) getMetadataAttr("archivalCodeRule");
            //此处是所有档号构成元素名字
            String[] child = rule.split(",");
            //获取元素对应的规范
            MetadataRule metadataRule;
            String regex,value;
            for (String s : child) {
                metadataRule = metadataRules.stream().filter(r -> r.getName().equals(s)).findFirst().orElse(new MetadataRule());
                regex = metadataRule.getRegex();
                if (!"——".equals(regex)){
                    Pattern pattern = Pattern.compile(regex);
                    value = (String) getMetadataAttr(metadataRule.getName());
                    boolean b = pattern.matcher(value).matches();
                    if (!b){
                        map.put(metadataRule.getNameCn(),"档号不规范");
                    }
                }
            }
            return map;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            map.put("档号检测","系统错误");
            log.error(e.getMessage());
            return map;
        }
    }
    /**
     * 对数据库中的归档号/档号进行检测
     * @return 1
     */
    public Result databaseMDCodeCheck(){
        return null;
    }
    /**
     * @return 1
     * 重复性检验
     */
    public Map<String,String> databaseMDRepeatCheck(MetadataRule metadataRule){
        Map<String,String> map = new HashMap<>();
        String name = metadataRule.getName();
        String namecn = metadataRule.getNameCn();
        try{
            if ("不可重复".equals(metadataRule.getRepeatability())){
                IMetadataService service = MetadataServiceSingle.getInstance();
                String v = (String) getMetadataAttr(name);
                boolean b = service.checkRepeat(name,v);
                if (b){
                    map.put(namecn,"数据重复");
                }
            }
            return map;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put("重复性检测","系统错误");
            log.error(e.getMessage());
            return map;
        }
    }
    /**
     * 重复性检验
     */
    public Result archivalMDRepeatCheck(){
        return null;
    }
    /**
     * 电子文件真实
     * @return 是否通过
     * 检测对象 归档电子文件内容数据
     * 捕获电子文件内容数据的电子属性信息（计算机文件名、文件大小、文件格式、创建时间等）
     * 与电子属性信息中记录的数据进行比对
     */
    @Override
    public Result electronicDocumentAuthenticity() {
        return new Result(true);
    }
    public Map<String,String> checkComputerFileName(MetadataRule rule){
        Map<String,String> map =new HashMap<>();
        try{

            File file = getFile();
            if (!file.exists()){
                map.put("计算机文件名","对应文件不存在");
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put("计算机文件名","系统错误");
            log.error(e.getMessage());
            return map;
        }
        return map;
    }
    public Map<String,String> checkComputerFileSize(MetadataRule rule){
        String l = "computer file size";
        Map<String,String> map =new HashMap<>();
        try{
            File file = getFile();
            String fileLength  = (String) getMetadataAttr(l);
            if (!fileLength.equals(String.valueOf(file.length()))){
                map.put("计算机文件大小","文件大小不一致");
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put("计算机文件大小","系统错误");
            log.error(e.getMessage());
            return map;
        }
        return map;
    }
    public File getFile() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String name = "computer file name";
        String filename = (String) getMetadataAttr(name);
        return new File(filename);
    }
    public Map<String,String> checkFormatInformation(MetadataRule rule){
        String l = "format information";
        Map<String,String> map =new HashMap<>();
        String namecn = "计算机文件类型";
        try{
            File file = getFile();
            String fileLength  = (String) getMetadataAttr(l);
            if (!fileLength.equals(String.valueOf(file.length()))){
                map.put(namecn,"文件大小不一致");
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            map.put(namecn,"系统错误");
            log.error(e.getMessage());
            return map;
        }
        return map;
    }

    /**
     * 元数据与内容关联真实性检测
     * @return 是否通过
     */
    @Override
    public boolean metadataRelevanceDocumentAuthenticity() {
        return false;
    }

    /**
     * 关联性检测
     * 首先找到文件 获取文件的属性 内容 等信息
     * 再与元数据进行比对 元数据比对项 可由数据库查询得出
     * @param rule
     * @return
     */
    public Map<String,String> checkMetadataRelevanceDocument(MetadataRule rule){

        return null;
    }

    /**
     * 归档信息包真实性检测
     * @return 是否通过
     */
    @Override
    public boolean archivePacketAuthenticity() {
        return false;
    }

}
