package onlineshop.entity;


public class User {

    private String userId;
    private String userName;
    private String userPassword;
    private String userSex;
    private java.sql.Timestamp userBirthday;
    private String userIdenityCode;
    private String userEmail;
    private String userMobile;
    private String userAddress;
    private int userStatus;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }


    public java.sql.Timestamp getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(java.sql.Timestamp userBirthday) {
        this.userBirthday = userBirthday;
    }


    public String getUserIdenityCode() {
        return userIdenityCode;
    }

    public void setUserIdenityCode(String userIdenityCode) {
        this.userIdenityCode = userIdenityCode;
    }


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }


    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }


}
