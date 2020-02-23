package com.capgemini.dao;

import java.util.HashMap;

import com.capgemini.dto.GetMaterialsDetailsController;

public class MaterialsDAO {

	private static final Integer SupplierId = null;

	public HashMap<Integer,GetMaterialsDetailsController> storeValue(GetMaterialsDetailsController a) {
		//HashMap<Integer,DDbean>
		GetMaterialsDetailsController dd=new GetMaterialsDetailsController();
	HashMap<Integer,GetMaterialsDetailsController> p=new HashMap<Integer,GetMaterialsDetailsController>();
	p.put(SupplierId,a);
	//p.put(SupplierId,dd);
//System.out.println(OrderBean.getName());
//System.out.println(OrderBean.getPrice_per_unit());
//System.out.println(OrderBean.getQuanityunit());
//System.out.println(OrderBean.getQuantityValue());
System.out.println("Your order is placed sucessfully ");
	
	return null;
	
	
	
	
		
	}
}
