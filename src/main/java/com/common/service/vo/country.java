package com.common.service.vo;

public class country {
	private Integer id;
	private String code;
	private String value;
	private String dialing_code;
	
	
	public country() {
	}

	public country(Integer id, String code, String value, String dialing_code) {
		super();
		this.id = id;
		this.code = code;
		this.value = value;
		this.dialing_code = dialing_code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDialing_code() {
		return dialing_code;
	}

	public void setDialing_code(String dialing_code) {
		this.dialing_code = dialing_code;
	}

	@Override
	public String toString() {
		return "country [id=" + id + ", code=" + code + ", value=" + value + ", dialing_code=" + dialing_code + "]";
	}
}
