package com.fin.proj.common.model.vo;

public class Image {
	private int imageNo;
	private String imageUrl;
	private String imageName;
	
	public Image() {}

	public Image(int imageNo, String imageUrl, String imageName) {
		super();
		this.imageNo = imageNo;
		this.imageUrl = imageUrl;
		this.imageName = imageName;
	}

	public Image(String imageUrl, String imageName) {
		super();
		this.imageUrl = imageUrl;
		this.imageName = imageName;
	}

	public int getImageNo() {
		return imageNo;
	}

	public void setImageNo(int imageNo) {
		this.imageNo = imageNo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "Image [imageNo=" + imageNo + ", imageUrl=" + imageUrl + ", imageName=" + imageName + "]";
	}
	
	
}
