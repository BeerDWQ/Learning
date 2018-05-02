package cn.hl.net;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
/*
 * 实现聊天功能
 */
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
/*
 * 发送端，同UdpSend
 */
class ChatSend implements Runnable{
	//套接字，网络端口，Ip协议
	DatagramSocket ds;
	
	public ChatSend(DatagramSocket ds) {
		this.ds=ds;
	}
	public void run() {
		System.out.println("输入端口号:");
		Scanner sc=new Scanner(System.in);
		String adress=sc.next();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			while((line=br.readLine())!=null){
				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getByName(adress),10003);
				ds.send(dp);
				if("886".equals(line)){
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("发送端异常");
		}
	}
}
/*
 *接收端，同UdpAccpet
 */
class ChatRece implements Runnable{
	DatagramSocket ds;
	public ChatRece(DatagramSocket ds) {
		this.ds=ds;
	}
	public void run() {
		try {
			while(true){
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData(),0,dp.getLength());
				int port = dp.getPort();
				System.out.println("ip::"+ip+"::"+data+"::"+port);
				if("886".equals(data)){
					System.out.println(ip+"退出会话");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("接收端异常");
		}
	}
}
/*
 * 测试，启动两个线程，模拟聊天
 */
public class Chat {
	public static void main(String[] args) throws SocketException {
		DatagramSocket dsSend=new DatagramSocket(8888); 
		DatagramSocket dsRece=new DatagramSocket(10003);
		new Thread(new ChatSend(dsSend)).start();
		new Thread(new ChatRece(dsRece)).start();
	}
}

