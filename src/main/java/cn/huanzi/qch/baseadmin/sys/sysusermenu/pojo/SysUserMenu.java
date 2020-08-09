package cn.huanzi.qch.baseadmin.sys.sysusermenu.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import cn.huanzi.qch.baseadmin.sys.sysmenu.pojo.SysMenu;
import cn.huanzi.qch.baseadmin.sys.sysuser.pojo.SysUser;
import lombok.Data;

@Entity
@Table(name = "sys_user_menu")
@Data
public class SysUserMenu implements Serializable {
    @Id
    private String userMenuId;//用户菜单表id

    private String userId;//用户id

    private String menuId;//菜单id

    @Column(nullable = false)
    private Date createTime;//创建时间

    @Column(nullable = false)
    private Date updateTime;//修改时间

    @OneToOne
    @JoinColumn(name = "userId",referencedColumnName = "userId", insertable = false, updatable = false)
    @NotFound(action= NotFoundAction.IGNORE)
    private SysUser sysUser;//用户

    @OneToOne
    @JoinColumn(name = "menuId",referencedColumnName = "menuId", insertable = false, updatable = false)
    @NotFound(action= NotFoundAction.IGNORE)
    private SysMenu sysMenu;//菜单
}
