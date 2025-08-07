package com.Rahul.example;

public class Contracts {

	protected int contract_id;
	protected String contract_person_name;
	protected Labor labor_obj;
	protected Lorry lorry_obj;
	
	public Contracts(int contract_id,String contract_person_name, Labor labor_obj,Lorry lorry_obj) {
		this.contract_id=contract_id;
		this.contract_person_name=contract_person_name;
		this.labor_obj= labor_obj;
		this.lorry_obj= lorry_obj;
	}
	
	public Contracts() {
        this.contract_id = 0;
        this.contract_person_name = "0";
        this.labor_obj = new Labor();
        this.lorry_obj = new Lorry("#unkwon_lorry", "0", 0);
    }


	public String toString()
	{
		return String.format("%10d %10s %10s %10s", contract_id, contract_person_name,labor_obj.getLaborName(), lorry_obj.getLorryName() + " " + lorry_obj.getVehicleNumber());
	}
	

}
