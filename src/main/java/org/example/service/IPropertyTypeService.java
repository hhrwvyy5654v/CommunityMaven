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
    IPage<PropertyType> findListByPage(Integer page, Integer pageCount);

    int add(PropertyType propertyType);

    int delete(Long id);

    int updateData(PropertyType propertyType);

    PropertyType findById(Long id);

    List<PropertyType> findAll();
}
