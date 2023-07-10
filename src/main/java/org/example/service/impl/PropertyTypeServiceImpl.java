package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.PropertyTypeMapper;
import org.example.model.PropertyType;
import org.example.service.IPropertyTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service.impl
 * @ClassName: PropertyTypeServiceImpl
 * @Datetime: 2023/06/01 21:58
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个实现了"IPropertyTypeService"接口的服务类
 */

@Service    // 注解是Spring框架提供的，它标识这个类是一个服务类，用于处理业务逻辑
// 继承了ServiceImpl<PropertyTypeMapper, PropertyType>，这是MyBatis-Plus框架提供的一个基础服务实现类，它提供了一些常用的数据库操作方法
public class PropertyTypeServiceImpl extends ServiceImpl<PropertyTypeMapper, PropertyType> implements IPropertyTypeService {

    @Override
    // 分页查询物业费类型信息
    public IPage<PropertyType> findListByPage(Integer page, Integer pageCount){
        // 分页方法，表示从第page页开始，每页显示pageCount条数据
        IPage<PropertyType> wherePage = new Page<>(page, pageCount);
        // 创建一个PropertyType对象，作为查询条件
        PropertyType where = new PropertyType();
        // 使用MyBatis-Plus提供的selectPage方法来进行分页查询并返回查询结果
        return  baseMapper.selectPage(wherePage, Wrappers.query(where));
    }



    @Override
    // 添加物业费类型信息
    public int add(PropertyType propertyType){
        // 调用baseMapper的deleteById方法来删除指定ID的数据
        return baseMapper.insert(propertyType);
    }

    @Override
    // 删除物业费类型信息
    public int delete(Long id){
        // 调用baseMapper的insert方法来插入数据
        return baseMapper.deleteById(id);
    }

    @Override
    // 更新物业费类型信息
    public int updateData(PropertyType propertyType){
        // 调用baseMapper的updateById方法来更新指定ID的数据
        return baseMapper.updateById(propertyType);
    }

    @Override
    // 根据ID查询物业费类型信息
    public PropertyType findById(Long id){
        // 调用baseMapper的selectById方法来查询指定ID的数据
        return  baseMapper.selectById(id);
    }

    @Override
    // 查询所有的物业费类型收费信息
    public List<PropertyType> findAll() {
        // 调用baseMapper的selectList方法来查询指定ID的数据
        return baseMapper.selectList(null);
    }
}

