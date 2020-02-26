package com.liuby.mymark.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

    private int code;

    public Result(int code) {
        this.code = code;
    }

}
