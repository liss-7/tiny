package com.tiny.usercenter.fosun.buriedpoint.dao;

import com.tiny.models.user.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * <Description> <br>
 *
 * @author liss
 * @createTime 2021年05月12日 12:07:00
 */
@Repository
public interface UserMapper {

    void insertUser(UserInfo userInfo);

}
