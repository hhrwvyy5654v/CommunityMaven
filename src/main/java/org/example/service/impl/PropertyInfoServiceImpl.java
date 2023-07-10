package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.dao.PropertyInfoMapper;
import org.example.model.PropertyInfo;
import org.example.service.IPropertyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: PropertyInfoServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IPropertyInfoService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<PropertyInfoMapper, PropertyInfo>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class PropertyInfoServiceImpl extends ServiceImpl<PropertyInfoMapper, PropertyInfo> implements IPropertyInfoService {

    @Autowired  // 将PropertyInfoMapper对象注入到PropertyInfoServiceImpl类中的propertyInfoDao属性中
    private PropertyInfoMapper propertyInfoDao; // 一个PropertyInfoMapper类型的属性，用于进行数据库操作

    @Override
    // 用于分页查询所有的物业收费信息
    public PageInfo<PropertyInfo> findPropertyInfoAll(int page, int pageSize,
                                                      PropertyInfo propertyInfo) {
        // 使用PageHelper来实现分页功能
        PageHelper.startPage(page, pageSize);
        // 调用propertyInfoDao的queryListAll方法来查询建筑信息
        List<PropertyInfo> list = propertyInfoDao.queryListAll(propertyInfo);
        // 将查询结果封装成PageInfo对象并返回
        return new PageInfo(list);
    }

    @Override
    // 根据传入的房屋ID和结束时间，删除数据库中符合条件的物业收费数据
    public void deleteInfoByHouIdAndTime(Integer houId, Date endTime) {
        // 创建一个"SimpleDateFormat"对象，用于将"Date"类型的时间格式化为指定的字符串格式"yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将传入的"endTime"格式化为字符串
        String dateString = formatter.format(endTime);
        // 截取字符串前9位，得到一个只包含日期的字符串"dateString"
        dateString = dateString.substring(0, 9);
        // 调用"propertyInfoDao"对象的"deleteByHouIdAndTime()"方法，将传入的房屋ID和日期字符串作为参数传递给该方法，从数据库中删除符合条件的物业收费数据
        propertyInfoDao.deleteByHouIdAndTime(houId, dateString);
    }

    @Override
    // 用于分页查询物业收费信息
    public IPage<PropertyInfo> findListByPage(Integer page, Integer pageCount) {
        // 使用PageHelper来实现分页功能，表示从第page页开始，每页显示pageCount条数据
        IPage<PropertyInfo> wherePage = new Page<>(page, pageCount);
        // 调用PropertyInfo的queryBuildAll方法来查询建筑信息
        PropertyInfo where = new PropertyInfo();
        // 将查询结果封装成PageInfo对象并返回
        return baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    // 用于添加物业收费信息
    public int add(PropertyInfo propertyInfo) {
        // 调用baseMapper的insert方法来插入数据，并返回插入的行数
        return baseMapper.insert(propertyInfo);
    }

    @Override
    // 删除物业收费信息
    public int delete(Long id) {
        // 调用baseMapper的deleteById方法来删除指定ID的数据
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新物业收费信息
    public int updateData(PropertyInfo propertyInfo) {
        // 调用baseMapper的updateById方法来更新指定ID的数据
        return baseMapper.updateById(propertyInfo);
    }

    @Override
    // 根据ID查询收费信息
    public PropertyInfo findById(Long id) {
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return baseMapper.selectById(id);
    }
}

