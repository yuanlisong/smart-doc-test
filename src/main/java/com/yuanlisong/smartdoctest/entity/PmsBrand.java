package com.yuanlisong.smartdoctest.entity;

import java.io.Serializable;

/**
 * PmsBrand   
 * @ClassName PmsBrand
 * @Description TODO
 * @author YuanLiSong 2021/11/2 9:38
 * @Copyright: YuanLiSong
 */
public class PmsBrand implements Serializable {
	/**
	 * ID
	 */
	private Long id;

	/**
	 * 名称
	 * @required
	 */
	private String name;

	/**
	 * 首字母
	 * @since 1.0
	 */
	private String firstLetter;

	/**
	 * 排序
	 */
	private Integer sort;

	/**
	 * 是否为品牌制造商(0,1)
	 */
	private Integer factoryStatus;

	/**
	 * 显示状态(0,1)
	 * @ignore
	 */
	private Integer showStatus;

	/**
	 * 产品数量
	 */
	private Integer productCount;

	/**
	 * 产品评论数量
	 */
	private Integer productCommentCount;

	/**
	 * 品牌logo
	 */
	private String logo;

	/**
	 * 专区大图
	 */
	private String bigPic;

	/**
	 * 品牌故事
	 */
	private String brandStory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(String firstLetter) {
		this.firstLetter = firstLetter;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getFactoryStatus() {
		return factoryStatus;
	}

	public void setFactoryStatus(Integer factoryStatus) {
		this.factoryStatus = factoryStatus;
	}

	public Integer getShowStatus() {
		return showStatus;
	}

	public void setShowStatus(Integer showStatus) {
		this.showStatus = showStatus;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public Integer getProductCommentCount() {
		return productCommentCount;
	}

	public void setProductCommentCount(Integer productCommentCount) {
		this.productCommentCount = productCommentCount;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getBigPic() {
		return bigPic;
	}

	public void setBigPic(String bigPic) {
		this.bigPic = bigPic;
	}

	public String getBrandStory() {
		return brandStory;
	}

	public void setBrandStory(String brandStory) {
		this.brandStory = brandStory;
	}

	@Override
	public String toString() {
		return "PmsBrand{" +
				"id=" + id +
				", name='" + name + '\'' +
				", firstLetter='" + firstLetter + '\'' +
				", sort=" + sort +
				", factoryStatus=" + factoryStatus +
				", showStatus=" + showStatus +
				", productCount=" + productCount +
				", productCommentCount=" + productCommentCount +
				", logo='" + logo + '\'' +
				", bigPic='" + bigPic + '\'' +
				", brandStory='" + brandStory + '\'' +
				'}';
	}
}
