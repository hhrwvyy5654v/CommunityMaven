package org.example.dao;

import org.example.model.Building;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: BuildingMapper
 * @Datetime: 2023/05/26 16:47
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的Building表进行操作
 */

//使用了@Component注解，表示该类是一个组件，会被Spring自动扫描并注册为一个Bean
//该组件的名称为"buildingDao"，可以在其他地方使用@Autowired注解进行注入
@Component("buildingDao")

// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface BuildingMapper extends BaseMapper<Building>{
    //通过传入的numbers参数进行查询，返回一个Building对象列表
    List<Building> queryBuildAll(@Param("numbers") String numbers);

    //通过传入的buildId参数进行查询，返回一个Building对象
    Building queryBuildById(@Param("buildId") Integer buildId);
}

