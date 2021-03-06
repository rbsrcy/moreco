package io.github.weechang.moreco.rbac.model.dto;

import cn.hutool.core.bean.BeanUtil;
import io.github.weechang.moreco.base.model.dto.QueryRequest;
import io.github.weechang.moreco.rbac.model.domain.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangwei
 * date 2018/11/30
 * time 13:22
 */
@Data
@ApiModel("角色查询请求")
public class RoleQueryRequest extends QueryRequest {
    private static final long serialVersionUID = 4452748390646340002L;

    @ApiModelProperty("角色名称")
    private String name;

    public Role toRole(){
        return BeanUtil.toBean(this, Role.class);
    }
}
