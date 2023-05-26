package org.example.util;

import java.io.Serializable;
import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.util
 * @ClassName: R
 * @Datetime: 2023/05/26 16:27
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个返回前端数据的封装类，用于封装接口返回的数据
 */

public class R implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code;  //返回状态码
    private String msg; //返回信息
    private Object data; //具体返回的数据
    private Long count;  //数据总数,用于分页

    public R() {
    }

    private R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data=data;
        if(data!=null){
            List list= (List) data;
            this.count=(long)list.size();
        }
    }

    //静态方法，用于快速构造返回对象(状态码，消息，具体数据)
    public static R ok(){
        return new R(Constants.OK_CODE,Constants.OK_MSG,null);
    }
    public static R ok(Object data) {
        return new R(Constants.OK_CODE, Constants.OK_MSG, data);
    }
    public static R ok(String msg, Object data) {
        return new R(Constants.OK_CODE, msg, data);
    }
    public static R fail(String msg) {
        return new R(Constants.FAIL_CODE, msg, null);
    }
    public static R fail(int errorCode, String msg) {
        return new R(errorCode, msg, null);
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getCont() {
        return count;
    }

    public void setCont(Long cont) {
        this.count = cont;
    }
}

