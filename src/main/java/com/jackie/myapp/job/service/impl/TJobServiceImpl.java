package com.jackie.myapp.job.service.impl;

import com.jackie.myapp.job.entity.TJob;
import com.jackie.myapp.job.mapper.TJobMapper;
import com.jackie.myapp.job.service.ITJobService;
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
public class TJobServiceImpl extends ServiceImpl<TJobMapper, TJob> implements ITJobService {

}
