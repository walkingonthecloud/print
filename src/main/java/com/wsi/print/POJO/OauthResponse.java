package com.wsi.print.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class OauthResponse implements Serializable {

    private String access_token;

}
