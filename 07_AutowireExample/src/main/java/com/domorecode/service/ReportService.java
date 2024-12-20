package com.domorecode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.domorecode.IReport.IReport;
@Service
public class ReportService {
	@Autowired
	@Qualifier("excel")  //qualifier use by name 
private IReport excelReport;

	@Autowired
	@Qualifier("pdf")  //qualifier use by name 
private IReport pdfReport;
	
public void generateByPdf() {
	pdfReport.generateReport();
}
public void generateByExcel() {
	excelReport.generateReport();
}
	

}
