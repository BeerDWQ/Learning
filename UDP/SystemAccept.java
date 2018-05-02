package cn.hl.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 接收控制台输入的数据
 */
public class SystemAccept {
	public static void main(String[] args) throws IOException {
		//建立连接
		DatagramSocket ds=new DatagramSocket(10001);
		//死循环接收
		while(true) {
			byte[] buf=new byte[300];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
		}
	}
	
}
