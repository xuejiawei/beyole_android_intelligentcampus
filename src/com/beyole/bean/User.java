package com.beyole.bean;


public class User {

	private int userId;
	private String userName;
	private String password;
	private String userImagePhoto;
	private String userDescription;
	private String otherInfo;
	private String userStatus;
	private String createDate;
	private String userType;
	private String userPhoneNumber;
	private String userQqNumber;
	private int userSex;
	private int userAge;
	private String userCity;
	private String nickName;

	public User() {

	}

	public User(int userId, String userName, String password, String userImagePhoto, String userDescription, String otherInfo, String userStatus, String createDate, String userType, String userPhoneNumber, String userQqNumber, int userSex, int userAge, String userCity) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userImagePhoto = userImagePhoto;
		this.userDescription = userDescription;
		this.otherInfo = otherInfo;
		this.userStatus = userStatus;
		this.createDate = createDate;
		this.userType = userType;
		this.userPhoneNumber = userPhoneNumber;
		this.userQqNumber = userQqNumber;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userCity = userCity;
	}

	public User(int userId, String userName, String password, String userImagePhoto, String userDescription, String otherInfo, String userStatus, String createDate, String userType, String userPhoneNumber, String userQqNumber, int userSex, int userAge, String userCity, String nickName) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userImagePhoto = userImagePhoto;
		this.userDescription = userDescription;
		this.otherInfo = otherInfo;
		this.userStatus = userStatus;
		this.createDate = createDate;
		this.userType = userType;
		this.userPhoneNumber = userPhoneNumber;
		this.userQqNumber = userQqNumber;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userCity = userCity;
		this.nickName = nickName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserImagePhoto() {
		return userImagePhoto;
	}

	public void setUserImagePhoto(String userImagePhoto) {
		this.userImagePhoto = userImagePhoto;
	}

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserQqNumber() {
		return userQqNumber;
	}

	public void setUserQqNumber(String userQqNumber) {
		this.userQqNumber = userQqNumber;
	}

	public int getUserSex() {
		return userSex;
	}

	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", userImagePhoto=" + userImagePhoto + ", userDescription=" + userDescription + ", otherInfo=" + otherInfo + ", userStatus=" + userStatus + ", createDate=" + createDate + ", userType=" + userType
				+ ", userPhoneNumber=" + userPhoneNumber + ", userQqNumber=" + userQqNumber + ", userSex=" + userSex + ", userAge=" + userAge + ", userCity=" + userCity + "]";
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
