package util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 木松 on 2016/12/23.
 */
public class DBHelper {
    private static final String driver = "com.mysql.jdbc.Driver";//数据库驱动
    private static final String url = "jdbc:mysql://139.199.164.64:3306/shopping";//链接数据库的URL地址
    private static final String username = "root";//数据库用户
    private static final String password = "123456";//数据库密码

    private static Connection conn;
    //静态代码块负责加载驱动
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //单例模式返回数据库链接对象
    public  static Connection getConnection() throws Exception {
        if (conn==null){
            conn= DriverManager.getConnection(url,username,password);
            return  conn;
        }
        return  conn;
    }

    public static void main(String[] args) {
        try {
            Connection conn=DBHelper.getConnection();
            if (conn!=null){
                System.out.println("数据库连接正常！");
            }else{
                System.out.println("数据库连接异常！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
