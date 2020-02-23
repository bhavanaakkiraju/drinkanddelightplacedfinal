package com.capgemini.ui;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.capgemini.dto.GetMaterialsDetailsController;

class PlaceMaterialControllerTest {
	HashMap<Integer,GetMaterialsDetailsController> test=new HashMap<Integer,GetMaterialsDetailsController>();
	GetMaterialsDetailsController details=new GetMaterialsDetailsController("Salt",522,"pom223",20,100,15);
	@Test
	public void test() {
		String expectedname="Salt";
		int expectedid=522;
		String expectedwarehouse="pom223";
		double expectedquanity_value=20;
		double expectedunit=100;
		double expectedprice=15;
		assertEquals(expectedname,details.getName());
		assertEquals(expectedid,details.getSupplierId());
		assertEquals(expectedwarehouse,details.getWarehouseID());
		assertEquals(expectedquanity_value,details.getQuantityValue());
		assertEquals(expectedunit,details.getQuanityunit());
		assertEquals(expectedprice,details.getPrice_per_unit());
		
		
	//	fail("Not yet implemented");
	}

}
