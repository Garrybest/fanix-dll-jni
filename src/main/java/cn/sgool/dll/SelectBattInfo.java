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
    public int getTrayBattInfoDC2() {
        return getTrayBattInfoDC2(serverIp, serverPort, trayId, trayRfid);
    }

    private native int connectToAppServer(String serverIP, String serverPort);
    private native int getTrayBattInfoDC(String serverIP, String serverPort, String trayId, String trayRfid);
    private native int getTrayBattInfoDC2(String serverIP, String serverPort, String trayId, String trayRfid);

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getTrayId() {
        return trayId;
    }

    public void setTrayId(String trayId) {
        this.trayId = trayId;
    }

    public String getTrayRfid() {
        return trayRfid;
    }

    public void setTrayRfid(String trayRfid) {
        this.trayRfid = trayRfid;
    }
}
