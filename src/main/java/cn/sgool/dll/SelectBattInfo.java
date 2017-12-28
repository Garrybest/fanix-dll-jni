package cn.sgool.dll;

/**
 * Created by IntelliJ IDEA.
 * Author: Fang Rui
 * Date: 2017/12/26
 * Time: 16:03
 */
public class SelectBattInfo {

    private String serverIp;
    private String serverPort;
    private String trayId;
    private String trayRfid;

    public int connectToAppServer() {
        return connectToAppServer(serverIp, serverPort);
    }
    public int getTrayBattInfoDC() {
        return getTrayBattInfoDC(serverIp, serverPort, trayId, trayRfid);
    }

    private native int connectToAppServer(String serverIP, String serverPort);
    private native int getTrayBattInfoDC(String serverIP, String serverPort, String trayId, String trayRfid);


}
