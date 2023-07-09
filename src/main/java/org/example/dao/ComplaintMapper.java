package org.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.model.Complaint;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.dao
 * @ClassName: ComplaintMapper
 * @Datetime: 2023/07/09 22:53
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Mybatis-Plus中的Mapper接口，用于对数据库的Complaint表进行操作
 */

@Component("complaintDao")  // 注解标记为一个组件，可以被其他组件进行依赖注入
// 接口继承了BaseMapper接口，继承了BaseMapper的常用方法，例如insert、update、delete、select等方法
public interface ComplaintMapper extends BaseMapper<Complaint> {
    // 用于查询所有的投诉记录,接收一个Complaint对象作为查询条件，返回一个List<Complaint>对象，表示查询到的投诉记录列表
    List<Complaint> queryComplaintAll(Complaint complaint);
}
