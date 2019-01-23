package com.jackie.myapp.job.entity;

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
@TableName("t_job")
public class TJob implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务id
     */
    @TableId(value = "JOB_ID", type = IdType.AUTO)
    private Long jobId;

    /**
     * spring bean名称
     */
    @TableField("BEAN_NAME")
    private String beanName;

    /**
     * 方法名
     */
    @TableField("METHOD_NAME")
    private String methodName;

    /**
     * 参数
     */
    @TableField("PARAMS")
    private String params;

    /**
     * cron表达式
     */
    @TableField("CRON_EXPRESSION")
    private String cronExpression;

    /**
     * 任务状态  0：正常  1：暂停
     */
    @TableField("STATUS")
    private String status;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
