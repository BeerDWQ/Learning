package cn.hl.net;
/*
 * 通过UDP协议实现通信
 * 接受数据
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpAccpet {
	public static void main(String[] args) throws IOException {
		//创建端口
		DatagramSocket ds=new DatagramSocket(10000);
		//定义接受数据的数组
		byte[] buf=new byte[300];
		DatagramPacket db=new DatagramPacket(buf,buf.length);
		//接受数据包,是一个阻塞方法
		ds.receive(db);
		//解析数据包
		String	ip=db.getAddress().getHostAddress();
		byte[] data=db.getData();
		System.out.println(ip+"___"+new String(data,0,buf.length));
	}
}
