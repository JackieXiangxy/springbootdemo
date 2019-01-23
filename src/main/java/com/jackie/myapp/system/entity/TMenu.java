package com.jackie.myapp.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jackie
 * @since 2019-01-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_menu")
public class TMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单/按钮ID
     */
    @TableId(value = "MENU_ID", type = IdType.AUTO)
    private Long menuId;

    /**
     * 上级菜单ID
     */
    @TableField("PARENT_ID")
    private Long parentId;

    /**
     * 菜单/按钮名称
     */
    @TableField("MENU_NAME")
    private String menuName;

    /**
     * 菜单URL
     */
    @TableField("URL")
    private String url;

    /**
     * 权限标识
     */
    @TableField("PERMS")
    private String perms;

    /**
     * 图标
     */
    @TableField("ICON")
    private String icon;

    /**
     * 类型 0菜单 1按钮
     */
    @TableField("TYPE")
    private String type;

    /**
     * 排序
     */
    @TableField("ORDER_NUM")
    private Long orderNum;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;


}
