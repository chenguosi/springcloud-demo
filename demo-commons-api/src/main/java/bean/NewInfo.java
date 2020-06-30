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
public class NewInfo extends PageParam implements Serializable {

    private static final long serialVersionUID = 5283009513693547092L;

    // 新闻ID
    private Long id;

    // 新闻标题
    private String title;

    // 新闻内容
    private String mesInfo;

}
