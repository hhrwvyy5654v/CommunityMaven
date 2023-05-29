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
@Component("ownerDao")
public interface OwnerMapper extends BaseMapper<Owner> {
    List<Owner> queryOwnerAll(Owner owner);

    Owner queryOwnerByName(@Param("username") String username);
    void deleteOwnerUserByUserName(@Param("username2") String username);

    Owner queryOwnerById(@Param("id") long parseLong);

}
