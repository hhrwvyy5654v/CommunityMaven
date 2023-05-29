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

@Component("userinfoDao")
public interface UserinfoMapper extends BaseMapper<Userinfo> {
    List<Userinfo>queryUserinfoAll(Userinfo userinfo);
    Userinfo queryUserByNameAndPwd(Userinfo userinfo);
    void deleteUserByUsername(@Param("username2")String username);

}
