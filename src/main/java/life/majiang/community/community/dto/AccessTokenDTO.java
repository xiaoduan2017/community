package life.majiang.community.community.dto;

/**
 * @ClassName AccessTokenDTO
 * @Description TODO
 * @Date 2019/12/5 19:05
 * @Created by 76316
 */


import lombok.Data;

/**
 * Created by codedrinker on 2019/4/24.
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}

