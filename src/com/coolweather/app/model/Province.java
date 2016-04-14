package com.coolweather.app.model;

/**
 * @author 作者 E-mail:
 * @date 创建时间：2016-4-14 上午10:31:38
 * @version 1.0
 * @parameter
 * @since * @return
 */
public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
}
