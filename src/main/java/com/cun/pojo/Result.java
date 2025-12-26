package com.cun.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;//编码:1,成功；2，失败
    private String msg;//
    private Object data;//数据

    public static Result success(){
        Result result=new Result();
        result.code=1;
        result.msg="success";
        return result;
    }

    public static Result success(Object data){
        Result result=new Result();
        result.code=1;
        result.msg="success";
        result.data=data;
        return result;
    }

    public static Result error(){
        Result result=new Result();
        result.code = 0;
        result.msg="fail";
        return result;
    }
    public static Result error(Object data){
        Result result=new Result();
        result.code=0;
        result.msg="error";
        result.data=data;
        return result;
    }
}
