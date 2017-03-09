package ShengChanZheXIaoFeiZhe;

import java.util.concurrent.BlockingQueue;
//消费者
public class ConsumerQueue implements Runnable {
	private final BlockingQueue conQueue;

	public ConsumerQueue(BlockingQueue publicBoxQueue) {
		// TODO Auto-generated constructor stub
		this.conQueue=publicBoxQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			try{
				System.out.println("消费者的消费编号为："+conQueue.take());
				Thread.sleep(1000);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
