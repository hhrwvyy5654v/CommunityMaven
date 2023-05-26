package org.example.util;

import lombok.Data;
import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.util
 * @ClassName: JsonObject
 * @Datetime: 2023/05/26 16:18
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 定义了一个泛型类JsonObject，用于封装返回给前端的JSON数据
 */

@Data
public class JsonObject<T> {
    private Integer code;   //返回状态码
    private String msg; //返回信息
    private Long count; //数据总数
    private List<T> data;   //具体返回的数据

    public JsonObject() {
    }

    public JsonObject(Integer code, String msg, Long count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

