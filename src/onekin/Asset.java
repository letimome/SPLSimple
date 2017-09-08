package onekin;

public class Asset {
	
	String variable;
	
	public Asset(){
		this.variable ="initialized";
	}
	
	public void method1 (){
	//PV:IFCOND (pv:hasFeature('FA') and (not (pv:hasFeature('FB'))))
	System.out.println("FA selected and not Feature B");
	 	//PV:IFCOND(pv:hasFeature('FC'))
		System.out.println("FC selected. Nested");
		// PV:ENDCOND
	// PV:ENDCOND
	System.out.println("in between");

	//PV:IFCOND(pv:hasFeature:('FB'))
	System.out.println("FC selected. Nested");
	//PV:ENDCOND
	
	//PV:IFCOND(pv:hasFeature('FA') and pv:hasFeature('FB'))
	System.out.println("FA & FB is selected.");
	//PV:ENDCOND
		
	//PV:IFCOND(pv:hasFeature('FA') or pv:hasFeature('FC'))
	System.out.println("FA or Fc are selected.");
	//PV:ENDCOND
	}
}
