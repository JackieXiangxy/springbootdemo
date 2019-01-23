package com.jackie.myapp.system.service.impl;

import com.jackie.myapp.system.entity.TUser;
import com.jackie.myapp.system.mapper.TUserMapper;
import com.jackie.myapp.system.service.ITUserService;
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
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
