package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author lizuhao
 * @date 2024/8/26
 */
public interface UserService {
    User wxLogin(UserLoginDTO userLoginDTO);
}
