package com.jackie.myapp.system.entity;

import java.math.BigDecimal;
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
@TableName("t_log")
public class TLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 操作用户
     */
    @TableField("USERNAME")
    private String username;

    /**
     * 操作内容
     */
    @TableField("OPERATION")
    private String operation;

    /**
     * 耗时
     */
    @TableField("TIME")
    private BigDecimal time;

    /**
     * 操作方法
     */
    @TableField("METHOD")
    private String method;

    /**
     * 方法参数
     */
    @TableField("PARAMS")
    private String params;

    /**
     * 操作者IP
     */
    @TableField("IP")
    private String ip;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 操作地点
     */
    private String location;


}
