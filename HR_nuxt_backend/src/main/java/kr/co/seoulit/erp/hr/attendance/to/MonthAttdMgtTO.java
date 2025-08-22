package kr.co.seoulit.erp.hr.attendance.to;

import kr.co.seoulit.common.to.BaseTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
public class MonthAttdMgtTO extends BaseTO {

	private String empCode;
	private String empName;
	private String applyYearMonth;

	private int basicWorkDays;
	private int weekdayWorkDays;

	private BigDecimal workHour;
	private BigDecimal overWorkHour;
	private BigDecimal nightWorkHour;
	private int holidayWorkDays;
	private int earlyLeaveDays;
	private BigDecimal holidayWorkHour;
	private int lateDays;
	private int absentDays;
	private int halfHolidays;
	private int holidays;

	private String finalizeStatus;
	private String status;
}
