package cn.hl.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*
 * 发送控制台输入的数据
 */
public class SystemIN {
	public static void main(String[] args) throws IOException {
		//建立socket连接
		DatagramSocket ds=new DatagramSocket(10001);
		//输入字符流，转换成字节流
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bf.readLine())!=null) {
			byte[] buf=line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("172.27.35.4"),10001);
			ds.send(dp);
			if("886".equals(line)) {
				break;
			}
		}
//		//按行读取输入的数据,返回String类型
//		line=bf.readLine();
//		//定义byte数组接收读取到的数据，getByte方法转换成byte类型
//		byte[] buf=line.getBytes();
//		//打包数据
//		DatagramPacket dp=new DatagramPacket(buf,buf.length,InetAddress.getByName("172.27.35.4"),10001);
//		ds.send(dp);
	}
}
