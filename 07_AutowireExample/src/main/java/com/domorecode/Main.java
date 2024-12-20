package com.domorecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.domorecode.config.AppConfig;
import com.domorecode.service.ReportService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	ReportService rs=	context.getBean(ReportService.class);
	rs.generateByExcel();
	rs.generateByPdf();
	}
}
