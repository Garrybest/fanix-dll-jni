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

        // 测试所有方法
        int result;
        Login login = new Login();
        login.setServerIp("127.0.0.1");
        login.setServerPort("8095");
        login.setTrayId("100");
        login.setTrayRfid("100");
        login.setLoginTime();
        login.setBattstrArr(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"});
        login.setIsNew("NEW");
        result = login.connectToAppServer();
        System.out.println("连接数据库完成，结果：" + result);
        result = login.upLoginData();
        System.out.println("上传数据完成，结果：" + result);

        SelectBattInfo selectBattInfo = new SelectBattInfo();
        selectBattInfo.setServerIp("127.0.0.1");
        selectBattInfo.setServerPort("8095");
        selectBattInfo.setTrayId("100");
        selectBattInfo.setTrayRfid("100");
        result = selectBattInfo.connectToAppServer();
        System.out.println("连接数据库完成，结果：" + result);
        result = selectBattInfo.getTrayBattInfoDC();
        System.out.println("获取托盘条码1数据完成，结果：" + result);
        result = selectBattInfo.getTrayBattInfoDC2();
        System.out.println("获取托盘条码2数据完成，结果：" + result);

        UpFreeTray upFreeTray = new UpFreeTray();
        upFreeTray.setServerIp("127.0.0.1");
        upFreeTray.setServerPort("8095");
        upFreeTray.setTrayId("100");
        upFreeTray.setTrayRfid("100");
        result = upFreeTray.connectToAppServer();
        System.out.println("连接数据库完成，结果：" + result);
        result = upFreeTray.upFreeTray();
        System.out.println("解绑托盘条码数据完成，结果：" + result);

        Classify classify = new Classify();
        classify.setServerIp("127.0.0.1");
        classify.setServerPort("8095");
        classify.setTrayId("100");
        classify.setTrayRfid("100");
        classify.setDataType("1");
        classify.setFileName("./");
        classify.setOcvNum("5");
        result = classify.connectToAppServer();
        System.out.println("连接数据库完成，结果：" + result);
        result = classify.upOcvFxResult16();
        System.out.println("连接并且上传整个托盘的OCV和分选数据OCV1到OCV4完成，结果：" + result);
        result = classify.upOcvFxResultMany();
        System.out.println("连接并且上传整个托盘的OCV和分选数据完成，结果：" + result);
    }
}
