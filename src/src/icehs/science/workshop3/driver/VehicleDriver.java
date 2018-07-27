package src.icehs.science.workshop3.driver;

import src.icehs.science.workshop3.controller.VehicleManager;

public class VehicleDriver {	
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> 재고 목록 <<");
	}
}
