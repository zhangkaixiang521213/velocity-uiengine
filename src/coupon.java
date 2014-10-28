package com.ariadnethread;

import org.apache.commons.lang.builder.ToStringBuilder;
import core.domain.DomainBase;
import core.mybatis.MyBatisDomain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

@MyBatisDomain
public class CouponRecord extends DomainBase {
	public CouponRecord() {

	}

	/**
	 * 主键
	 */
	private int id;

	/**
	 * 卡券批次表外键
	 */
	private int couponBatchId;

	/**
	 * 数字码
	 * 第一位代表该数字码的属性（数字1，代表会员卡（电子会员卡）；数字2，代表充值卡（充值码）；数字3，代表兑换码（兑换券）；数字4，代表优惠码（
	 * 优惠券）； 第2-5代表该批次生成的年月日日期； 其余为随机数字作为编码的位数；
	 * 为避免用户使用顺序来查找码的使用，所以每个批次的码都为乱序随机生成。
	 */
	private String digitCode;

	/**
	 * 密码
	 */
	private String encryption;

	/**
	 * 状态，值：1为初始、2为激活、3为使用
	 */
	private int status;

	/**
	 * 描述
	 */
	private String note;

	/**
	 * 创建时间
	 */
	private Date createTime;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setCouponBatchId(int couponBatchId) {
		this.couponBatchId = couponBatchId;
	}

	public int getCouponBatchId() {
		return couponBatchId;
	}

	public void setDigitCode(String digitCode) {
		this.digitCode = digitCode;
	}

	public String getDigitCode() {
		return digitCode;
	}

	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}

	public String getEncryption() {
		return encryption;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
