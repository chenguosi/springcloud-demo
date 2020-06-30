package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -4794632262440907988L;
    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String pwd;
}
