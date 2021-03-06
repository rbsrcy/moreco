package io.github.weechang.moreco.rbac.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import io.github.weechang.moreco.base.model.domain.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

/**
 * 菜单
 *
 * @author zhangwei
 * date 2018/10/26
 * time 17:55
 */
@ApiModel("目录")
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "moreco_rbac_menu")
@DynamicUpdate()
@Where(clause = "yn = 1")
public class Menu extends BaseDomain {
    private static final long serialVersionUID = 5051501706109694638L;

    @ApiModelProperty("父菜单ID，一级菜单为0")
    private Long parentId;

    @ApiModelProperty("菜单名称")
    private String name;

    @ApiModelProperty("菜单URL")
    private String url;

    @ApiModelProperty("类型  1：菜单   2：页面组件")
    private Integer type;

    @ApiModelProperty("菜单图标")
    private String icon;

    @ApiModelProperty("是否显示")
    private Integer show;

    @ApiModelProperty("排序")
    private Integer orderNum;

    @ApiModelProperty("菜单与资源")
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "moreco_rbac_menu_resource",
            joinColumns = @JoinColumn(name = "menus_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id"))
    private List<Resource> resources = Lists.newArrayList();

    @ApiModelProperty("菜单与角色")
    @JsonIgnore
    @ManyToMany(mappedBy = "menus")
    private List<Role> roles = Lists.newArrayList();

    @Transient
    private List<Menu> children;
}
