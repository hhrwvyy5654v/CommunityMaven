package org.example.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import org.example.model.Owner;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: IOwnerService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个IOwnerService接口，继承了IService接口，并定义了一些对OwnerService表进行操作的方法
 */

public interface IOwnerService extends IService<Owner> {
    PageInfo<Owner> findOwnerAll(int page, int pageSize, Owner owner);

    IPage<Owner> findListByPage(Integer page, Integer pageCount);

    Owner queryOwnerByName(String username);

    int add(Owner owner);

    int delete(Long id);

    int updateData(Owner owner);

    Owner findById(Long id);

    void deleteOwnerUserByUserName(String username);

    Owner queryOwnerById(long parseLong);
}
