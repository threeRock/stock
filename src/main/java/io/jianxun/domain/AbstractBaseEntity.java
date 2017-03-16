package io.jianxun.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Version;

/**
 * 业务实体基类
 * 
 * @author tongtn
 *
 *         createDate: 2017-03-15
 */
@MappedSuperclass
public abstract class AbstractBaseEntity implements Serializable {

	private static final long serialVersionUID = 1641451795636666403L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Version
	private Long version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public boolean isNew() {
		return null == id;
	}

}
