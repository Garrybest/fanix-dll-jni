package cn.sgool.dll;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private double loginTime;
    private String[] battstrArr;
    private String isNew;

    public int connectToAppServer() {
        return connectToAppServer(serverIp, serverPort);
    }

    public int upLoginData() {
        return upLoginData(serverIp, serverPort, trayId, trayRfid, loginTime, battstrArr, isNew);
    }

    private native int connectToAppServer(String serverIP, String serverPort);

    private native int upLoginData(String serverIP, String serverPort, String trayId, String trayRfid, double loginTime, String[] battstrArr, String isNew);

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

    public void setLoginTime() throws ParseException {
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String toDate = simpleFormat.format(new Date());
        long from = simpleFormat.parse("2014-07-07 09:31:25").getTime();
        long to = simpleFormat.parse(toDate).getTime();
        double days = ((long) ((to - from) / (1000 * 60 * 60))) / 24.0;
        days += 41827.355157;
        loginTime = days;
    }
}
