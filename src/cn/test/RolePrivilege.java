package cn.test;
// Generated 2017-5-8 19:24:48 by Hibernate Tools 3.6.0.Final

/**
 * RolePrivilege generated by hbm2java
 */
public class RolePrivilege implements java.io.Serializable {

	private RolePrivilegeId id;
	private Role role;

	public RolePrivilege() {
	}

	public RolePrivilege(RolePrivilegeId id, Role role) {
		this.id = id;
		this.role = role;
	}

	public RolePrivilegeId getId() {
		return this.id;
	}

	public void setId(RolePrivilegeId id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
