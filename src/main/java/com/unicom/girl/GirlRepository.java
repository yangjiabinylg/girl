package com.unicom.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: girl <br/>
 * @Date: 2019/8/28 9:30 <br/>
 * @Author: yangjiabin
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {


    //通过年龄来查询
    public List<Girl> findByAge(Integer age);

}
