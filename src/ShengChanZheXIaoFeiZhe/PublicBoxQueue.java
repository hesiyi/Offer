package ShengChanZheXIaoFeiZhe;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//盒子
public class PublicBoxQueue {
	public static void main(String[] args) {
	BlockingQueue publicBoxQueue=new LinkedBlockingQueue(5);
	
	
	Thread pro=new Thread(new  ProducerQueue(publicBoxQueue));
	Thread con=new Thread(new  ConsumerQueue(publicBoxQueue));
	pro.start();
	con.start();
	}

}
