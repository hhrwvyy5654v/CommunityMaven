package org.example.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
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
    // 用于分页查询所有符合条件的 Owner 对象，page 表示页码，pageSize 表示每页条数，owner 表示查询条件
    PageInfo<Owner> findOwnerAll(int page, int pageSize, Owner owner);

    // 用于分页查询 Owner 对象，page 表示页码，pageCount 表示每页条数
    IPage<Owner> findListByPage(Integer page, Integer pageCount);

    // 根据用户名查询一个Owner对象
    Owner queryOwnerByName(String username);

    // 添加Owner对象
    int add(Owner owner);

    // 删除Owner对象
    int delete(Long id);

    // 更新Owner对象
    int updateData(Owner owner);

    // 根据ID查询Owner对象
    Owner findById(Long id);

    // 根据用户名删除一个Owner对象，username 表示要删除的用户名
    void deleteOwnerUserByUserName(String username);

    // 根据ID查询Owner对象
    Owner queryOwnerById(long parseLong);
}
