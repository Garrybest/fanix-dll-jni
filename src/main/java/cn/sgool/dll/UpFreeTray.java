package cn.sgool.dll;

/**
 * @Description:
 * @Author: Fang Rui
 * @Date: 2018/1/3
 * @Time: 21:28
 */
public class UpFreeTray {

    private String serverIp;
    private String serverPort;
    private String trayId;
    private String trayRfid;

    public int connectToAppServer() {
        return connectToAppServer(serverIp, serverPort);
    }
    public int upFreeTray() {
        return upFreeTray(serverIp, serverPort, trayId, trayRfid);
    }

    private native int connectToAppServer(String serverIP, String serverPort);
    private native int upFreeTray(String serverIP, String serverPort, String trayId, String trayRfid);

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
