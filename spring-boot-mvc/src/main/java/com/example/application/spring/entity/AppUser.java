package com.example.application.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_01_AppUser")
public class AppUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@Column
    private String name;
	@Column
    private String password;
	@Column
    private boolean lock;
	
	public AppUser() {

	}
	
	public AppUser(int userId, String name, String password, boolean lock) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.lock = lock;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLock() {
		return lock;
	}
	public void setLock(boolean lock) {
		this.lock = lock;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (lock ? 1231 : 1237);
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppUser other = (AppUser) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (lock != other.lock)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppUser [userId=");
		builder.append(userId);
		builder.append(", Name=");
		builder.append(name);
		builder.append(", password=");
		builder.append(password);
		builder.append(", lock=");
		builder.append(lock);
		builder.append("]");
		return builder.toString();
	}
	
}
