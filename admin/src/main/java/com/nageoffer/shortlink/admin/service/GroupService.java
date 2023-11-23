package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 保存分组
     * @param groupName 分组名称
     */
    void saveGroup(String groupName);

    /**
     * 列出分组
     * @return 分组列表
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * 更新分组
     * @param requestParam 请求参数
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);
}
