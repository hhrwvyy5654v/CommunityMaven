package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.CarchargeMapper;
import org.example.model.Carcharge;
import org.example.service.ICarchargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: CarchargeServiceImpl
 * @Datetime: 2023/06/01 21:57
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"ICarchargeService"接口的服务类
 */

@Service   // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<BuildingMapper, Building>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class CarchargeServiceImpl extends ServiceImpl<CarchargeMapper, Carcharge> implements ICarchargeService {
    @Autowired  // 将CarchargeMapper对象注入到CarchargeServiceImpl类中的carchargeDao属性中
    private CarchargeMapper carchargeDao; // 一个CarchargeMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有收费信息
    public PageInfo<Carcharge> findCarchargeAll(int page, int pagesize, Carcharge carcharge) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pagesize);
        // 调用buildingDao的queryBuildAll方法来查询建筑信息
        List<Carcharge> list = carchargeDao.queryCarChargeAll(carcharge);
        // 将查询结果封装成一个PageInfo对象，包含了分页信息和查询结果
        PageInfo<Carcharge> pageInfo = new PageInfo(list);
        // 返回PageInfo对象,供调用者使用
        return pageInfo;
    }

    @Override
    // 用于分页查询收费信息
    public IPage<Carcharge> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Carcharge> wherePage = new Page<>(page, pageCount);
        // 创建一个Carcharge对象，作为查询条件
        Carcharge where = new Carcharge();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 用于添加收费信息
    public int add(Carcharge carcharge) {
        return baseMapper.insert(carcharge);
    }

    @Override
    // 用于删除收费信息
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    // 用于更新收费信息
    public int updateData(Carcharge carcharge) {
        return baseMapper.updateById(carcharge);
    }

    @Override
    // 用于根据收费ID查询建筑信息
    public Carcharge findById(Long id) {
        return baseMapper.selectById(id);
    }
}

