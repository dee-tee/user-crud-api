package com.user.example.usercrudapi.dto;

public class ResponseDTO {
    MetaDTO meta;
    Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(MetaDTO meta, Object data) {
        this.meta = meta;
        this.data = data;
    }

    public MetaDTO getMeta() {
        return meta;
    }

    public void setMeta(MetaDTO meta) {
        this.meta = meta;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
