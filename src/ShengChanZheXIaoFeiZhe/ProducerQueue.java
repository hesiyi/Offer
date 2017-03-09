package ShengChanZheXIaoFeiZhe;

import java.util.concurrent.BlockingQueue;
//生产者
public class ProducerQueue implements Runnable {
	private final BlockingQueue proQueue;
	public ProducerQueue(BlockingQueue publicBoxQueue) {
		// TODO Auto-generated constructor stub
		this.proQueue=publicBoxQueue;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try{
				System.out.println("生产者的生产编号为："+i);
				proQueue.put(i);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
