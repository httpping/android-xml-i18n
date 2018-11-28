# android-xml-i18n
android国际化 编码时用到

使用：
本应用主要讲 excel表格的数据插入到 xml中。 并对应 相应的国际化

#使用规则excel要求
第一行标志 位  标志name  和对应的国际化语言


运行：
I18NLib  -》 MyI18NClass.java 文件
里面有两个配置项 
1、 想要写入的工程资源目录
 /**
     * 资源目录 例如 ： C:\work\demo\AndroidDemos\I18NParse\app\src\main\res
     */
    public static String rootRes ;

2、  excel的地址，默认在I18NLib/xml-data.xlsx ，使用默认不需要配置

/**
     * xml 目录 ： 默认
     */
    public static String rootXLSX;
