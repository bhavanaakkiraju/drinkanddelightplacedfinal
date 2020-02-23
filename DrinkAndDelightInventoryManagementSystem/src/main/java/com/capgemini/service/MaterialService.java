package com.capgemini.service;

import java.util.HashMap;

import com.capgemini.dao.MaterialsDAO;
import com.capgemini.dto.GetMaterialsDetailsController;

public class MaterialService {
	public  HashMap<Integer,GetMaterialsDetailsController> addData( GetMaterialsDetailsController p) {
		
		//System.out.println(p);
		MaterialsDAO o=new MaterialsDAO();
		o.storeValue(p);
		return null;
		
		
	}
}
