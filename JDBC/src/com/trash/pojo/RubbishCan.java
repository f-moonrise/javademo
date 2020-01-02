package com.trash.pojo;

import org.omg.CORBA.INTERNAL;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 15:20
 */
public class RubbishCan {
    private Integer id;
    private String rtype;
    private String rname;
    private Integer rl;
    private Integer sjlr;

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getSjlr() {
        return sjlr;
    }

    public void setSjlr(Integer sjlr) {
        this.sjlr = sjlr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public Integer getRl() {
        return rl;
    }

    public void setRl(Integer rl) {
        this.rl = rl;
    }

    public void clRubbish(){
        System.out.println("垃圾桶可以处理垃圾");
    }

}
