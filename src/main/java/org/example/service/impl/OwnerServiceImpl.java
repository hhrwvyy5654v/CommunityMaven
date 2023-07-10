package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.OwnerMapper;
import org.example.model.Owner;
import org.example.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: OwnerServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IOwnerService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<OwnerMapper, Owner>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class OwnerServiceImpl extends ServiceImpl<OwnerMapper, Owner> implements IOwnerService {
    @Autowired  // 将OwnerMapper对象注入到OwnerServiceImpl类中的ownerDao属性中
    private OwnerMapper ownerDao;   // 一个OwnerMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的房屋信息
    public PageInfo<Owner> findOwnerAll(int page, int pageSize, Owner owner) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page,pageSize);
        // 调用ownerDao的queryBuildAll方法来查询业主信息
        List<Owner> list=ownerDao.queryOwnerAll(owner);
        // 将查询结果封装成PageInfo对象并返回
        PageInfo<Owner> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    // 用于分页查询业主信息
    public IPage<Owner> findListByPage(Integer page, Integer pageCount){
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Owner> wherePage = new Page<>(page, pageCount);
        // 创建一个Owner对象，作为查询条件
        Owner where = new Owner();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return  baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 根据姓名查询业主信息
    public Owner queryOwnerByName(String username) {
        return ownerDao.queryOwnerByName(username);
    }

    @Override
    // 添加业主信息
    public int add(Owner owner){
        return baseMapper.insert(owner);
    }

    @Override
    // 删除业主信息
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新业主信息
    public int updateData(Owner owner){
        return baseMapper.updateById(owner);
    }

    @Override
    // 根据ID查询业主信息
    public Owner findById(Long id){
        return  baseMapper.selectById(id);
    }

    @Override
    // 根据姓名删除业主信息
    public void deleteOwnerUserByUserName(String username) {
        ownerDao.deleteOwnerUserByUserName(username);
    }

    @Override
    // 根据ID查询业主信息
    public Owner queryOwnerById(long parseLong) {
        return ownerDao.queryOwnerById(parseLong);
    }
}

