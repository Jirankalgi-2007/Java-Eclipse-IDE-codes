package com.Rahul.example;

public class Lorry {

	private String lorry_name;
	private String vehicle_number;
	private double weight_of_goods_in_tons;
	
	
	public Lorry(String lorry_name,String vehicle_number,double weight_of_goods_in_tons) {
		this.lorry_name=lorry_name;
		this.vehicle_number=vehicle_number;
		this.weight_of_goods_in_tons=weight_of_goods_in_tons;
	}
	
	public String toString()
	{
		return String.format("%10s %10s %10.2f",this.lorry_name,this.vehicle_number,this.weight_of_goods_in_tons);
	}
	
    public String getLorryName() {
        return this.lorry_name;
    }

    public String getVehicleNumber() {
        return this.vehicle_number;
    }

	
	

}
