package cn.huanzi.qch.baseadmin.sys.sysshortcutmenu.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "sys_shortcut_menu")
@Data
public class SysShortcutMenu implements Serializable {
    @Id
    private String shortcutMenuId;//用户快捷菜单id

    private String shortcutMenuName;//用户快捷菜单名称

    private String shortcutMenuPath;//用户快捷菜单路径

    private String userId;//用户id

    private String shortcutMenuParentId;//上级id

    @Column(nullable = false)
    private Date createTime;//创建时间

    @Column(nullable = false)
    private Date updateTime;//修改时间

}
