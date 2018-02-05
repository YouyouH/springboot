package com.oumu.appsite.admin.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_customer_basic")
public class AppCustomerBasic {

    public AppCustomerBasic() {
    }

    @Id
    @Column(name = "USER_ID")
    private Long userid;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWD")
    private String passwd;
    @Column(name = "USERDSPNAME")
    private String userdspname;
    @Column(name = "ACTIVITY")
    private Long activity;
    @Column(name = "USER_SEX")
    private Long usersex;
    @Column(name = "USER_TYPE")
    private Long usertype;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CREATE_DATE")
    private Long createdate;
    @Column(name = "UPDATE_DATE")
    private Long updatedate;
    @Column(name = "DELETED")
    private Long deleted;
    @Column(name = "DELETE_DATE")
    private Long deletedate;
    @Column(name = "DELETE_USER")
    private Long deleteuser;
    @Column(name = "PASSWD_OUTDATE_CFG")
    private Long passwdoutdatecfg;
    @Column(name = "PASSWD_OUTDATE")
    private Long passwdoutdate;
    @Column(name = "LOGIN_FIIL_NUM")
    private Long loginfiilnum;
    @Column(name = "LOGIN_LOCK_STSATE")
    private Long loginlockstsate;
    @Column(name = "USER_IMAGE")
    private String userimage;
    @Column(name = "USER_SIG")
    private String usersig;
    @Column(name = "USER_IMAGE_WIDTH")
    private Long userimagewidth;
    @Column(name = "USER_IMAGE_HEIGHT")
    private Long userimageheight;
    @Column(name = "STORE_ID")
    private Long storeid;
    @Column(name = "USER_CITY")
    private String usercity;


    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    public String getUserdspname() {
        return userdspname;
    }

    public void setUserdspname(String userdspname) {
        this.userdspname = userdspname;
    }


    public Long getActivity() {
        return activity;
    }

    public void setActivity(Long activity) {
        this.activity = activity;
    }


    public Long getUsertype() {
        return usertype;
    }

    public void setUsertype(Long usertype) {
        this.usertype = usertype;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Long getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Long createdate) {
        this.createdate = createdate;
    }


    public Long getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Long updatedate) {
        this.updatedate = updatedate;
    }


    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }


    public Long getDeletedate() {
        return deletedate;
    }

    public void setDeletedate(Long deletedate) {
        this.deletedate = deletedate;
    }


    public Long getDeleteuser() {
        return deleteuser;
    }

    public void setDeleteuser(Long deleteuser) {
        this.deleteuser = deleteuser;
    }


    public Long getPasswdoutdatecfg() {
        return passwdoutdatecfg;
    }

    public void setPasswdoutdatecfg(Long passwdoutdatecfg) {
        this.passwdoutdatecfg = passwdoutdatecfg;
    }


    public Long getPasswdoutdate() {
        return passwdoutdate;
    }

    public void setPasswdoutdate(Long passwdoutdate) {
        this.passwdoutdate = passwdoutdate;
    }


    public Long getLoginfiilnum() {
        return loginfiilnum;
    }

    public void setLoginfiilnum(Long loginfiilnum) {
        this.loginfiilnum = loginfiilnum;
    }


    public Long getLoginlockstsate() {
        return loginlockstsate;
    }

    public void setLoginlockstsate(Long loginlockstsate) {
        this.loginlockstsate = loginlockstsate;
    }


    public String getUserimage() {
        return userimage;
    }

    public void setUserimage(String userimage) {
        this.userimage = userimage;
    }


    public String getUsersig() {
        return usersig;
    }

    public void setUsersig(String usersig) {
        this.usersig = usersig;
    }


    public Long getUserimagewidth() {
        return userimagewidth;
    }

    public void setUserimagewidth(Long userimagewidth) {
        this.userimagewidth = userimagewidth;
    }


    public Long getUserimageheight() {
        return userimageheight;
    }

    public void setUserimageheight(Long userimageheight) {
        this.userimageheight = userimageheight;
    }


    public Long getStoreid() {
        return storeid;
    }

    public void setStoreid(Long storeid) {
        this.storeid = storeid;
    }


    public String getUsercity() {
        return usercity;
    }

    public void setUsercity(String usercity) {
        this.usercity = usercity;
    }


    public Long getUsersex() {
        return usersex;
    }

    public void setUsersex(Long usersex) {
        this.usersex = usersex;
    }
}
