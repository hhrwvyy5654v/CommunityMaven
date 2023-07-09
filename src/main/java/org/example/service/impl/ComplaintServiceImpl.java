package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.ComplaintMapper;
import org.example.model.Complaint;
import org.example.service.IComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: ComplaintServiceImpl
 * @Datetime: 2023/06/01 21:57
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IComplaintService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<ComplaintMapper, Complaint>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class ComplaintServiceImpl extends ServiceImpl<ComplaintMapper, Complaint> implements IComplaintService {

    @Autowired  // 将ComplaintMapper对象注入到ComplaintServiceImpl类中的ComplaintDao属性中
    private ComplaintMapper complaintDao;   // 一个ComplaintMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的投诉信息
    public PageInfo<Complaint> findComplaintAll(int page, int pagesize, Complaint complaint) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pagesize);
        // 调用complaintDao的queryComplaintAll方法来查询建筑信息
        List<Complaint> list = complaintDao.queryComplaintAll(complaint);
        // 将查询结果封装成PageInfo对象并返回
        PageInfo<Complaint> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    // 用于分页查询投诉信息
    public IPage<Complaint> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Complaint> wherePage = new Page<>(page, pageCount);
        // 创建一个Complaint对象，作为查询条件
        Complaint where = new Complaint();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 用于添加投诉信息
    public int add(Complaint complaint) {
        // 调用baseMapper的insert方法来插入数据，并返回插入的行数
        return baseMapper.insert(complaint);
    }

    @Override
    // 用于删除投诉信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来插入数据，并返回插入的行数
        return baseMapper.deleteById(id);
    }

    @Override
    // 用于更新投诉信息
    public int updateData(Complaint complaint) {
        // 调用baseMapper的updateById方法来更新数据，并返回更新的行数
        return baseMapper.updateById(complaint);
    }

    @Override
    // 用于根据ID查询投诉信息
    public Complaint findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据，并返回查询结果
        return baseMapper.selectById(id);
    }
}

