package com.fin.proj.common.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fin.proj.common.model.dao.ImageDAO;
import com.fin.proj.common.model.vo.Image;

@Service
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	private ImageDAO iDAO;

	@Override
	public int insertImage(Image image) {
		return iDAO.insertImage(image);
	}

	@Override
	public Image findByImageNo(int imageNo) {
		return iDAO.findByImageNo(imageNo);
	}

}
