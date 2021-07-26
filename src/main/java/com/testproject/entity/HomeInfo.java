package com.testproject.entity;

public class HomeInfo {

    private String homeName;
    private String homeAdress;

    public HomeInfo(String homeName, String homeAdress) {
        System.out.print("执行有参构造函数");
        this.homeName = homeName;
        this.homeAdress = homeAdress;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getHomeName() {
        return homeName;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    @Override
    public String toString() {
        return "HomeInfo{" +
                "homeName='" + homeName + '\'' +
                ", homeAdress='" + homeAdress + '\'' +
                '}';
    }
}
