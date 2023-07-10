package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.HouseMapper;
import org.example.model.House;
import org.example.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: HouseServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IHouseService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<HouseMapper, House>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements IHouseService {
    @Autowired  // 将HouseMapper对象注入到HouseServiceImpl类中的houseDao属性中
    private HouseMapper houseDao;   // 一个HouseMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的房屋信息
    public PageInfo<House> findHouseAll(int page, int pagesize, String numbers) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pagesize);
        // 调用houseDao的queryBuildAll方法来查询建筑信息
        List<House> list = houseDao.findHouseAll(numbers);
        // 将查询结果封装成PageInfo对象并返回
        PageInfo<House> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    // 查询所有的房屋信息
    public List<House> findList() {
        // 该方法没有传入任何查询条件，所以在selectList方法中传入了null
        return baseMapper.selectList(null);
    }

    @Override
    // 用于分页查询房屋信息
    public IPage<House> findListByPage(Integer page, Integer pageCount) {
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<House> wherePage = new Page<>(page, pageCount);
        // 创建一个House对象，作为查询条件
        House where = new House();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 用于添加房屋信息
    public int add(House house) {
        // 调用baseMapper的insert方法来插入数据，并返回插入的行数
        return baseMapper.insert(house);
    }

    @Override
    // 用于删除房屋信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据，并返回删除的行数
        return baseMapper.deleteById(id);
    }

    @Override
    // 用于更新房屋信息
    public int updateData(House house) {
        // 调用baseMapper的updateById方法来更新指定ID的数据，并返回更新的行数
        return baseMapper.updateById(house);
    }

    @Override
    // 用于根据ID查询房屋信息
    public House findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据，并返回查询结果
        return baseMapper.selectById(id);
    }

    @Override
    // 用于根据建筑ID查询建筑信息
    public House queryHouseById(Integer houId) {
        // 调用houseDao的queryBuildById方法来查询指定建筑ID的数据，并返回查询结果
        return houseDao.queryHouseById(houId);
    }
}

