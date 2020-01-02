package com.trash.pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/27 15:19
 */
public class Rubbish {
    private Integer id;
    private String rname;
    private String rtype;
    private Integer rd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public Integer getRd() {
        return rd;
    }

    public void setRd(Integer rd) {
        this.rd = rd;
    }

    public void bad(){
        System.out.println("垃圾有危害");
    }
}

