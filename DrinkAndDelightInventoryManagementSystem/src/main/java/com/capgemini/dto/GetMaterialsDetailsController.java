package com.capgemini.dto;



public class GetMaterialsDetailsController {
	
	private static String name;
	private static double price_per_unit;
	private static double quantityValue;
	private static double quanityunit;
	//private double price;
	private static String warehouseID;
	//private static String deliveryDate;

	//private Date ManufacturingDate;
	//private Date ExpiryDate;
	//private String QualityCheck;
	//private Date processDate;
	private static int SupplierId;

	
	public GetMaterialsDetailsController(String name, int SupplierId, String warehouseID, double quantityValue, double quanityunit, double price_per_unit) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.SupplierId=SupplierId;
		this.warehouseID=warehouseID;
		this.quantityValue=quantityValue;
		this.quanityunit=quanityunit;
		this.price_per_unit=price_per_unit;
	}

	public GetMaterialsDetailsController() {
		// TODO Auto-generated constructor stub
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		GetMaterialsDetailsController.name = name;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		GetMaterialsDetailsController.price_per_unit = price_per_unit;
	}

	public static double getQuantityValue() {
		return quantityValue;
	}

	public static void setQuantityValue(double quantityValue) {
		GetMaterialsDetailsController.quantityValue = quantityValue;
	}

	public static double getQuanityunit() {
		return quanityunit;
	}

	public static void setQuanityunit(double quanityunit) {
		GetMaterialsDetailsController.quanityunit = quanityunit;
	}

	public static String getWarehouseID() {
		return warehouseID;
	}

	public static void setWarehouseID(String warehouseID) {
		GetMaterialsDetailsController.warehouseID = warehouseID;
	}

	public static int getSupplierId() {
		return SupplierId;
	}

	public static void setSupplierId(int supplierId) {
		SupplierId = supplierId;
	}
	

}
