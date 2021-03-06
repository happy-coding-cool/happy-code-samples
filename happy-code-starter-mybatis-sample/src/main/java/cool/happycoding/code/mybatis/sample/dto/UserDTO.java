package cool.happycoding.code.mybatis.sample.dto;

import cool.happycoding.code.mybatis.base.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

/**
 * description
 *
 * @author lanlanhappy 2021/02/26 2:39 下午
 */
@Data
public class UserDTO extends BaseDTO {

    private String name;
    private Integer age;
    private String gender;
    private String addr;
    private BigDecimal salary;
    private String remark;
    private Integer version;
}
