package com.test.eleven.eleven29.shitou.service;

import com.test.eleven.eleven29.shitou.dao.UserDao;
import com.test.eleven.eleven29.shitou.pojo.User;
import com.test.eleven.zhouce3.Util;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/29 14:44
 */
public class UserService {
    UserDao ud = new UserDao();

    //注册
    public String register(String name, String psd){
        //查找是否有该用户
        int fs = ud.select(name);
        if(fs==1){
            return "该用户以注册！";
        }else {
            int fs1 = ud.add(name,psd,0,null,null);
            if (fs1==1){
                return "注册成功";
            }else{
                return "注册失败";
            }
        }
    }

    //商品的上架
    public String shangjia(int asd) {
        int fs = ud.shangjia(asd);
        if(fs==1){
            return "符合上架资格";
        }else {
            return "不符合上架资格,积分不足500";
        }
    }

    //登录
    public int login(String name, String psd){
        int fs = ud.selecth(name, psd);

        if(fs!=0){
            System.out.println("登录成功");
            return fs;
        }else {
            System.out.println("登录成功");
            return 0;
        }
    }

    //打印用户信息
    public void showUser(int asd){
        User user = ud.showUser(asd);
        if(user!=null){
            System.out.printf("名字:"+user.getName());
            System.out.print("积分:"+user.getIntegral());
            System.out.printf(" 已选商品:");
            if(user.getGcar()!=null){
                for(int j=0;j<user.getGcar().length;j++){
                    if(user.getGcar()!=null&&user.getGcar()[j]!=null){
                        System.out.print(user.getGcar()[j].getPname());
                    }
                }
            }else {
                System.out.print("购物车为空");
            }
            System.out.printf(" 已有商品:");
            if(user.getBao()!=null){
                for(int j=0;j<user.getBao().length;j++){
                    if(user.getBao()!=null&&user.getBao()[j]!=null){
                        System.out.print(user.getBao()[j].getPname());
                    }
                }
            }else {
                System.out.print("百宝囊为空");
            }
            System.out.println();
        }
    }

    //充值
    public void chong(int asd,int fs){
        if(fs<0||fs>100){
            System.out.println("充值失败！");
        }else {
            ud.chong(asd,fs);
        }
    }

    //排行榜
    public void showInte(){
        ud.selectInte();
         ud.showInte();
    }

    //游戏
    public String youxi(int select,int asd){
        int fs = ud.youxi(select,asd);
        if(fs==1){
            return "恭喜你赢了";
        }else if(fs==-1){
            return "很不幸你输了";
        }else {
            return "平局";
        }
    }

    //清空购物车
    public String cleang(int asd){
        int fs = ud.cleang(asd);
        if(fs==1){
            return "清空成功";
        }else {
            return "清空失败";
        }
    }
}
