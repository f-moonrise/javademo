package com.test.eleven.zhouce3;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/28 8:47
 */
public class Test {
    static Scanner in = new Scanner(System.in);
    static User[] user = new User[10];
    static Products[] products = new Products[100];
    static int asd ;
    static String[] car = new String[10];


    public static void main(String[] args){
        //初始化
        chup();
        //展示
        show();
//        showProducts();
//        showUser();
        in.close();
    }

    //展示
    public static void show(){
        boolean key = true;
        while (key){
            Util.start();
            int fs = in.nextInt();
            if(fs == 1){
                regist();
            }else if(fs == 2){
                login();
            }else if(fs == 3){
                key = false;
            }
        }
    }

    //注册
    public static void regist(){
        Util.regist();
        System.out.println("输入名字:");
        String uname = in.next();
        System.out.println("输入密码:");
        String pwd = in.next();
        regist(uname,pwd);
    }

    //注册
    public static void regist(String uname, String pwd){
        boolean key = true;
        if(uname!=null&&pwd!=null){
            for(int i = 0;i<user.length;i++){
                if(user[i]!=null){
                    if(user[i].uname.equals(uname)){
                        System.out.println("此用户已注册！");
                        key = false;
                    }
                }

                while (key){
                    for(int j = 0;j<user.length;j++) {
                        if(user[j]==null){
                            user[j] = new User(uname, pwd, 0, 0 ,null);
                            System.out.println("注册成功！");
                            key=false;
                            show();
                            break;
                        }
                    }
                }
            }
        }else{
            System.out.println("用户名或密码为空，请重新输入。");
            regist();
        }
    }

    //登录
    public static void login(){
        Util.login();
        System.out.println("输入名字:");
        String uname = in.next();
        System.out.println("输入密码:");
        String pwd = in.next();
        login(uname,pwd);
    }

    //登录
    public static void login(String uname,String pwd){
        boolean key = false;
        if(uname!=null&&pwd!=null&&user!=null){
            for(int i = 0;i<user.length;i++){
                if(user[i]!=null&&user[i].uname.equals(uname)&&user[i].pwd.equals(pwd)){
                    //登录成功
                    key = true;
                    asd = i;
                }
            }
        }else{
            System.out.println("登录失败，用户名或密码错误。");
        }

        if(key){
            //选择页面
            System.out.println("登陆成功。");
            showUser();
            gong();
        }else {
                System.out.println("登陆失败。");
                show();
        }
    }

    //功能模块
    public static void gong(){
        while (true){
            Util.gong();
            int fs = in.nextInt();
            if(fs==1){
                showProducts();
            }else if(fs==2){
                chaProducts();
            }else if(fs==3){
                paiMai();
            }else if(fs==4){
                chong();
            }else if(fs==5){
                showUser();
            }else if(fs==0){
                show();
            }
        }
    }

    //拍卖
    public static void paiMai(){
        Util.paiMai();
        showProducts();
        paiMaiju(asd);
    }

    public static void paiMaiju(int asd){
        System.out.println("请输入你选择商品的编号或名称:");
        String fs = in.next();
        int j=0;
        if(fs!=null){
            for(int i=0;i<products.length;i++){
                if(products[i]!=null){
                    if(products[i].pname.equals(fs)||products[i].id.equals(fs)){
                        if(user!=null&&user[asd]!=null){
                            for(int k=0;k<car.length;k++){
                                car[k]=products[i].pname;
                                    break;
                                }
                            }
                       }
                    }
                }
            }else {
            System.out.println("对不起，你没有输入任何信息。");
            paiMaiju(asd);
        }

        user[asd].gcar=car;
        System.out.println("拍卖成功。");
        //是否继续拍卖
        paiduan();
    }

    //是否继续拍卖
    public static void paiduan(){
        Util.paiduan();
        int fs = in.nextInt();
        if(fs==1){
            paiMaiju(asd);
        }else if(fs==2){
            showProducts();
            paiduan();
        }else if(fs==0){
            showUser();
            show();
        }
    }

    //打印用户信息
    public static void showUser(){
        for(int i=0;i<user.length;i++){
            if(user!=null&&user[i]!=null&&user[i].uname!=null&&user[i].gcar!=null){
                System.out.printf("名字:"+user[i].uname);
                System.out.print("积分:"+user[i].money +"等级:"+user[i].level);
                System.out.printf("已选商品:");
                for(int j=0;j<user[i].gcar.length;j++){
                    if(user[i].gcar[i]!=null){
                        System.out.print(user[i].gcar[j]);
                    }
                }
            }
        }
        System.out.println();
    }

    //商品初始化
    public static void chup(){
        Products p = new Products("000", "主宰", 18888);
        products[0] = p;
        p = new Products("001", "李白", 18888);
        products[1] = p;
        p = new Products("002", "宫本武藏", 18888);
        products[2] = p;
        p = new Products("003", "吕布", 18888);
        products[3] = p;
        p = new Products("004", "鲁班", 13888);
        products[4] = p;
        p = new Products("005", "貂蝉", 13888);
        products[5] = p;
        p = new Products("006", "钟馗", 13888);
        products[6] = p;
        p = new Products("007", "诸葛亮", 18888);
        products[7] = p;
        p = new Products("008", "百里守约", 13888);
        products[8] = p;
        p = new Products("009", "典韦", 13888);
        products[9] = p;
        p = new Products("010", "雅典娜", 18888);
    }

    //商品展示
    public static void showProducts(){
        for(int i=0;i<products.length;i++){
            if(products[i]!=null){
                System.out.printf("编号:" + products[i].id + " 名称:" + products[i].pname + " 价格:" + products[i].price + "  \t" );
                while ((i+1)%5==0){
                    System.out.println();
                    break;
                }
            }
        }
    }

    //商品查询
    public static void chaProducts(){
        Util.cha();
        String fs = in.next();
        if(fs!=null){
            for(int i=0;i<products.length;i++){
                if(products[i]!=null){
                    if(products[i].pname.equals(fs)||products[i].id.equals(fs)){
                        System.out.print("编号:" + products[i].id + "     ");
                        System.out.print("名称:" + products[i].pname + "     ");
                        System.out.println("价格:" + products[i].price);
                    }
                }
            }
        }else {
            System.out.println("对不起，你没有输入任何信息。");
            chaProducts();
        }
    }

    //账户充值
    public static void chong(){
        Util.chong();
        System.out.println("请输入你要充值的金额:");
        int fs=in.nextInt();
        if(fs<0||fs>100){
            System.out.println("充值失败！");
        }else {
            user[asd].money = user[asd].money + fs;
            System.out.println("充值成功");
            showUser();
        }
    }

    //商品的上架
    public static void shangjia(){
        System.out.println("请输入你要拍卖商品的信息:包括编号id，名字name,价格price");
        String id = in.next();
        String name = in.next();
        int price = in.nextInt();
        Products p = new Products(id,name,price);

        for(int i=0;i<products.length;i++){
            if(products[i]==null){
                products[i] = p;
            }
        }
    }

    //商品排行榜
    public static void paihangb(){
        for(int i=0;i<products.length;i++){

        }
    }

    //结算模块


}
