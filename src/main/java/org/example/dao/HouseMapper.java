package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.House;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: HouseMapper
 * @Datetime: 2023/05/28 01:39
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description:
 */

@Component("houseDao")
public interface HouseMapper extends BaseMapper<House> {
    List<House> findHouseAll(@Param("number") String numbers);

    House queryHouseById(@Param("houId") Integer houId);
}
