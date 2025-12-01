package com.cun.pojo;

import com.cun.enums.FinanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Financial {
    Integer id;
    LocalDate date;
    FinanceType financeType;//收入支出的类型
    Double amount;//金额
    String dealName;//交易对象
    String remark;//备注

}
