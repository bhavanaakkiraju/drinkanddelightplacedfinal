package com.capgemini.service;

import java.util.HashMap;

import com.capgemini.dao.MaterialsDAO;
import com.capgemini.dto.GetMaterialsDetailsController;

public class MaterialService {
	public  String addData( GetMaterialsDetailsController p) {
		
		//System.out.println(p);
		MaterialsDAO materialsDAO=new MaterialsDAO();
		materialsDAO.storeValue(p);
		return materialsDAO.storeValue(p);
		
		
	}
}
