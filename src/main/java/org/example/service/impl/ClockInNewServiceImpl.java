package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.ClockinnewMapper;
import org.example.model.Clockinnew;
import org.example.service.IClockInNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: ClockInNewServiceImpl
 * @Datetime: 2023/06/01 21:57
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"ClockInNewService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<BuildingMapper, Building>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class ClockInNewServiceImpl extends ServiceImpl<ClockinnewMapper, Clockinnew> implements IClockInNewService {

    @Autowired  // 将ClockinMapper对象注入到ClockinServiceImpl类中的ClockinDao属性中
    private ClockinnewMapper clockInNewDao; // 一个ClockinMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的健康状况信息
    public PageInfo<Clockinnew> queryClockInAll(int pageNum, int pageSize, Clockinnew clockinnew) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(pageNum, pageSize);
        // 调用clockInNewDao的queryBuildAll方法来查询建筑信息
        List<Clockinnew> list = clockInNewDao.queryClockInAll(clockinnew);
        // 返回PageInfo对象,供调用者使用
        return new PageInfo<>(list);
    }

    @Override
    // 用于分页查询健康状况信息
    public IPage<Clockinnew> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Clockinnew> wherePage = new Page<>(page, pageCount);
        // 创建一个Clockinnew对象，作为查询条件
        Clockinnew where = new Clockinnew();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 用于添加健康状况信息
    public int add(Clockinnew clockinnew) {
        return baseMapper.insert(clockinnew);
    }

    @Override
    // 用于删除健康状况信息
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    // 用于更新健康状况信息
    public int updateData(Clockinnew clockinnew) {
        return baseMapper.updateById(clockinnew);
    }

    @Override
    // 用于根据id查询健康状况信息
    public Clockinnew findById(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    // 用于查询某个用户在某个时间段内的健康状况打卡次数
    public Date queryCountByOwnId(Integer ownerId) {
        return clockInNewDao.queryCountByOwnId(ownerId);
    }
}

