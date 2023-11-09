package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.common.convention.result.Result;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User Management Controller
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
     /**
     * search user information by username
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
        public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
            UserRespDTO result = userService.getUserByUsername(username);
            //return new Result<UserRespDTO>().setCode("-1").setMessage("用户查询为空");
            if (result == null) {
                return new Result<UserRespDTO>().setCode("-1").setMessage("用户查询为空");
            } else {
                return new Result<UserRespDTO>().setCode("0").setData(result);
            }
    }
}
