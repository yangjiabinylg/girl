package com.unicom.girl;

/**
 * @Copyright CHINA  UNICOM 2019 <br/>
 * @Desc: 业务异常<br/>
 * @ProjectName: park_unicon_api <br/>
 * @Date: 2019/8/7 15:48<br/>
 * @Author: wdz
 */
public class UnionException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UnionException() {
        // Auto-generated constructor stub
    }

    public UnionException(Throwable msg) {
        super(msg);
    }

    public UnionException(String msg) {
        super(msg);
    }

    public UnionException(String msg, Throwable e) {
        super(msg, e);
    }
}