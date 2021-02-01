package yl.bigdata.doristask.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigInteger;
import java.util.Date;

@Data
@ApiModel
public class DorisLoadTask {

    @ApiModelProperty(value = "任务创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creat_time;

    @ApiModelProperty(value = "任务状态",example = "1")
    private int statues;

    @ApiModelProperty(value = "任务信息")
    private String loadinfo;

    @ApiModelProperty(value = "任务编号")
    private String label;

    @ApiModelProperty(value = "任务开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_time;

    @ApiModelProperty(value = "任务结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_time;

    @ApiModelProperty(value = "任务结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date finish_time;

    @ApiModelProperty(value = "任务超时时间")
    private BigInteger time_out;

}
