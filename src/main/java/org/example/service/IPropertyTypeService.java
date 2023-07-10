package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.model.PropertyType;

import java.util.List;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IPropertyTypeService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IPropertyTypeService接口，继承了IService接口，并定义了一些对PropertyTypeService表进行操作的方法
 */

public interface IPropertyTypeService extends IService<PropertyType> {
    // 用于分页查询PropertyType对象,page表示页码，pageCount表示每页条数
    IPage<PropertyType> findListByPage(Integer page, Integer pageCount);

    // 添加PropertyType对象
    int add(PropertyType propertyType);

    // 删除PropertyType对象
    int delete(Long id);

    // 更新PropertyType对象
    int updateData(PropertyType propertyType);

    // 根据ID查询PropertyType对象
    PropertyType findById(Long id);

    // 查询所有的PropertyType对象
    List<PropertyType> findAll();
}
