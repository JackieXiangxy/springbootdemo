package com.jackie.myapp.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("t_dipt")
public class TDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字典ID
     */
    @TableId(value = "DICT_ID", type = IdType.AUTO)
    private Long dictId;

    /**
     * 键
     */
    @TableField("KEYY")
    private Long keyy;

    /**
     * 值
     */
    @TableField("VALUEE")
    private String valuee;

    /**
     * 字段名称
     */
    @TableField("FIELD_NAME")
    private String fieldName;

    /**
     * 表名
     */
    @TableField("TABLE_NAME")
    private String tableName;


}
