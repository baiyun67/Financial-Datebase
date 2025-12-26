package com.cun.pojo;

import com.cun.enums.FinanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Financial {
    Integer id;
    @NotNull(message = "日期不能为空")
    LocalDate date;
    FinanceType financeType;//收入支出的类型
    @NotNull(message = "金额不能为空")
    Double amount;//金额
    @NotNull(message = "交易对象不能为空")
    String dealName;//交易对象
    String remark;//备注

}
