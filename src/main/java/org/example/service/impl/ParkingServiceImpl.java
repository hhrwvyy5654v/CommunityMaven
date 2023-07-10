package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.ParkingMapper;
import org.example.model.Parking;
import org.example.service.IParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: ParkingServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IParkingService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<ParkingMapper, Parking>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class ParkingServiceImpl extends ServiceImpl<ParkingMapper, Parking> implements IParkingService {

    @Autowired  // 将ParkingMapper对象注入到ParkingServiceImpl类中的parkingDao属性中
    private ParkingMapper parkingDao;   // 一个ParkingMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的车位信息
    public PageInfo<Parking> findParkAll(int page, int pageSize, String numbers) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pageSize);
        // 调用parkingDao的queryBuildAll方法来查询建筑信息
        List<Parking> list = parkingDao.queryParkAll(numbers);
        // 将查询结果封装成PageInfo对象并返回
        PageInfo<Parking> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    // 用于分页查询车位信息
    public IPage<Parking> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<Parking> wherePage = new Page<>(page, pageCount);
        // 创建一个Parking对象，作为查询条件
        Parking where = new Parking();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 添加车位信息
    public int add(Parking parking) {
        // 调用baseMapper的insert方法来插入数据，并返回插入的行数
        return baseMapper.insert(parking);
    }

    @Override
    // 删除车位信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据，并返回删除的行数
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新车位信息
    public int updateData(Parking parking) {
        // 调用baseMapper的updateById方法来更新车位信息
        return baseMapper.updateById(parking);
    }

    @Override
    // 根据ID查询车位信息
    public Parking findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.selectById(id);
    }

    @Override
    // 查询所有的车位信息
    public List<Parking> queryParkingAll() {
        return null;
    }

    @Override
    // 按状态查询车位信息
    public List<Parking> queryParkingByStatus() {
        return parkingDao.queryParkAllByStatus();
    }
}
