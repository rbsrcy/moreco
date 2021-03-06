package io.github.weechang.moreco.rbac.model.dto;

import cn.hutool.core.bean.BeanUtil;
import io.github.weechang.moreco.rbac.model.domain.Dept;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangwei
 * date 2018/10/30
 * time 17:06
 */
@Data
@ApiModel("部门保存请求")
public class DeptSaveReqeust implements Serializable {
    private static final long serialVersionUID = -451149622964122332L;

    @ApiModelProperty("Id")
    private Long id;

    @ApiModelProperty("上级部门ID，一级部门为0")
    private Long parentId;

    @ApiModelProperty("部门名称")
    private String name;

    @ApiModelProperty("排序")
    private Integer orderNum;

    public Dept toDept(){
        parentId = parentId == null ? 0L : parentId;
        orderNum = orderNum == null ? 0 : orderNum;
        return BeanUtil.toBean(this, Dept.class);
    }
}
