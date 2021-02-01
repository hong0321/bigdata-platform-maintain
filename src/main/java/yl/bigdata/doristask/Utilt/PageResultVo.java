package yl.bigdata.doristask.Utilt;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**

 * @description: 分页结果封装

 */
@Data
@NoArgsConstructor
@ToString
public class PageResultVo<T> {

    /**
     * @Title: 页码
     */
    private Integer current;

    /**
     * @Title: 每页记录数
     */
    private Integer size;

    /**
     * @Title: 总记录数
     */
    private Long total;

    /**
     * @Title: 当前页记录
     */
    private List<T> data;

    /**
     * @param
     * @return PageResultVo
     * @Title: 指定分页构造函数
     */
    public PageResultVo(Integer current,Integer size, Long total, List data) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.data = data;
    }

    /**
     * @param
     * @return PageResultVo
     * @Title: 指定不分页构造函数
     */
    public PageResultVo(List data) {
        this.data = data;
    }
}
