package com.trash.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 15:23
 */
public class Users {
    private Integer id;
    private String username;
    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void rule(){
        System.out.println("爱护环境，人人有责");
    }
}
