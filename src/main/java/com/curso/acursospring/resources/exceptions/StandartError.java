/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.acursospring.resources.exceptions;

import java.io.Serializable;
import javassist.SerialVersionUID;

/**
 *
 * @author RCastro
 */
public class StandartError implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer status;
    private String msg;
    private Long timestamp;

    public StandartError() {
    }

    public StandartError(Integer status, String msg, Long timestamp) {
        this.status = status;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    
    
    
}
