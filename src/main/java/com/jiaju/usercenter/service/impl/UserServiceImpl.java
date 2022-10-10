package com.jiaju.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiaju.usercenter.service.UserService;
import com.jiaju.usercenter.model.domain.User;
import com.jiaju.usercenter.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author jiaju
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2022-10-07 16:59:45
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




