package com.domorecode.IReport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excel")
//@Primary //is used when we go for DataType 
public class ExcelReport implements IReport{

	@Override
	public void generateReport() {
 System.out.println("ExcelReport generated");
		
	}

}
