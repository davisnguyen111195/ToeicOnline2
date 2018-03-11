package vn.myclass.core.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {
	@Id
	@Column(name = "roleId")
	private Integer roleId;
	
	@Column(name = "roleName")
	private String roleName;
	
	@OneToMany(mappedBy = "roleEntity", fetch = FetchType.LAZY)
	private List<UsersEntity> userList;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<UsersEntity> getUserList() {
		return userList;
	}
	public void setUserList(List<UsersEntity> userList) {
		this.userList = userList;
	}
}
