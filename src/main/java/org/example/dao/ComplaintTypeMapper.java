package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.ComplaintType;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: ComplaintTypeMapper
 * @Datetime: 2023/07/09 22:54
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的ComplaintType表进行操作
 */

public interface ComplaintTypeMapper extends BaseMapper<ComplaintType> {
    // 该接口没有定义任何方法，因为它继承了BaseMapper接口，BaseMapper接口已经提供了一些常用的数据库操作方法，如插入、更新、删除和查询等
}

