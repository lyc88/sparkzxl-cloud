package com.github.sparkzxl.oauth.domain.repository;

import com.github.sparkzxl.oauth.infrastructure.entity.AuthUser;
import com.github.sparkzxl.oauth.infrastructure.entity.LoginAuthUser;
import com.github.sparkzxl.oauth.infrastructure.entity.RoleResource;

import java.util.List;

/**
 * description: 用户仓储层
 *
 * @author zhouxinlei
 * @date 2020-06-05 20:39:15
 */
public interface IAuthUserRepository {


    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @return
     */
    AuthUser selectById(Long id);

    /**
     * 根据账户查询用户信息
     *
     * @param account
     * @return
     */
    AuthUser selectByAccount(String account);

    /**
     * 获取用户权限集
     *
     * @param id id
     * @return Set<String>
     */
    List<String> getAuthUserPermissions(Long id);

    /**
     * 获取用户角色
     *
     * @param id 用户id
     * @return
     */
    List<String> getAuthUserRoles(Long id);

    /**
     * 查询角色路径
     *
     * @return List<RoleResource>
     */
    List<RoleResource> getRoleResourceList();


    /**
     * 删除用户关联信息
     *
     * @param ids 用户ids
     */
    void deleteUserRelation(List<Long> ids);

    /**
     * 获取登录用户信息
     *
     * @param id 用户id
     * @return LoginAuthUser
     */
    LoginAuthUser getLoginAuthUser(Long id);

    /**
     * 分页查询用户列表
     *
     * @param authUser 查询对象
     * @return PageInfo<AuthUser>
     */
    List<AuthUser> getAuthUserList(AuthUser authUser);

}
