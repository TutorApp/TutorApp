package pers.tutor.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import pers.tutor.dao.OrderDao;
import pers.tutor.dao.Impl.OrderDaoImpl;

/**
 * @author YangSen
 * @author 作者 E-mail:	ysen_top@163.com
 * @version 创建时间		2020年4月3日 下午9:59:37
    * 类说明	自动拒绝工具类
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
					// sleep()：同步延迟数据，并且会阻塞线程
					Thread.sleep(timeInterval);
					OrderDao orderDao = new OrderDaoImpl();
					orderDao.autoRefuse(id,demand_id);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		//创建定时器
		Thread thread = new Thread(runnable);
		//开始执行
		thread.start();
    }
}
