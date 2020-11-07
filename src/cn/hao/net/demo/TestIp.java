package cn.hao.net.demo;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 86189
 */
public class TestIp {
    public static void main(String[] args) {
        try {
            //查询主机ip
            InetAddress localHost = Inet4Address.getByName("weblib.scutnc.cn");
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
