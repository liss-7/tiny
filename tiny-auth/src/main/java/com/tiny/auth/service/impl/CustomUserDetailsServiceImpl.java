package com.tiny.auth.service.impl;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author sensen.li@onecontract-cloud.com
 * @date 2021/11/2 17:45
 */
@Component(value = "customUserDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 1. 根据username 去数据库查询 user

        // 2.获取用户的角色和权限

        // 下面是写死，暂时不和数据库交互
        if(!(("admin").equals(username))){
            throw new UsernameNotFoundException("the user is not found");
        }else{
            String role = "ADMIN_ROLE";
            List<SimpleGrantedAuthority> authorities = Lists.newArrayList();
            authorities.add(new SimpleGrantedAuthority(role));
            String password = passwordEncoder.encode("123456");
            return new User(username,password,authorities);
        }
    }
}
