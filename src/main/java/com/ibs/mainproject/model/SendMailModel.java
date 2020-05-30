package com.ibs.mainproject.model;

public class SendMailModel {

	String litmusBatch;
	String templateType;
	String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLitmusBatch() {
		return litmusBatch;
	}

	public void setLitmusBatch(String litmusBatch) {
		this.litmusBatch = litmusBatch;
	}

  public String getTemplateType() {
    return templateType;
  }

  public void setTemplateType(String templateType) {
    this.templateType = templateType;
  }

}