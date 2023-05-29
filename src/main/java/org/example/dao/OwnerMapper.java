package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Owner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: OwnerMapper
 * @Datetime: 2023/05/28 01:42
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */
@Component("ownerDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface OwnerMapper extends BaseMapper<Owner> {
    // 查询所有的Owner对象，返回一个Owner对象的List集合
    List<Owner> queryOwnerAll(Owner owner);

    // 根据用户名查询Owner对象，返回一个Owner对象
    Owner queryOwnerByName(@Param("username") String username);

    // 根据用户名删除Owner对象
    void deleteOwnerUserByUserName(@Param("username2") String username);

    // 根据ID查询Owner对象
    Owner queryOwnerById(@Param("id") long parseLong);
}
