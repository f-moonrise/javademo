package com.test.twelve.twelve16;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/16 11:32
 */
public class StringBufferDemo7 {
    public static void main(String[] args) {
        int[] arr = {44,33,55,11,22};

        String s1 = arrayTosString(arr);
        System.out.println("s1"+ s1);

        String s2 = arrayTosString2(arr);
        System.out.println("S2:" + s2);
    }

    private static String arrayTosString2(int[] arr) {
        StringBuffer sb = new StringBuffer();

        sb.append("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                sb.append(arr[x]);
            }else {
                sb.append(arr[x]).append(",  ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String arrayTosString(int[] arr) {
        String s = "";

        s+="[";
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s+=arr[x];
            }else {
                s+=arr[x];
                s+=", ";
            }
        }
        s+="]";
        return s;
    }
}
