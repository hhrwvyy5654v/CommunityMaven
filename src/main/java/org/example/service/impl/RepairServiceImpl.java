package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.RepairMapper;
import org.example.model.Repair;
import org.example.model.Tongji;
import org.example.service.IRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: RepairServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IRepairService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<RepairMapper, Repair>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class RepairServiceImpl extends ServiceImpl<RepairMapper, Repair> implements IRepairService {

    @Autowired  // 将RepairMapper对象注入到RepairServiceImpl类中的repairDao属性中
    private RepairMapper repairDao; // 一个RepairMapper类型的属性，用于进行数据库操作

    @Override
    // 分页查询所有的报修信息
    public PageInfo<Repair> findRepairAll(int page, int pagesize, Repair repair) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pagesize);
        // 调用repairDao的queryBuildAll方法来查询建筑信息
        List<Repair> list = repairDao.queryRepairAll(repair);
        // 将查询结果封装成PageInfo对象并返回
        PageInfo<Repair> pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    // 查询所有的报修信息
    public List<Repair> queryList() {
        // 调用repairDao的queryRepairAll方法来查询数据
        return repairDao.queryRepairAll(null);
    }


    @Override
    // 分页查询报修信息
    public IPage<Repair> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Repair> wherePage = new Page<>(page, pageCount);
        // 创建一个Repair对象，作为查询条件
        Repair where = new Repair();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 添加报修信息
    public int add(Repair repair) {
        // 调用baseMapper的insert方法来插入数据
        return baseMapper.insert(repair);
    }

    @Override
    // 删除报修信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新报修信息
    public int updateData(Repair repair) {
        // 调用baseMapper的updateById方法来更新指定ID的数据
        return baseMapper.updateById(repair);
    }

    @Override
    // 根据ID查询指定的报修信息
    public Repair findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.selectById(id);
    }

    @Override
    // 查询统计信息
    public List<Tongji> queryTongji() {
        // 调用repairDao的queryTongji方法来查询数据
        return repairDao.queryTongji();
    }
}


