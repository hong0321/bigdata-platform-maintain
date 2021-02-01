package yl.bigdata.doristask.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class RoutineVO extends PageVO {

    @ApiModelProperty(value = "所属环境（示例：测试环境、生产环境）")
    String environment;

    @ApiModelProperty(value = "任务名称（示例：bill_04、...bill_21）")
    String taskName;

    @ApiModelProperty(value = "数据源名称（示例：default_cluster:jms_ods_spmi）")
    String databaseName;

    @ApiModelProperty(value = "表名称（示例：bi_spmi_operation_bill）")
    String tableName;

    @ApiModelProperty(value = "任务创建时间1（示例：2020-01-23 11:07:57）")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    String createTime1;

    @ApiModelProperty(value = "任务创建时间2（示例：2020-01-23 11:07:57）")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    String createTime2;

    @ApiModelProperty(value = "任务状态（示例：完成、进行中、失败）")
    String state;
}
