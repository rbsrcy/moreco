package io.github.weechang.moreco.rbac.service.impl;

import io.github.weechang.moreco.base.service.impl.BaseServiceImpl;
import io.github.weechang.moreco.rbac.dao.RoleDeptDao;
import io.github.weechang.moreco.rbac.domain.RbacRoleDept;
import io.github.weechang.moreco.rbac.service.RoleDeptService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangwei
 * date 2018/10/27
 * time 16:17
 */
@Service
public class RoleDeptServiceImpl extends BaseServiceImpl<RoleDeptDao, RbacRoleDept> implements RoleDeptService {

    @Override
    public List<Long> queryDeptIdList(Long[] roleIds) {
        return null;
    }

    @Override
    public int deleteBatch(Long[] roleIds) {
        return 0;
    }
}
