package pojo;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/28 10:21
 */
public class A {
    private Integer m;
    private String s;

    @Override
    public String toString() {
        return "A{" +
                "m=" + m +
                ", s='" + s + '\'' +
                '}';
    }

    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public A(){

    }

    public A(String sa){
        this.s = sa;
    }

    private A(Integer n){
        this.m = n;
    }

    public void show(){
        System.out.println("这是A类的普通方法");
    }

    public void noshow(){
        System.out.println("这是A类的私有方法");
    }
}
