package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.Clockin;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: ClockinMapper
 * @Datetime: 2023/05/28 00:15
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的Clockin表进行操作
 */

@Component("clockinDao") //注解:将该接口注册为一个Spring Bean，使其可以在其他地方使用@Autowired注解进行注入使用
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface ClockinMapper extends BaseMapper<Clockin> {
    // 查询所有的打卡记录
    List<Clockin> queryClockInAll(Clockin clockin);

    // 查询某个所有者在某个时间段内的打卡次数,方法参数使用了@Param注解,用于指定方法参数的名称
    Date queryCountByOwnIdAndTime(@Param("ownId") Integer ownId);
}
