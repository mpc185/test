package com.example.sunhongbo.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Result {
    public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	private String flag;
    private Object data;

    public void success(Object data){
        this.flag = "success";
        this.data = data;
    }
    public void error(String flag){
        this.flag = flag;
        this.data = null;
    }
}
