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
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的HouseMapper表进行操作
 */

@Component("houseDao")  //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface HouseMapper extends BaseMapper<House> {
    // 根据房屋编号查询房屋信息
    List<House> findHouseAll(@Param("number") String numbers);

    // 根据房屋ID查询房屋信息
    House queryHouseById(@Param("houId") Integer houId);
}
