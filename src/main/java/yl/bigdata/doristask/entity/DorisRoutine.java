package yl.bigdata.doristask.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

@Data
@ApiModel(value = "DorisRoutine对象",description = "dorisRoutine任务")
public class DorisRoutine {

    @ApiModelProperty(value = "任务ID")
    private String id;

    @ApiModelProperty(value = "任务名称")
    private String task_name;

    @ApiModelProperty(value = "任务创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;

    @ApiModelProperty(value = "数据库名")
    private String database_name;

    @ApiModelProperty(value = "数据表名")
    private String table_name;

    @ApiModelProperty(value = "任务状态")
    private String state;

    @ApiModelProperty(value = "任务类型")
    private String type;

    @ApiModelProperty(value = "当前任务数")
    private int task_number;

    @ApiModelProperty(value = "任务配置")
    private String task_config;

    @ApiModelProperty(value = "数据源配置")
    private String database_config;

    @ApiModelProperty(value = "消费者配置")
    private String consumer_config;

    @ApiModelProperty(value = "任务统计")
    private int tasks_number;

    @ApiModelProperty(value = "任务进程")
    private String task_process;

    @ApiModelProperty(value = "状态变更原因")
    private String state_change;

    @ApiModelProperty(value = "错误数据连接")
    private String err_url;

    @ApiModelProperty(value = "其他信息")
    private String other_info;

}
