package org.dota2school.mlm.common.model;

import org.dota2school.mlm.common.exception.MLMException;

public class ErrorEntry extends Entry{

    public ErrorEntry(Throwable throwable){
        this.setSuccess(false);
        this.setError_code(-1);
        this.setError_message(throwable.getMessage());
    }

    public ErrorEntry(MLMException mlmException){
        this.setSuccess(false);
        this.setError_code(mlmException.getCode());
        this.setError_message(mlmException.getMessage());
    }

    public ErrorEntry(){
        this.setSuccess(false);
    }


}
