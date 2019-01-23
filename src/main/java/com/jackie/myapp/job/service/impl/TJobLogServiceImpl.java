package com.jackie.myapp.job.service.impl;

import com.jackie.myapp.job.entity.TJobLog;
import com.jackie.myapp.job.mapper.TJobLogMapper;
import com.jackie.myapp.job.service.ITJobLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jackie
 * @since 2019-01-23
 */
@Service
public class TJobLogServiceImpl extends ServiceImpl<TJobLogMapper, TJobLog> implements ITJobLogService {

}
