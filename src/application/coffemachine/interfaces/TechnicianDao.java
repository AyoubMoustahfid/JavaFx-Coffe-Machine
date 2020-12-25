package application.coffemachine.interfaces;

import java.util.List;

import application.coffemachine.models.Technician;



public interface TechnicianDao {
	public String AddTechnician(List<Technician> technicians,Technician technician) throws Exception;
    
	
}
