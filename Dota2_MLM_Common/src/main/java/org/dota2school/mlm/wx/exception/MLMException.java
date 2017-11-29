package org.dota2school.mlm.wx.exception;

public class MLMException extends RuntimeException {

    private int code;

    public MLMException(Throwable throwable){
        super(throwable);
        code = 0;
    }

    public MLMException(int code){
        this.code = code;
    }

    public MLMException(Throwable throwable,int code){
        super(throwable);
        this.code = code;
    }

    public int getCode(){
        return code;
    }

}
