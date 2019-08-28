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

//        try {
            Girl girlA = new Girl();
            girlA.setCupSize("A");
            girlA.setAge(18);
            Girl saveA = girlRepository.save(girlA);
            if(saveA == null){
                throw new RuntimeException();
            }

            Girl girlB = new Girl();
            girlB.setCupSize("BBBBB");
            girlB.setAge(28);
            Girl saveB = girlRepository.save(girlB);
            if(saveB == null){
                throw new RuntimeException();
            }
//        } catch (Exception e) {
//            e.printStackTrace();
            //TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();

//            想启用本类的普通方法的事务，通过接口来调用该方法即可生效。
//            如果先在方法内部catch异常，需要添加
//            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//            否则可以在外面捕获这个异常。下面是在方法内部捕获异常的示例
//        }


    }


}
