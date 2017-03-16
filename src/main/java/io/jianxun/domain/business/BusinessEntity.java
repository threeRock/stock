package io.jianxun.domain.business;

import javax.persistence.MappedSuperclass;

import io.jianxun.domain.AbstractBaseAuditableEntity;
import io.jianxun.domain.LogicDeletable;

/**
 * 业务对象基类
 * 
 * 自动记录创建和修改用户及时间信息
 * 逻辑删除
 * 
 * @author tongtn
 *
 *         createDate: 2017-03-15
 */
@MappedSuperclass
public class BusinessEntity extends AbstractBaseAuditableEntity implements LogicDeletable {

	private static final long serialVersionUID = 3146994025359356634L;
	private Boolean deteled = false;

	@Override
	public Boolean isDeleted() {
		return this.deteled;
	}

	@Override
	public void setDeleted(Boolean deleted) {
		this.deteled = deleted;
	}

}
