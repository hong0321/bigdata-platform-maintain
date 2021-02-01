package yl.bigdata.doristask.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "dorisBroker对象",description = "dorisBroker任务")
public class DorisBroker {

    @ApiModelProperty(value = "任务ID")
    private String id;

    @ApiModelProperty(value = "任务名称")
    private String task_name;

    @ApiModelProperty(value = "数据库名")
    private String database_name;

    @ApiModelProperty(value = "数据表名")
    private String table_name;

    @ApiModelProperty(value = "任务状态")
    private String state;

    @ApiModelProperty(value = "任务类型")
    private String type;

    @ApiModelProperty(value = "错误信息")
    private String err_info;

    @ApiModelProperty(value = "错误信息地址")
    private String err_url;

    @ApiModelProperty(value = "任务创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    @ApiModelProperty(value = "任务开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date start_time;

    @ApiModelProperty(value = "任务完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finish_time;

}
