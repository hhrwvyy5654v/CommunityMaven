package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.example.model.PropertyInfo;

import java.util.Date;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IPropertyInfoService
 * @Datetime: 2023/06/01 21:51
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IPropertyInfoService接口，继承了IService接口，并定义了一些对PropertyInfoService表进行操作的方法
 */

public interface IPropertyInfoService extends IService<PropertyInfo> {
    // 用于分页查询所有符合条件的 PropertyInfo 对象，page 表示页码，pageSize 表示每页条数，propertyInfo 表示查询条件
    PageInfo<PropertyInfo> findPropertyInfoAll(int page, int pageSize,
                                               PropertyInfo propertyInfo);

    // 用于根据房屋ID和时间删除 PropertyInfo 对象。houId 表示房屋ID，endDate 表示时间
    void deleteInfoByHouIdAndTime(@Param("houId") Integer houId, @Param("endDate") Date endDate);

    // 用于分页查询PropertyInfo对象,page 表示页码,pageCount 表示每页条数
    IPage<PropertyInfo> findListByPage(Integer page, Integer pageCount);

    // 添加PropertyInfo对象
    int add(PropertyInfo propertyInfo);

    // 删除PropertyInfo对象
    int delete(Long id);

    // 更新PropertyInfo对象
    int updateData(PropertyInfo propertyInfo);

    // 根据ID查询PropertyInfo对象
    PropertyInfo findById(Long id);
}
