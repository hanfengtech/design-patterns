package tech.hanfeng.dp.creational.client;

import tech.hanfeng.dp.creational.prototype.MachineImage;

public class PrototypeClient {

	/*
	 * @output
	 * 
	 * Web Server Configuration: Linux + Symantec + Web Server S/W
	 * App Server Configuration: Linux + Symantec + Web Server S/W + App Server S/W
	 * DB Server Configuration: Linux + Symantec + Database Server S/W
	 * Test Server Configuration: Windows + MaAfee
	 * 
	 */
	public static void main(String[] args) 
		throws CloneNotSupportedException {
		
		/* Create base Machine Images */
		MachineImage linuxVM = new MachineImage("Linux", "Symantec");
	    MachineImage windowsVM = new MachineImage("Windows", "MaAfee");
	    
	    /* Clone Linux VM and Install Web Server */
	    MachineImage webServer = linuxVM.clone();
	    webServer.install(" + Web Server S/W");
	    
	    /* Create a copy of the Web Server and install Application server on top of it */
	    MachineImage webAppServer = webServer.clone();
	    webAppServer.install(" + App Server S/W");
	    
	    /* Clone Linux VM and Install DB Server */
	    MachineImage dbServer = linuxVM.clone();
	    dbServer.install(" + Database Server S/W");
	    
	    /* Create a test machine from Windows Image */
	    MachineImage testMachine = windowsVM.clone();
	    
	    System.out.print("Web Server Configuration: ");
	    webServer.printSW();
	    System.out.print("App Server Configuration: ");
	    webAppServer.printSW();
	    System.out.print("DB Server Configuration: ");
	    dbServer.printSW();
	    System.out.print("Test Server Configuration: ");
	    testMachine.printSW();
	}
}
