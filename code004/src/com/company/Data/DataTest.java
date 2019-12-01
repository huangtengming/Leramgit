package com.company.Data;


import javax.xml.crypto.Data;
import java.util.Date;

public class DataTest {

    public static void main(String[] args){

        Date birthday = new Date() ;//新建立一个变量，然后给变量构造一个对象
        Date deadline ;//对象变量
        deadline = birthday;//给对象下引用一个已经存在的变量
        System.out.println(birthday);
        System.out.println(deadline);
    }



}
