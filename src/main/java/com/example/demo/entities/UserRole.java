package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_role")
@Getter
@Setter
@NoArgsConstructor
public class UserRole {
	@EmbeddedId
	CompositeKey id;

	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@MapsId("roleId")
	@JoinColumn(name = "role_id")
	private Role role;

	public CompositeKey getId() {
		return id;
	}

	public void setId(CompositeKey id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Embeddable
	class CompositeKey implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Column(name = "user_id")
		private int userId;
		@Column(name = "role_id")
		private int roleId;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public int getRoleId() {
			return roleId;
		}

		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}

		public CompositeKey(int userId, int roleId) {
			super();
			this.userId = userId;
			this.roleId = roleId;
		}

		public CompositeKey() {
		}
	}
}
