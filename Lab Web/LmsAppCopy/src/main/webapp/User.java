package com.entity;

public class User {
private int user_id;
private String userFirstName;
private String userLastName;
private int userRoleId;
private String userCreatedOn;
private String userUpdatedOn;
private User userCreatedBy;
private User userUpdatedBy;
private String userEmail;
private String userPwd;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUserFirstName() {
	return userFirstName;
}
public void setUserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}
public String getUserLastName() {
	return userLastName;
}
public void setUserLastName(String userLastName) {
	this.userLastName = userLastName;
}
public int getUserRoleId() {
	return userRoleId;
}
public void setUserRoleId(int userRoleId) {
	this.userRoleId = userRoleId;
}
public String getUserCreatedOn() {
	return userCreatedOn;
}
public void setUserCreatedOn(String userCreatedOn) {
	this.userCreatedOn = userCreatedOn;
}
public String getUserUpdatedOn() {
	return userUpdatedOn;
}
public void setUserUpdatedOn(String userUpdatedOn) {
	this.userUpdatedOn = userUpdatedOn;
}
public User getUserCreatedBy() {
	return userCreatedBy;
}
public void setUserCreatedBy(User userCreatedBy) {
	this.userCreatedBy = userCreatedBy;
}
public User getUserUpdatedBy() {
	return userUpdatedBy;
}
public void setUserUpdatedBy(User userUpdatedBy) {
	this.userUpdatedBy = userUpdatedBy;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}

}
