package bean;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@ToString
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = 1072268578304356888L;

    public CommonResponse() {
        this.code = 200;
        this.data = null;
    }

    public CommonResponse(String message, boolean flag, T data) {
        this.data = data;
        this.message = message;
        this.code = flag ? 200 : 500;
    }

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 消息提示
     */
    private String message;

    /**
     * 数据
     */
    private Object data;


}
