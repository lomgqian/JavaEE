package com.example.homework11_6.AOP;

/**
 * @date 2023/12/9 20:53
 */
public class Apple {
    private int uid;
    private String uname;
    private double uprice;
    public Apple() {
        // 无参数构造函数
    }    public Apple(int uid, String uname, double uprice) {
        this.uid = uid;
        this.uname = uname;
        this.uprice = uprice;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uprice=" + uprice +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getUprice() {
        return uprice;
    }

    public void setUprice(double uprice) {
        this.uprice = uprice;
    }
}
