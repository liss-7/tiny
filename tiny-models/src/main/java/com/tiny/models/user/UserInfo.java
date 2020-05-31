package com.tiny.models.user;

import com.tiny.models.base.BaseBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 测试用户类
 * @author liss
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class UserInfo extends BaseBean {
    private Long id;
    private String account;
    private String password;
}
