package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.ComplaintTypeMapper;
import org.example.model.ComplaintType;
import org.example.service.IComplaintTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: ComplaintTypeServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IComplaintTypeService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<ComplaintTypeMapper, ComplaintType>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class ComplaintTypeServiceImpl extends ServiceImpl<ComplaintTypeMapper, ComplaintType> implements IComplaintTypeService {

    @Override
    // 用于分页查询投诉类型信息
    public IPage<ComplaintType> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<ComplaintType> wherePage = new Page<>(page, pageCount);
        // 创建一个ComplaintType对象，作为查询条件
        ComplaintType where = new ComplaintType();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 用于分页查询所有的投诉类型信息
    public List<ComplaintType> queryType() {
        return baseMapper.selectList(null);
    }

    @Override
    // 用于添加投诉类型信息
    public int add(ComplaintType complaintType) {
        // 调用baseMapper的insert方法来插入数据，并返回插入的行数
        return baseMapper.insert(complaintType);
    }

    @Override
    // 用于删除投诉类型信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据，并返回删除的行数
        return baseMapper.deleteById(id);
    }

    @Override
    // 用于更新投诉类型信息
    public int updateData(ComplaintType complaintType) {
        // 调用baseMapper的updateById方法来更新指定ID的数据，并返回更新的行数
        return baseMapper.updateById(complaintType);
    }

    @Override
    // 用于根据ID查询建筑信息
    public ComplaintType findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据，并返回查询结果
        return baseMapper.selectById(id);
    }
}

