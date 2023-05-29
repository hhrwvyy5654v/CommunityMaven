package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.Carcharge;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: CarchargeMapper
 * @Datetime: 2023/05/26 17:49
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的Carcharge表进行操作
 */

@Component("carchargeDao")  //注解:将该接口注册为一个Spring Bean，使其可以在其他地方被注入使用
public interface CarchargeMapper extends BaseMapper<Carcharge> {
    List<Carcharge> queryCarCjargeAll(Carcharge carcharge); // 根据传入的Carcharge对象进行查询，返回一个Carcharge对象列表
    
}

