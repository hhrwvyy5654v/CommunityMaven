package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Userinfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: UserinfoMapper
 * @Datetime: 2023/05/29 10:00
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@Component("userinfoDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用

// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface UserinfoMapper extends BaseMapper<Userinfo> {
    // 查询所有的Userinfo对象，返回一个Userinfo对象的List集合
    List<Userinfo>queryUserinfoAll(Userinfo userinfo);
    // 根据用户名和密码查询Userinfo对象
    Userinfo queryUserByNameAndPwd(Userinfo userinfo);
    // 根据用户名删除Userinfo对象
    void deleteUserByUsername(@Param("username2")String username);

}
