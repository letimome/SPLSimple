package onekin;

public class Asset {
	
	String variable;
	
	public Asset(){
		this.variable ="initialized";
	}
	
	public void method1 (){
	//PV:IFCOND (pv:hasFeature('FA') and (not (pv:hasFeature('FB'))))
	System.out.println("FA is selected and  Feature B is not");
	 	//PV:IFCOND(pv:hasFeature('FC'))
		System.out.println("FC is selected. It is Nested");
		// PV:ENDCOND
	// PV:ENDCOND
	System.out.println("This does not belong to any feature");

	//PV:IFCOND(pv:hasFeature:('FB'))
	System.out.println("FB is selected");
	//PV:ENDCOND
	
	//PV:IFCOND(pv:hasFeature('FA') and pv:hasFeature('FB'))
	System.out.println("Both FA and FB are selected.");
	//PV:ENDCOND
		
	//PV:IFCOND(pv:hasFeature('FA') or pv:hasFeature('FC'))
	System.out.println("Either FA or Fc is selected.");
	//PV:ENDCOND
	}
}
