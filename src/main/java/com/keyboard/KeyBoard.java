package com.keyboard;

public class KeyBoard {


    /**
     * Setting->Editor->General->Postfix Completion当中查看这些快捷键
     */


    /**
     * .if  .else 和 .while 相关的
     *
     * .null   .nn
     */
    public  void  testKeyBoard(){

        /**
         * Boolean 类型的对象
         */
        //flag.if  直接回车就出来
        boolean flag=false;
        if (flag) {
        }
        //flag.else
        if (!flag) {
        }
        //flag.while
        while (flag) {
        }

        /**
         * String 字符串类型的对象
         */
        //strValue.null
         String strValue="lzl";
        if (strValue == null) {

        }
        //strValue.nn
        if (strValue != null) {

        }
    }

    /**
     * 快速返回 a.return, 快速输出 a.sout
     *
     * 快速写异常 .try
     *
     * 使用 var 直接返回值
     * @return
     */
    public String  testReturnKeyBoard(){

        // .try
        try {
            Integer integer=Integer.parseInt("a");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //.var 快速写返回值
        String s = testFive();

        String string="lzl";
        //string.sout
        System.out.println(string);
        //string.return;
        return string;
    }

    public  String testFive(){
        return "lzl";
    }

}
