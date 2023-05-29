package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.Clockinnew;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: Clockinnew
 * @Datetime: 2023/05/28 01:13
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的Clockinnew表进行操作
 */
@Component("clockInNewDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方被注入使用
public interface ClockinnewMapper extends BaseMapper<Clockinnew> {

    List<Clockinnew> queryClockInAll(Clockinnew clockinnew);    //查询所有的打卡记录

    Date queryCountByOwnId(Integer ownId);  // 查询某个所有者的打卡数量
}