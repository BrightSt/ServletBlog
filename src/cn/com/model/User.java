package cn.com.model;

import java.util.Date;

/**
 * Created by tanhaiyuan on 2015/7/3.
 */
public class User {
    private int id;//id
    private String name;//�û���
    private String email;//�û�����
    private String password;//�û�����
    private Date regidate;//ע��ʱ��
    private String picUrl;//ͷ��·��

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegidate() {
        return regidate;
    }

    public String getPassword() {
        return password;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegidate(Date regidate) {
        this.regidate = regidate;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
