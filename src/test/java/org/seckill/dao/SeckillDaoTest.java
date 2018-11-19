package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * 配置spring和junit整合,junit启动时加载springIoc容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入Dao 实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L,killTime);
        System.out.println(updateCount);

    }

    @Test
    public void queryById() {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);

    }


    @Test
    public void queryAll() {
        //Caused by: org.apache.ibatis.binding.BindingException:
        // Parameter 'offset' not found. Available parameters are [0, 1, param1, param2]
        //java没有保存形式参数的记录:queryAll(int offset,int limit) ->queryAll(arg0,arg1)
       List<Seckill> seckillList = seckillDao.queryAll(0,100);
       for(Seckill seckill : seckillList){
           System.out.println(seckill);
       }
    }
}