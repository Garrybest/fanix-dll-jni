package cn.sgool.dll;

/**
 * @Description:
 * @Author: Fang Rui
 * @Date: 2018/1/4
 * @Time: 10:28
 */
public class Classify {
    private String serverIp;
    private String serverPort;
    private String trayId;
    private String trayRfid;
    private String dataType;
    private String fileName;
    private String ocvNum;

    public int connectToAppServer() {
        return connectToAppServer(serverIp, serverPort);
    }
    public int upOcvFxResult16() {
        return upOcvFxResult16(serverIp, serverPort, dataType, trayId, trayRfid, fileName);
    }
    public int upOcvFxResultMany() {
        return upOcvFxResultMany(serverIp, serverPort, trayId, trayRfid, fileName, dataType, ocvNum);
    }

    private native int connectToAppServer(String serverIP, String serverPort);
    private native int upOcvFxResult16(String serverIP, String serverPort, String dataType, String trayId, String trayRfid, String fileName);
    private native int upOcvFxResultMany(String serverIP, String serverPort, String trayId, String trayRfid, String fileName, String dataType, String ocvNum);

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOcvNum() {
        return ocvNum;
    }

    public void setOcvNum(String ocvNum) {
        this.ocvNum = ocvNum;
    }
}
