package com.test.twelve.twelve19;

import com.test.eleven.eleven29.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zangye03@gmail.com
 * @date 2019/12/19 19:39
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();

        Student s1 = new Student("武松",300);
        Student s2 = new Student("鲁智深",40);
        Student s3 = new Student("林冲",36);
        Student s4 = new Student("杨志",38);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        Iterator it = array.iterator();
        while(it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.getName() + "----" + s.getAge());
        }

        System.out.println("--------------");

        for(int x=0;x<array.size();x++){
            String s = (String)array.get(x);
            System.out.println(s);

            Student s6 = (Student) array.get(x);
            System.out.println(s6.getName() + "---- " + s6.getAge());
        }
    }
}
