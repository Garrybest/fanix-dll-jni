package cn.sgool.dll;

/**
 * Created by IntelliJ IDEA.
 * Author: Fang Rui
 * Date: 2017/12/23
 * Time: 14:00
 */
public class Login {

    private String serverIp;
    private String serverPort;
    private String trayId;
    private String trayRfid;
    private String[] battstrArr;
    private String isNew;

    public int connectToAppServer() {
        return connectToAppServer(serverIp, serverPort);
    }
    public int upLoginData() {
        return upLoginData(serverIp, serverPort, trayId, trayRfid, battstrArr, isNew);
    }

    private native int connectToAppServer(String serverIP, String serverPort);
    private native int upLoginData(String serverIP, String serverPort, String trayId ,String trayRfid, String[] battstrArr, String isNew);

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

    public String[] getBattstrArr() {
        return battstrArr;
    }

    public void setBattstrArr(String[] battstrArr) {
        this.battstrArr = battstrArr;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }
}
