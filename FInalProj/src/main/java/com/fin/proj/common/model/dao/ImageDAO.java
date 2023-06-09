package com.fin.proj.common.model.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fin.proj.common.model.vo.Image;

@Mapper
public interface ImageDAO {

	int insertImage(Image image);

	Image findByImageNo(int imageNo);
}
