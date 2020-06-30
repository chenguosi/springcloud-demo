package bean;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
public class PageInfo implements Serializable {

    private static final long serialVersionUID = 2233826980261070311L;

    private Integer pageNum;

    private Integer pageSize;
}
