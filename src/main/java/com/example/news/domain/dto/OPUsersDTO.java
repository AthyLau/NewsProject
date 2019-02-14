package com.example.news.domain.dto;

import com.example.news.domain.po.PermissionPO;
import com.example.news.domain.po.RolePO;

/**
 * Function:
 *
 * @author liubing
 * Date: 2018/12/25 下午3:05
 * @since JDK 1.8
 */


public class OPUsersDTO {

    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户性别
     */
    private String userSex;
    /**
     * 用户手机号
     */
    private String userPhone;
    /**
     * 用户邮箱
     */
    private String userMail;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户角色
     */
    private RolePO rolePO;
    /**
     * 用户权限
     */
    private PermissionPO permissionPO;

    public OPUsersDTO() {
    }

    public OPUsersDTO(String userName, String userSex, String userPhone, String userMail, String userPassword, RolePO rolePO, PermissionPO permissionPO) {
        this.userName = userName;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.rolePO = rolePO;
        this.permissionPO = permissionPO;
    }

    @Override
    public String toString() {
        return "OPUsersDTO{" +
                "userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", rolePO=" + rolePO +
                ", permissionPO=" + permissionPO +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public RolePO getRolePO() {
        return rolePO;
    }

    public void setRolePO(RolePO rolePO) {
        this.rolePO = rolePO;
    }

    public PermissionPO getPermissionPO() {
        return permissionPO;
    }

    public void setPermissionPO(PermissionPO permissionPO) {
        this.permissionPO = permissionPO;
    }
}
