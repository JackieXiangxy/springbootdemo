package com.jackie.myapp.job.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
@TableName("t_job_log")
public class TJobLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务日志id
     */
    @TableId(value = "LOG_ID", type = IdType.AUTO)
    private Long logId;

    /**
     * 任务id
     */
    @TableField("JOB_ID")
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
     * 任务状态    0：成功    1：失败
     */
    @TableField("STATUS")
    private String status;

    /**
     * 失败信息
     */
    @TableField("ERROR")
    private String error;

    /**
     * 耗时(单位：毫秒)
     */
    @TableField("TIMES")
    private BigDecimal times;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
