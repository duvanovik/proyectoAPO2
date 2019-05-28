package model;

import java.io.Serializable;

import exceptions.RepeatedUserException;

public class User implements Comparable<User>, Serializable{
	private String nickname;
	private String password;
	private String email;
	
	public User(String nickname, String password, String email) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.email = email;
	}
	
	public String getNickname() {
		return nickname;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int compareTo(User other) {
		return nickname.compareToIgnoreCase(other.nickname);
	}
}
