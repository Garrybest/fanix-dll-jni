package cn.sgool.dll;

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

    public static void main(String[] args) {

        Login login = new Login();
        login.setServerIp("127.0.0.1");
        login.setServerPort("8095");
        login.setTrayId("100");
        login.setTrayRfid("100");
        login.setBattstrArr(new String[]{"0", "1", "2"});
        login.setIsNew("NEW");

        int bLoginResult = login.connectToAppServer();

        System.out.println("LoginResult: " + bLoginResult);

    }
}
