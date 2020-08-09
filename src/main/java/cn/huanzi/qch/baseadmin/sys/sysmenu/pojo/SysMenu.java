package cn.huanzi.qch.baseadmin.sys.sysmenu.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sys_menu")
@Data
public class SysMenu implements Serializable {
    @Id
    private String menuId;//菜单id

    private String menuName;//菜单名称

    private String menuPath;//菜单路径

    private String menuParentId;//上级id

    @Column(nullable = false)
    private Date createTime;//创建时间

    @Column(nullable = false)
    private Date updateTime;//修改时间

}
