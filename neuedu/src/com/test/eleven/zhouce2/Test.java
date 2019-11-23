package com.test.eleven.zhouce2;

import java.util.Scanner;

/**
 * @author zangye03@gmail.com
 * @date 2019/11/21 12:56
 */
public class Test {
//      定义一个count计数器，用来计算同一门派的人
    public static int count=0;

    public static void main(String[] args){
//      初始化部分
        Scanner in = new Scanner(System.in);
        User[] us = new User[20];
        Anamil[] an = new Anamil[100];
        boolean key = true;//灵境钥匙
        boolean key1 = false;//年龄通过钥匙
        boolean key2 = false;//全部通过条件
        boolean key3 = false;//挑选灵兽

//      灵兽的初始化
        Anamil anamil = new Anamil("狗", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "撕咬");
        an[0] = anamil;
        anamil = new Anamil("螃蟹", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "泡泡攻击");
        an[1] = anamil;
        anamil = new Anamil("蝎子", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "扎");
        an[2] = anamil;
        anamil = new Anamil("螃蟹", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "泡泡攻击");
        an[3] = anamil;
        anamil = new Anamil("鳄鱼", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "吐丝");
        an[4] = anamil;
        anamil = new Anamil("夜行虎", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "撕咬");
        an[5] = anamil;
        anamil = new Anamil("山脊寻行者", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "撞击");
        an[6] = anamil;
        anamil = new Anamil("鲁班七号", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "无敌鲨嘴炮");
        an[7] = anamil;
        anamil = new Anamil("李白", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "神来之笔");
        an[8] = anamil;
        anamil = new Anamil("哆啦A梦", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "任意门");
        an[9] = anamil;
        anamil = new Anamil("孙悟空", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "当头一棒");
        an[10] = anamil;



        while (key){
            System.out.println("=======================");
            System.out.println("欢迎来到有妖气灵境！");
            //    进入灵境
            System.out.println("请输入你的名字:");
            String name = in.next();
            System.out.println("请输入你的门派:");
            String menp = in.next();
            System.out.println("请输入你的性别:");
            String xingb = in.next();
            System.out.println("请输入你的年龄:");
            int age = in.nextInt();

            //     进入
            int fs1 = login(name,menp,xingb,age,us);
            if(fs1==1){
                System.out.println("报名成功，年龄通过。");
                key1 = true;
            }else{
                System.out.println("报名失败，年龄未通过。");
                key1 = false;
            }

            if (key1){
                //      检查同一门派进入人数
                int fs2 = menh(menp,us);
                if(fs2==1){
                    key2=true;
                    System.out.println("报名成功，门派通过。");
                }else{
                    key2=false;
                    System.out.println("报名失败，门派未通过。");
                }
            }

            if(key2){
                System.out.println("恭喜你通过层层考核，进入灵境。");
                System.out.println("############################");
                System.out.println("下面是灵境里的各种灵兽");
                for(int i=0;i<an.length;i++){
                    if(an[i]!=null){
                        System.out.println("名字: "+an[i].name +"  技能: "+ an[i].jin);
                    }
                    key3 = true;
                }
            }else{
                System.out.println("失败，无缘。");
            }


            while (key3){
//                  灵兽的初始化
//                Anamil anamil = new Anamil("狗", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "撕咬");
//                an[0] = anamil;
//                anamil = new Anamil("螃蟹", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "泡泡攻击");
//                an[1] = anamil;
//                anamil = new Anamil("蝎子", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "扎");
//                an[2] = anamil;
//                anamil = new Anamil("螃蟹", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "泡泡攻击");
//                an[3] = anamil;
//                anamil = new Anamil("鳄鱼", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "吐丝");
//                an[4] = anamil;
//                anamil = new Anamil("夜行虎", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "撕咬");
//                an[5] = anamil;
//                anamil = new Anamil("山脊寻行者", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "撞击");
//                an[6] = anamil;
//                anamil = new Anamil("鲁班七号", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "无敌鲨嘴炮");
//                an[7] = anamil;
//                anamil = new Anamil("李白", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "神来之笔");
//                an[8] = anamil;
//                anamil = new Anamil("哆啦A梦", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "任意门");
//                an[9] = anamil;
//                anamil = new Anamil("孙悟空", (int)(Math.random()*5), (int)(Math.random()*11), (int)(Math.random()*100), "当头一棒");
//                an[10] = anamil;


                System.out.println("############################");
                System.out.println("下面是灵境里的各种灵兽");
                for(int i=0;i<an.length;i++) {
                    if (an[i] != null) {
                        System.out.println("名字: " + an[i].name + "  技能: " + an[i].jin);
                    }
                }


                System.out.println("请输入选择灵兽的属性");
                String xzs = in.next();
                String fs4 = chuan(xzs);
                System.out.println("请输入你选择的灵兽");
                String xzn = in.next();




                System.out.println("请回答该灵兽的技能，回答正确，会收到灵兽的好感动，捕获成功，否则捕获失败。");
                String xzj = in.next();
                int fs3 = buhuo(xzj,an);
                if(fs3==1){
                    System.out.println("恭喜你，捕获成功！！！");
                    key3=false;
                    for(int i=0;i<an.length;i++){
                        if(an[i]!=null){
                            if(an[i].name.equals(xzn)){
                                System.out.println("名字: "+an[i].name +"  属性: "+shuz(an[i].shux) +"  能力: "+nengz(an[i].nengl) +"  等级: "
                                        +an[i].level +"  技能: "+ an[i].jin);
                            }
                        }
                    }
                }else{
                    System.out.println("很不幸，捕获失败！！！");
                    System.out.println("请重新捕获！");
                }
            }
        }
    }


//    进入灵境
    public static int  login(String name,String menp,String xingb,int age,User[] us){
        User user = new User();
        user.name = name;
        user.menp = menp;
        user.xingb = xingb;
        user.age = age;
//      年龄小于10岁或者大于30岁之人，不允许进入灵境
        if (user.age>=10&&user.age<=30){
            for(int i = 0;i<us.length;i++){
                if(us[i]==null){
                    us[i]=user;
                    return 1;
                }
            }
        }
        return -1;
    }

//    统计同一门派人数是否已满10人
    public static int menh(String menp,User[] us){
        User user = new User();
        user.menp = menp;

        for(int i=0;i<us.length;i++){
            if(us[i]!=null){
                if ( us[i].menp.equals(menp)){

                    count=count+1;
                    System.out.println(count);
                }
            }
        }
//      判断认数是否超纲
        if(count<=10){
            return 1;
        }
        return -1;
    }



//    转换属性1
    public static String shuz(int shux){
        switch (shux){
            case 0:
                return "金";
            case 1:
                return "木";
            case 2:
                return "水";
            case 3:
                return "火";
            case 4:
                return "土";
            default:
                return null;
        }
    }

//    能力转换
    public static String nengz(int nengl){
        if(nengl>=0&&nengl<=3){
            return "一般";
        }else if(nengl>=4&&nengl<=6){
            return "中等";
        }else if(nengl>=5&&nengl<=9){
            return "优秀";
        }else{
            return "极品";
        }
    }

//    捕获是否成功
    public static int buhuo(String jin,Anamil[] an){
        for(int i=0;i<an.length;i++){
            if(an[i]!=null){
                if (jin.equals(an[i].jin)){
                    return 1;
                }
            }
        }
        return 0;
    }

//  选择属性传送区域
    public static String chuan(String xzs){
//        int ls = shuz(xzs);
        if(xzs.equals("金")){
            System.out.println("欢迎来到钢铁巨城");
        }else if(xzs.equals("木")){
            System.out.println("欢迎来到世界树");
        }else if(xzs.equals("水")){
            System.out.println("欢迎来到水帘洞");
        }else if(xzs.equals("火")){
            System.out.println("欢迎来到火焰山");
        }else if(xzs.equals("土")){
            System.out.println("欢迎来到地下世界");
        }
        return null;
    }
}
