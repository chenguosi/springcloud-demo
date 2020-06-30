package bean;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@ToString
public class CommonResponse implements Serializable {

    private static final long serialVersionUID = 1072268578304356888L;

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
