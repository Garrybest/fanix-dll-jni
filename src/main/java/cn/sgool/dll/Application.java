package cn.sgool.dll;

import java.text.ParseException;

/**
 * Created by IntelliJ IDEA.
 * Author: Fang Rui
 * Date: 2017/12/18
 * Time: 16:41
 */
public class Application {

    static {
        SoFileLoader.loadSoFiles();
    }

    public static void main(String[] args) throws ParseException {

        Login login = new Login();
        login.setServerIp("127.0.0.1");
        login.setServerPort("8095");
        login.setTrayId("100");
        login.setTrayRfid("100");
        login.setLoginTime();
        login.setBattstrArr(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
        login.setIsNew("NEW");

        int bLoginResult = login.connectToAppServer();
        System.out.println("连接数据库完成，结果：LoginResult: " + bLoginResult);

        bLoginResult = login.upLoginData();
        System.out.println("上传数据完成，结果：LoginResult: " + bLoginResult);

    }
}
