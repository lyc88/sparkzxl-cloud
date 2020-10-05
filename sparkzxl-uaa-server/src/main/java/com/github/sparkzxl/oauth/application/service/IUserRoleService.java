package com.github.sparkzxl.oauth.application.service;


import com.github.sparkzxl.oauth.infrastructure.entity.UserRole;
import com.github.sparkzxl.oauth.interfaces.dto.role.RoleUserDTO;
import com.github.sparkzxl.oauth.interfaces.dto.role.RoleUserDeleteDTO;
import com.github.sparkzxl.oauth.interfaces.dto.role.RoleUserSaveDTO;
import com.github.sparkzxl.database.base.service.SuperCacheService;

/**
 * description: 账号角色绑定 服务类
 *
 * @author: zhouxinlei
 * @date: 2020-07-19 21:02:47
 */
public interface IUserRoleService extends SuperCacheService<UserRole> {

    /**
     * 账号角色绑定
     *
     * @param roleUserSaveDTO
     * @return boolean
     */
    boolean saveAuthRoleUser(RoleUserSaveDTO roleUserSaveDTO);

    /**
     * 账号角色解除绑定
     *
     * @param roleUserDeleteDTO 角色用户删除DTO
     * @return boolean
     */
    boolean deleteAuthRoleUser(RoleUserDeleteDTO roleUserDeleteDTO);

    /**
     * 查询角色下的用户
     *
     * @param roleId 角色id
     * @return RoleUserDTO
     */
    RoleUserDTO getRoleUserList(Long roleId);
}
