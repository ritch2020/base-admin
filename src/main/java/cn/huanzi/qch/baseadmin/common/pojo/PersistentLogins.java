package cn.huanzi.qch.baseadmin.common.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "persistent_logins")
@Data
// @EntityListeners(AuditingEntityListener.class)
public class PersistentLogins implements Serializable {
    @Id
    @Column(length = 64, nullable = false)
    private String series;

    @Column(length = 64, nullable = false)
    private String username;

    @Column(length = 64, nullable = false)
    private String token;

    // @LastModifiedDate
    @Column(nullable = false)
    private Date last_used = new Date();

}