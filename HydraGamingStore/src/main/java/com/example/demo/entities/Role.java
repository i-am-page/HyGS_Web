package com.example.demo.entities;
// Generated Dec 10, 2019, 8:57:54 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role")
public class Role implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<RoleAccount> roleAccounts = new HashSet<RoleAccount>(0);

	public Role() {
	}

	public Role(String name) {
		this.name = name;
	}

	public Role(String name, Set<RoleAccount> roleAccounts) {
		this.name = name;
		this.roleAccounts = roleAccounts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 250)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<RoleAccount> getRoleAccounts() {
		return this.roleAccounts;
	}

	public void setRoleAccounts(Set<RoleAccount> roleAccounts) {
		this.roleAccounts = roleAccounts;
	}

}
