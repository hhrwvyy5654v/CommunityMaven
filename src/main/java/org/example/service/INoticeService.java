package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import org.example.model.Notice;

/**
 * @Project: CommunityMaven
 * @Package: org.example.service
 * @ClassName: INoticeService
 * @Datetime: 2023/06/01 21:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个INoticeService接口，继承了IService接口，并定义了一些对NoticeService表进行操作的方法
 */

public interface INoticeService extends IService<Notice> {
    PageInfo<Notice> queryNoticeAll(Integer pageNum, Integer limit, String topic);

    IPage<Notice> findListByPage(Integer page, Integer pageCount);

    int add(Notice notice);

    int delete(Long id);

    int updateData(Notice notice);

    Notice findById(long id);

}
