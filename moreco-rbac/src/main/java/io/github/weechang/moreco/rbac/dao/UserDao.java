package io.github.weechang.moreco.rbac.dao;

import io.github.weechang.moreco.base.dao.JpaDao;
import io.github.weechang.moreco.rbac.model.domain.User;

/**
 * @author zhangwei
 * date 2018/10/26
 * time 18:11
 */
public interface UserDao extends JpaDao<User> {

    User findFirstByUsername(String username);
}
