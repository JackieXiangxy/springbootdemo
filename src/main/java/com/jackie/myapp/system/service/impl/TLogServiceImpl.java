package com.jackie.myapp.system.service.impl;

import com.jackie.myapp.system.entity.TLog;
import com.jackie.myapp.system.mapper.TLogMapper;
import com.jackie.myapp.system.service.ITLogService;
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
public class TLogServiceImpl extends ServiceImpl<TLogMapper, TLog> implements ITLogService {

}
