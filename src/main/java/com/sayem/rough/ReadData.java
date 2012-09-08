package com.sayem.rough;

import com.sayem.util.TestUtil;
import com.sayem.util.Xls_Reader;

import java.util.Hashtable;

public class ReadData {
    public static void main(String[] args) {


        Hashtable<String,String> table = new Hashtable<String,String>();
        table.put("name", "ashish");
        table.put("city", "Moscow");

        System.out.println(table.get("name"));
        System.out.println(table.get("city"));
        System.out.println(table.get("ccccc"));
        Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//src//com//qtpselenium//data//Test Cases.xlsx");
        /*
        TestUtil.getData("LoginTest", xls);
        TestUtil.getData("FindFriend", xls);
        TestUtil.getData("PassWordChange", xls);
        */






    }
}
