package com.coolweather.app.model;

/**
 * @author ���� E-mail:
 * @date ����ʱ�䣺2016-4-14 ����10:32:53
 * @version 1.0
 * @parameter
 * @since * @return
 */
public class City {
	private int id;
	private String cityName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	private String cityCode;
	private int provinceId;
}
