package com.unicom.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: girl <br/>
 * @Date: 2019/8/28 13:38 <br/>
 * @Author: yangjiabin
 */
@Service
public class GirlServiceImpl implements GirlService{

    @Autowired
    private GirlRepository girlRepository;




    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertTwo() throws RuntimeException {

            Girl girlA = new Girl();
            girlA.setCupSize("A");
            girlA.setAge(18);
            Girl saveA = girlRepository.save(girlA);

            Girl girlB = new Girl();
            //girlB.setCupSize("B");
            //事务无法回滚是  数据库是MyIsm  InnoDb才行
            girlB.setCupSize("BB");
            girlB.setAge(28);
            Girl saveB = girlRepository.save(girlB);

    }


}
