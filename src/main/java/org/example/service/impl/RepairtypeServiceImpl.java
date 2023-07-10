package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.RepairtypeMapper;
import org.example.model.RepairType;
import org.example.service.IRepairtypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: RepairtypeServiceImpl
 * @Datetime: 2023/06/01 21:59
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IRepairTypeService"接口的服务类
 */

@Service // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<RepairtypeMapper, RepairType>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class RepairtypeServiceImpl extends ServiceImpl<RepairtypeMapper, RepairType> implements IRepairtypeService {

    @Override
    // 用于分页查询报修类型信息
    public IPage<RepairType> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<RepairType> wherePage = new Page<>(page, pageCount);
        // 创建一个RepairType对象，作为查询条件
        RepairType where = new RepairType();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 查询所有的报修类型信息
    public List<RepairType> findList() {
        // 该方法没有传入任何查询条件，所以在selectList方法中传入了null
        return baseMapper.selectList(null);
    }

    @Override
    // 添加报修类型信息
    public int add(RepairType repairtype) {
        // 调用baseMapper的insert方法来插入数据
        return baseMapper.insert(repairtype);
    }

    @Override
    // 删除报修类型信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新报修类型信息
    public int updateData(RepairType repairtype) {
        // 调用baseMapper的updateById方法来更新指定ID的数据
        return baseMapper.updateById(repairtype);
    }

    @Override
    // 根据ID查询报修类型信息
    public RepairType findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.selectById(id);
    }
}

