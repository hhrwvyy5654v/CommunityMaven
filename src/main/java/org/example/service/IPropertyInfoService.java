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
    PageInfo<PropertyInfo> findPropertyInfoAll(int page, int pagesise,
                                               PropertyInfo propertyInfo);

    void deleteInfoByHouIdAndTime(@Param("houId") Integer houId, @Param("endDate") Date endDate);

    IPage<PropertyInfo> findListByPage(Integer page, Integer pageCount);

    int add(PropertyInfo propertyInfo);

    int delete(Long id);

    int updateData(PropertyInfo propertyInfo);

    PropertyInfo findById(Long id);
}
