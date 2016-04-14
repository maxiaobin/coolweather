package com.coolweather.app.model;

/**
 * @author 作者 E-mail:
 * @date 创建时间：2016-4-14 上午10:32:53
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
