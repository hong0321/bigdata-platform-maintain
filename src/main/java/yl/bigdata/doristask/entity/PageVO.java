package yl.bigdata.doristask.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * @description:
 * @author: donghongLian
 * @create: 2021/1/28 16:51
 * @Copyright ©  云路科技有限公司（深圳）
 */
@Data
public class PageVO implements Serializable {

    Integer start;
    Integer end;

    @ApiModelProperty(value = "页码（示例：1）")
    Integer current;
    @ApiModelProperty(value = "每页条数（示例：20）")
    Integer size;

//页面取数据逻辑
    public void init() {
        start = (current - 1) * size;
        end = current * size ;
        if (start == end) {
            end = start + 1;
        }

    }
}
