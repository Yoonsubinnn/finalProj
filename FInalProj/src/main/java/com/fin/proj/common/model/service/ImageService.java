package com.fin.proj.common.model.service;

import com.fin.proj.common.model.vo.Image;

public interface ImageService {

	int insertImage(Image image);

	Image findByImageNo(int imageNo);
}
