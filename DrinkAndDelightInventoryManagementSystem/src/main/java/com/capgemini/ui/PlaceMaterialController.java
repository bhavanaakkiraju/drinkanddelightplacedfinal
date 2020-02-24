package com.capgemini.ui;

import java.util.Date;

import java.util.Scanner;

import com.capgemini.dto.GetMaterialsDetailsController;
import com.capgemini.service.MaterialService;

public class PlaceMaterialController {

	static String name;
	public static double pricePerUnit;
	static double quantityValue;
	static double quanityUnit;
	double price;
	static String warehouseId;
	static String deliveryDate;
	Date manufacturingDate;
	Date expiryDate;
	String qualityCheck;
	Date processDate;
	static int supplierId;
	enum module1 {Product,Rawmaterial};

	public static void main(String[] args) throws PlaceOrderException {
	
		String module = null;
		
Scanner sc=new Scanner(System.in);
GetMaterialsDetailsController getMaterialsDetailsController=new GetMaterialsDetailsController();


//System.out.println("Place an order");
MaterialService materialService=new  MaterialService();


System.out.println("Place an order");

System.out.println( "1.Raw Material" );
System.out.println("2.Product Stock");
System.out.println("Enter Material : ");

module=sc.nextLine();
//System.out.println("You entered module is  : " );   
try {
	System.out.println("You entered module is  : " ); 
	switch(module1.valueOf(module))
	{


	case Rawmaterial:
		System.out.println("Enter the Raw Material Name");
		name=sc.nextLine();
		getMaterialsDetailsController.setName(name);
	
		
		System.out.println("Enter the Supplier ID");
		supplierId=sc.nextInt();
		getMaterialsDetailsController.setSupplierId(supplierId);
		
		System.out.println("Enter the Warehouse ID");
		warehouseId=sc.next();
		getMaterialsDetailsController.setWarehouseID(warehouseId);
		
		System.out.println("Enter Quantity value and unit");
		quantityValue=sc.nextDouble();
		getMaterialsDetailsController.setQuantityValue(quantityValue);
		 quanityUnit=sc.nextDouble();
		 getMaterialsDetailsController.setQuanityunit(quanityUnit);

		System.out.println("Enter Price per Unit");
		pricePerUnit=sc.nextDouble();
		getMaterialsDetailsController.setPrice_per_unit(pricePerUnit);
		materialService.addData(getMaterialsDetailsController);
			/*
			 * System.out.println("Enter Expected Date of delivery");
			 * deliveryDate=sc.nextLine();
			 */
		//System.out.println(p.getName());
		 break;
	case Product:
		System.out.println("Enter the Product Name");
		name=sc.nextLine();
		getMaterialsDetailsController.setName(name);
		
		System.out.println("Enter the Supplier ID");
		supplierId=sc.nextInt();
		getMaterialsDetailsController.setSupplierId(supplierId);
		
		System.out.println("Enter the Warehouse ID");
		warehouseId=sc.next();
		getMaterialsDetailsController.setWarehouseID(warehouseId);
		
		System.out.println("Enter Quantity value and unit");
		quantityValue=sc.nextDouble();
		getMaterialsDetailsController.setQuantityValue(quantityValue);
		 quanityUnit=sc.nextDouble();
		 getMaterialsDetailsController.setQuanityunit(quanityUnit);
		
		System.out.println("Enter Price per Unit");
		pricePerUnit=sc.nextDouble();
		getMaterialsDetailsController.setPrice_per_unit(pricePerUnit);
		
		materialService.addData(getMaterialsDetailsController);
		break;
		
		

	}
	System.out.println(materialService.addData(getMaterialsDetailsController));
	}
	catch(Exception e) {
		throw new PlaceOrderException("Order not Placed");
		
	
	}
}
}
