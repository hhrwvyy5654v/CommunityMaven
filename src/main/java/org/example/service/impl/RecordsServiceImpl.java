package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.RecordsMapper;
import org.example.model.RecordVo;
import org.example.model.Records;
import org.example.service.IRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: RecordsServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IRecordsService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<RecordsMapper, Records>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class RecordsServiceImpl extends ServiceImpl<RecordsMapper, Records> implements IRecordsService {

    @Autowired  // 将RecordsMapper对象注入到RecordsServiceImpl类中的recordsDao属性中
    private RecordsMapper recordsDao;   // 一个RecordsMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的记录信息
    public PageInfo<RecordVo> findRecordsAll(int page, int limit, RecordVo recordVo) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, limit);
        // 调用recordsDao的queryBuildAll方法来查询建筑信息
        List<RecordVo> list = recordsDao.queryRecordsAll(recordVo);
        // 将查询结果封装成PageInfo对象并返回
        return new PageInfo<>(list);
    }

    @Override
    // 根据房屋ID和类型ID查询记录信息
    public Records queryByHouIdAndTypeId(Integer houId, Integer typeId) {
        // 调用recordsDao的queryByHouIdAndTypeId方法来插入数据，并返回插入的行数
        return recordsDao.queryByHouIdAndTypeId(houId, typeId);
    }

    @Override
    // 添加记录信息
    public int add(Records building) {
        // 调用baseMapper的insert方法来插入数据
        return baseMapper.insert(building);
    }


    @Override
    // 删除记录信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新记录信息
    public int updateData(Records building) {
        // 调用baseMapper的updateById方法来更新指定ID的数据
        return baseMapper.updateById(building);
    }

    @Override
    // 根据ID查询指定ID的数据信息
    public Records findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.selectById(id);
    }
}

