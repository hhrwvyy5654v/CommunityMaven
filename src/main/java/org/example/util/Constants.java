package org.example.util;

/**
 * @Project: CommunityMaven
 * @Package: org.example.util
 * @ClassName: Constants
 * @Datetime: 2023/05/26 14:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 常量类，用于定义一些常量
 */

public class Constants {
    public final static int OK_CODE = 200;    //表示请求成功的返回码，值为200
    public final static int FAIL_CODE = 400;  //表示请求失败的返回码，值为400
    public final static int OTHER_FAL_CODE = 333; //表示其它错误的返回码，值为333
    public final static String OK_MSG = "请求成功";   //表示请求成功的返回消息
    public final static String FAIL_MSG = "请求失败"; //表示请求失败的返回消息
    public final static int STATUS_0 = 1;  //表示可用状态的值，值为0
    public final static int STATUS_1 = 1; //示禁用状态的值，值为1
    public final static String CACHE_NAME = "KACache";    //表示缓存名称
}
