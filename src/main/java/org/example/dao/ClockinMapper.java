package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.model.Clockin;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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

@Component("clockinDao")
public interface ClockinMapper extends BaseMapper<Clockin>{
    List<Clockin> queryClockInAll(Clockin clockin);     // 查询所有的打卡记录
    Date queryCountByOwnIdAndTime(@Param("ownId") Integer ownId);   // 查询某个所有者在某个时间段内的打卡次数,方法参数使用了@Param注解,用于指定方法参数的名称
}
