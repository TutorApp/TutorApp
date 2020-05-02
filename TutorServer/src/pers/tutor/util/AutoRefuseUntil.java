package pers.tutor.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import pers.tutor.dao.OrderDao;
import pers.tutor.dao.Impl.OrderDaoImpl;

/**
 * @author YangSen
 * @author ���� E-mail:	ysen_top@163.com
 * @version ����ʱ��		2020��4��3�� ����9:59:37
    * ��˵��	�Զ��ܾ�������
 */
public class AutoRefuseUntil implements Runnable {
    private int id;
    private int demand_id;
	public static ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 300, 200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
    
    public void SetId(int id,int demand_id) {
        this.id = id;
        this.demand_id = demand_id;
    }


	public void run() {
		final long timeInterval = 900000;
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					// sleep()��ͬ���ӳ����ݣ����һ������߳�
					Thread.sleep(timeInterval);
					OrderDao orderDao = new OrderDaoImpl();
					orderDao.autoRefuse(id,demand_id);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		//������ʱ��
		Thread thread = new Thread(runnable);
		//��ʼִ��
		thread.start();
    }
}
