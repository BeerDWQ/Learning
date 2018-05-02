package cn.hl.net;
/*
 * 通过UDP协议实现通信
 * 发送数据
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSend {
	public static void main(String[] args) throws IOException {
		//1.建立Udp服务，通过DatagramSocket
		DatagramSocket ds=new DatagramSocket();
		//2.确定数据并封装成数据包
		byte[] buf="Hello".getBytes();
		//打包数据，使用DatagramPacket类构造方法
		DatagramPacket dp=new DatagramPacket(buf,buf.length, InetAddress.getByName("172.27.35.4"),10000);
		//3.通过socket服务将数据包发送出去
		ds.send(dp);
		//关闭连接
		ds.close();
	}
}
