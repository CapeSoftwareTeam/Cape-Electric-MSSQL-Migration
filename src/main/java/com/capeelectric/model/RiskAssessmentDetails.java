package com.capeelectric.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.RiskAssismentTbl")
public class RiskAssessmentDetails {
	
	@Column(name = "Id")
	private int id;
	
	@Column(name = "RiskId")
	private String riskId;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "OLocation")
	private String oLocation;
	
	@Column(name = "Groundflashdensity")
	private String groundFlashDensity;
	
	@Column(name = "TypeofBuilding")
	private String typeOfBuilding;
	
	@Column(name = "StructureScreeningEffectiveness")
	private String structureScreeningEffectiveness;
	
	@Column(name = "InternalScreeningEffectiveness")
	private String internalScreeningEffectiveness;
	
	@Column(name = "Length")
	private String length;
	
	@Column(name = "Width")
	private String width;
	
	@Column(name = "Height")
	private String height;
	
	@Column(name = "HeightofHighestRoofProtrusion")
	private String heightOfHighestRoofProtrusion;
	
	@Column(name = "CollectionAreaofStructure")
	private String collectionAreaOfStructure;
	
	@Column(name = "CollectionAreaofStructureWithProtrusion")
	private String collectionAreaOfStructureWithProtrusion;
	
	@Column(name = "CollectionAreaNearTheStructure")
	private String collectionAreaNearTheStructure;
	
	@Column(name = "HeightofNearbyStructure")
	private String heightOfNearByStructure;
	
	@Column(name = "ElectricalTelephoneServiceLine")
	private String electricalTelephoneServiceLine;
	
	@Column(name = "Environment")
	private String environment;
	
	@Column(name = "Noofdangerouseventonstructure")
	private String noOfDangerousEventOnStructure;
	
	@Column(name = "Noofdangerouseventnearthestructure")
	private String noOfDangerousEventNearTheStructure;
	
	@Column(name = "Protectionrequiredforpartofbuilding")
	private String protectionRequiredForPartOfBuilding;
	
	@Column(name = "ProtectionLength")
	private String protectionLength;
	
	@Column(name = "ProtectionWidth")
	private String protectionWidth;
	
	@Column(name = "ProtectionHeight")
	private String protectionHeight;
	
	@Column(name = "CollectionArea")
	private String collectionArea;
	
	@Column(name = "AdjacentBuilding")
	private String adjacentBuilding;
	
	@Column(name = "AdjacentLength")
	private String adjacentLength;
	
	@Column(name = "AdjacentWidth")
	private String adjacentWidth;
	
	@Column(name = "AdjacentHeight")
	private String adjacentHeight;
	
	@Column(name = "CollectionAreaOfAdjacentStructure")
	private String collectionAreaOfAdjacentStructure;
	
	@Column(name = "NoofDangerousEventOnTheAdjacentStructure")
	private String noOfDangerousEventOnTheAdjacentStructure;
	
	@Column(name = "NumberOfPeopleInTheBuilding")
	private String numberOfPeopleInTheBuilding;
	
	@Column(name = "NumberofPeopleInTheZone")
	private String numberOfPeopleInTheZone;
	
	@Column(name = "NumberofHoursDayPeopleArePresentInTheBuilding")
	private String numberOfHoursDayPeopleArePresentInTheBuilding;
	
	@Column(name = "Numberofhoursyearpeoplearepresentinthebuilding")
	private String numberOfHoursYearPeopleArePresentInTheBuilding;
	
	@Column(name = "TypeofFloorSurface")
	private String typeOfFloorSurface;
	
	@Column(name = "AdditionalProtection")
	private String additionalProtection;
	
	@Column(name = "RiskofFire")
	private String riskOfFire;
	
	@Column(name = "FireProtectionMeasures")
	private String fireProtectionMeasures;
	
	@Column(name = "TypeofInternalWiring")
	private String typeOfInternalWiring;
	
	@Column(name = "TotalNoofLines")
	private String totalNoOfLines;
	
	@Column(name = "NumberofPowerLines")
	private String numberOfPowerLines;
	
	@Column(name = "TypeofPowerLines")
	private String typeOfPowerLines;
	
	@Column(name = "LengthOfPowerLineInMeters")
	private String lengthOfPowerLineInMeters;
	
	@Column(name = "Shieldinggroundigisolation")
	private String shieldingGroundingIsolation;
	
	@Column(name = "CollectionAreaOfThePowerLines")
	private String collectionAreaOfThePowerLines;
	
	@Column(name = "CollectionAreaNearTheLines")
	private String collectionAreaNearTheLines;
	
	@Column(name = "NoofDangerousEventNearThePowerLines")
	private String noOfDangerousEventNearThePowerLines;
	
	@Column(name = "NoofDangerousEventOnThePowerLines")
	private String noOfDangerousEventOnThePowerLines;
	
	@Column(name = "NumberofTelecomlines")
	private String numberOfTelecomlines;
	
	@Column(name = "TypeofTelecomLines")
	private String typeOfTelecomLines;
	
	@Column(name = "LengthOfTelecomLineInMeters")
	private String lengthOfTelecomLineInMeters;
	
	@Column(name = "ShieldinggroundigisolationTel")
	private String shieldingGroundingIsolationTel;
	
	@Column(name = "CollectionAreaOfTheTelecomLines")
	private String collectionAreaOfTheTelecomLines;
	
	@Column(name = "CollectionAreaNearTheTelecomLines")
	private String collectionAreaNearTheTelecomLines;
	
	@Column(name = "NoofDangerousEventNearTheTelecomLines")
	private String noOfDangerousEventNearTheTelecomLines;
	
	@Column(name = "NoofDangerousEventOnTheTelecomLines")
	private String noOfDangerousEventOnTheTelecomLines;
	
	@Column(name = "HazardClassification")
	private String hazardClassification;
	
	@Column(name = "LossDueToPhysicalDamage")
	private String lossDueToPhysicalDamage;
	
	@Column(name = "LossDueToFailureOfInternalSystems")
	private String lossDueToFailureOfInternalSystems;
	
	@Column(name = "LossDueToInjuryToLivingBeingsByElectricShock")
	private String lossDueToInjuryToLivingBeingsByElectricShock;
	
	@Column(name = "LossDueToPhysicalDamageL1")
	private String lossDueToPhysicalDamageL1;
	
	@Column(name = "LossDueToFailureOfInternalSystemsL1")
	private String lossDueToFailureOfInternalSystemsL1;
	
	@Column(name = "LossDueToPhysicalDamageL2")
	private String lossDueToPhysicalDamageL2;
	
	@Column(name = "LossDueToFailureOfInternalSystem")
	private String lossDueToFailureOfInternalSystem;
	
	@Column(name = "LossDueToPhysicalDamageL21")
	private String lossDueToPhysicalDamageL21;
	
	@Column(name = "LossDueToFailureOfInternalSystemsL2")
	private String lossDueToFailureOfInternalSystemsL2;
	
	@Column(name = "LossDueToPhysicalDamageL3")
	private String lossDueToPhysicalDamageL3;
	
	@Column(name = "LossDueToPhysicalDamageL31")
	private String lossDueToPhysicalDamageL31;
	
	@Column(name = "LossDuetoPhysicalDamageL4")
	private String lossDuetoPhysicalDamageL4;
	
	@Column(name = "LossDueToFailureOfInternalSystemsL4")
	private String lossDueToFailureOfInternalSystemsL4;
	
	@Column(name = "LossDueToInjuryToLivingBeingsByElectricShockL4")
	private String lossDueToInjuryToLivingBeingsByElectricShockL4;
	
	@Column(name = "LossDueToPhysicalDamageL41")
	private String lossDueToPhysicalDamageL41;
	
	@Column(name = "LossDueToFailureOfInternalSystemsL41")
	private String lossDueToFailureOfInternalSystemsL41;
	
	@Column(name = "ClassofLPS")
	private String classfLPS;
	
	@Column(name = "ClassofSPD")
	private String classOfSPD;
	
	@Column(name = "CustomerName")
	private String customerName;
	
	@Column(name = "ContactPerson")
	private String contactPerson;
	
	@Column(name = "Designation")
	private String designation;
	
	@Column(name = "MobileNo")
	private String mobileNo;
	
	@Column(name = "TelephoneNo")
	private String telephoneNo;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "ProjectName")
	private String projectName;
	
	@Column(name = "EngineersName")
	private String engineersName;
	
	@Column(name = "PreparedBy")
	private String preparedBy;
	
	@Column(name = "TouchTime")
	private String touchTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRiskId() {
		return riskId;
	}

	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getoLocation() {
		return oLocation;
	}

	public void setoLocation(String oLocation) {
		this.oLocation = oLocation;
	}

	public String getGroundFlashDensity() {
		return groundFlashDensity;
	}

	public void setGroundFlashDensity(String groundFlashDensity) {
		this.groundFlashDensity = groundFlashDensity;
	}

	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}

	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}

	public String getStructureScreeningEffectiveness() {
		return structureScreeningEffectiveness;
	}

	public void setStructureScreeningEffectiveness(String structureScreeningEffectiveness) {
		this.structureScreeningEffectiveness = structureScreeningEffectiveness;
	}

	public String getInternalScreeningEffectiveness() {
		return internalScreeningEffectiveness;
	}

	public void setInternalScreeningEffectiveness(String internalScreeningEffectiveness) {
		this.internalScreeningEffectiveness = internalScreeningEffectiveness;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHeightOfHighestRoofProtrusion() {
		return heightOfHighestRoofProtrusion;
	}

	public void setHeightOfHighestRoofProtrusion(String heightOfHighestRoofProtrusion) {
		this.heightOfHighestRoofProtrusion = heightOfHighestRoofProtrusion;
	}

	public String getCollectionAreaOfStructure() {
		return collectionAreaOfStructure;
	}

	public void setCollectionAreaOfStructure(String collectionAreaOfStructure) {
		this.collectionAreaOfStructure = collectionAreaOfStructure;
	}

	public String getCollectionAreaOfStructureWithProtrusion() {
		return collectionAreaOfStructureWithProtrusion;
	}

	public void setCollectionAreaOfStructureWithProtrusion(String collectionAreaOfStructureWithProtrusion) {
		this.collectionAreaOfStructureWithProtrusion = collectionAreaOfStructureWithProtrusion;
	}

	public String getCollectionAreaNearTheStructure() {
		return collectionAreaNearTheStructure;
	}

	public void setCollectionAreaNearTheStructure(String collectionAreaNearTheStructure) {
		this.collectionAreaNearTheStructure = collectionAreaNearTheStructure;
	}

	public String getHeightOfNearByStructure() {
		return heightOfNearByStructure;
	}

	public void setHeightOfNearByStructure(String heightOfNearByStructure) {
		this.heightOfNearByStructure = heightOfNearByStructure;
	}

	public String getElectricalTelephoneServiceLine() {
		return electricalTelephoneServiceLine;
	}

	public void setElectricalTelephoneServiceLine(String electricalTelephoneServiceLine) {
		this.electricalTelephoneServiceLine = electricalTelephoneServiceLine;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getNoOfDangerousEventOnStructure() {
		return noOfDangerousEventOnStructure;
	}

	public void setNoOfDangerousEventOnStructure(String noOfDangerousEventOnStructure) {
		this.noOfDangerousEventOnStructure = noOfDangerousEventOnStructure;
	}

	public String getNoOfDangerousEventNearTheStructure() {
		return noOfDangerousEventNearTheStructure;
	}

	public void setNoOfDangerousEventNearTheStructure(String noOfDangerousEventNearTheStructure) {
		this.noOfDangerousEventNearTheStructure = noOfDangerousEventNearTheStructure;
	}

	public String getProtectionRequiredForPartOfBuilding() {
		return protectionRequiredForPartOfBuilding;
	}

	public void setProtectionRequiredForPartOfBuilding(String protectionRequiredForPartOfBuilding) {
		this.protectionRequiredForPartOfBuilding = protectionRequiredForPartOfBuilding;
	}

	public String getProtectionLength() {
		return protectionLength;
	}

	public void setProtectionLength(String protectionLength) {
		this.protectionLength = protectionLength;
	}

	public String getProtectionWidth() {
		return protectionWidth;
	}

	public void setProtectionWidth(String protectionWidth) {
		this.protectionWidth = protectionWidth;
	}

	public String getProtectionHeight() {
		return protectionHeight;
	}

	public void setProtectionHeight(String protectionHeight) {
		this.protectionHeight = protectionHeight;
	}

	public String getCollectionArea() {
		return collectionArea;
	}

	public void setCollectionArea(String collectionArea) {
		this.collectionArea = collectionArea;
	}

	public String getAdjacentBuilding() {
		return adjacentBuilding;
	}

	public void setAdjacentBuilding(String adjacentBuilding) {
		this.adjacentBuilding = adjacentBuilding;
	}

	public String getAdjacentLength() {
		return adjacentLength;
	}

	public void setAdjacentLength(String adjacentLength) {
		this.adjacentLength = adjacentLength;
	}

	public String getAdjacentWidth() {
		return adjacentWidth;
	}

	public void setAdjacentWidth(String adjacentWidth) {
		this.adjacentWidth = adjacentWidth;
	}

	public String getAdjacentHeight() {
		return adjacentHeight;
	}

	public void setAdjacentHeight(String adjacentHeight) {
		this.adjacentHeight = adjacentHeight;
	}

	public String getCollectionAreaOfAdjacentStructure() {
		return collectionAreaOfAdjacentStructure;
	}

	public void setCollectionAreaOfAdjacentStructure(String collectionAreaOfAdjacentStructure) {
		this.collectionAreaOfAdjacentStructure = collectionAreaOfAdjacentStructure;
	}

	public String getNoOfDangerousEventOnTheAdjacentStructure() {
		return noOfDangerousEventOnTheAdjacentStructure;
	}

	public void setNoOfDangerousEventOnTheAdjacentStructure(String noOfDangerousEventOnTheAdjacentStructure) {
		this.noOfDangerousEventOnTheAdjacentStructure = noOfDangerousEventOnTheAdjacentStructure;
	}

	public String getNumberOfPeopleInTheBuilding() {
		return numberOfPeopleInTheBuilding;
	}

	public void setNumberOfPeopleInTheBuilding(String numberOfPeopleInTheBuilding) {
		this.numberOfPeopleInTheBuilding = numberOfPeopleInTheBuilding;
	}

	public String getNumberOfPeopleInTheZone() {
		return numberOfPeopleInTheZone;
	}

	public void setNumberOfPeopleInTheZone(String numberOfPeopleInTheZone) {
		this.numberOfPeopleInTheZone = numberOfPeopleInTheZone;
	}

	public String getNumberOfHoursDayPeopleArePresentInTheBuilding() {
		return numberOfHoursDayPeopleArePresentInTheBuilding;
	}

	public void setNumberOfHoursDayPeopleArePresentInTheBuilding(String numberOfHoursDayPeopleArePresentInTheBuilding) {
		this.numberOfHoursDayPeopleArePresentInTheBuilding = numberOfHoursDayPeopleArePresentInTheBuilding;
	}

	public String getNumberOfHoursYearPeopleArePresentInTheBuilding() {
		return numberOfHoursYearPeopleArePresentInTheBuilding;
	}

	public void setNumberOfHoursYearPeopleArePresentInTheBuilding(String numberOfHoursYearPeopleArePresentInTheBuilding) {
		this.numberOfHoursYearPeopleArePresentInTheBuilding = numberOfHoursYearPeopleArePresentInTheBuilding;
	}

	public String getTypeOfFloorSurface() {
		return typeOfFloorSurface;
	}

	public void setTypeOfFloorSurface(String typeOfFloorSurface) {
		this.typeOfFloorSurface = typeOfFloorSurface;
	}

	public String getAdditionalProtection() {
		return additionalProtection;
	}

	public void setAdditionalProtection(String additionalProtection) {
		this.additionalProtection = additionalProtection;
	}

	public String getRiskOfFire() {
		return riskOfFire;
	}

	public void setRiskOfFire(String riskOfFire) {
		this.riskOfFire = riskOfFire;
	}

	public String getFireProtectionMeasures() {
		return fireProtectionMeasures;
	}

	public void setFireProtectionMeasures(String fireProtectionMeasures) {
		this.fireProtectionMeasures = fireProtectionMeasures;
	}

	public String getTypeOfInternalWiring() {
		return typeOfInternalWiring;
	}

	public void setTypeOfInternalWiring(String typeOfInternalWiring) {
		this.typeOfInternalWiring = typeOfInternalWiring;
	}

	public String getTotalNoOfLines() {
		return totalNoOfLines;
	}

	public void setTotalNoOfLines(String totalNoOfLines) {
		this.totalNoOfLines = totalNoOfLines;
	}

	public String getNumberOfPowerLines() {
		return numberOfPowerLines;
	}

	public void setNumberOfPowerLines(String numberOfPowerLines) {
		this.numberOfPowerLines = numberOfPowerLines;
	}

	public String getTypeOfPowerLines() {
		return typeOfPowerLines;
	}

	public void setTypeOfPowerLines(String typeOfPowerLines) {
		this.typeOfPowerLines = typeOfPowerLines;
	}

	public String getLengthOfPowerLineInMeters() {
		return lengthOfPowerLineInMeters;
	}

	public void setLengthOfPowerLineInMeters(String lengthOfPowerLineInMeters) {
		this.lengthOfPowerLineInMeters = lengthOfPowerLineInMeters;
	}

	public String getShieldingGroundingIsolation() {
		return shieldingGroundingIsolation;
	}

	public void setShieldingGroundingIsolation(String shieldingGroundingIsolation) {
		this.shieldingGroundingIsolation = shieldingGroundingIsolation;
	}

	public String getCollectionAreaOfThePowerLines() {
		return collectionAreaOfThePowerLines;
	}

	public void setCollectionAreaOfThePowerLines(String collectionAreaOfThePowerLines) {
		this.collectionAreaOfThePowerLines = collectionAreaOfThePowerLines;
	}

	public String getCollectionAreaNearTheLines() {
		return collectionAreaNearTheLines;
	}

	public void setCollectionAreaNearTheLines(String collectionAreaNearTheLines) {
		this.collectionAreaNearTheLines = collectionAreaNearTheLines;
	}

	public String getNoOfDangerousEventNearThePowerLines() {
		return noOfDangerousEventNearThePowerLines;
	}

	public void setNoOfDangerousEventNearThePowerLines(String noOfDangerousEventNearThePowerLines) {
		this.noOfDangerousEventNearThePowerLines = noOfDangerousEventNearThePowerLines;
	}

	public String getNoOfDangerousEventOnThePowerLines() {
		return noOfDangerousEventOnThePowerLines;
	}

	public void setNoOfDangerousEventOnThePowerLines(String noOfDangerousEventOnThePowerLines) {
		this.noOfDangerousEventOnThePowerLines = noOfDangerousEventOnThePowerLines;
	}

	public String getNumberOfTelecomlines() {
		return numberOfTelecomlines;
	}

	public void setNumberOfTelecomlines(String numberOfTelecomlines) {
		this.numberOfTelecomlines = numberOfTelecomlines;
	}

	public String getTypeOfTelecomLines() {
		return typeOfTelecomLines;
	}

	public void setTypeOfTelecomLines(String typeOfTelecomLines) {
		this.typeOfTelecomLines = typeOfTelecomLines;
	}

	public String getLengthOfTelecomLineInMeters() {
		return lengthOfTelecomLineInMeters;
	}

	public void setLengthOfTelecomLineInMeters(String lengthOfTelecomLineInMeters) {
		this.lengthOfTelecomLineInMeters = lengthOfTelecomLineInMeters;
	}

	public String getShieldingGroundingIsolationTel() {
		return shieldingGroundingIsolationTel;
	}

	public void setShieldingGroundingIsolationTel(String shieldingGroundingIsolationTel) {
		this.shieldingGroundingIsolationTel = shieldingGroundingIsolationTel;
	}

	public String getCollectionAreaOfTheTelecomLines() {
		return collectionAreaOfTheTelecomLines;
	}

	public void setCollectionAreaOfTheTelecomLines(String collectionAreaOfTheTelecomLines) {
		this.collectionAreaOfTheTelecomLines = collectionAreaOfTheTelecomLines;
	}

	public String getCollectionAreaNearTheTelecomLines() {
		return collectionAreaNearTheTelecomLines;
	}

	public void setCollectionAreaNearTheTelecomLines(String collectionAreaNearTheTelecomLines) {
		this.collectionAreaNearTheTelecomLines = collectionAreaNearTheTelecomLines;
	}

	public String getNoOfDangerousEventNearTheTelecomLines() {
		return noOfDangerousEventNearTheTelecomLines;
	}

	public void setNoOfDangerousEventNearTheTelecomLines(String noOfDangerousEventNearTheTelecomLines) {
		this.noOfDangerousEventNearTheTelecomLines = noOfDangerousEventNearTheTelecomLines;
	}

	public String getNoOfDangerousEventOnTheTelecomLines() {
		return noOfDangerousEventOnTheTelecomLines;
	}

	public void setNoOfDangerousEventOnTheTelecomLines(String noOfDangerousEventOnTheTelecomLines) {
		this.noOfDangerousEventOnTheTelecomLines = noOfDangerousEventOnTheTelecomLines;
	}

	public String getHazardClassification() {
		return hazardClassification;
	}

	public void setHazardClassification(String hazardClassification) {
		this.hazardClassification = hazardClassification;
	}

	public String getLossDueToPhysicalDamage() {
		return lossDueToPhysicalDamage;
	}

	public void setLossDueToPhysicalDamage(String lossDueToPhysicalDamage) {
		this.lossDueToPhysicalDamage = lossDueToPhysicalDamage;
	}

	public String getLossDueToFailureOfInternalSystems() {
		return lossDueToFailureOfInternalSystems;
	}

	public void setLossDueToFailureOfInternalSystems(String lossDueToFailureOfInternalSystems) {
		this.lossDueToFailureOfInternalSystems = lossDueToFailureOfInternalSystems;
	}

	public String getLossDueToInjuryToLivingBeingsByElectricShock() {
		return lossDueToInjuryToLivingBeingsByElectricShock;
	}

	public void setLossDueToInjuryToLivingBeingsByElectricShock(String lossDueToInjuryToLivingBeingsByElectricShock) {
		this.lossDueToInjuryToLivingBeingsByElectricShock = lossDueToInjuryToLivingBeingsByElectricShock;
	}

	public String getLossDueToPhysicalDamageL1() {
		return lossDueToPhysicalDamageL1;
	}

	public void setLossDueToPhysicalDamageL1(String lossDueToPhysicalDamageL1) {
		this.lossDueToPhysicalDamageL1 = lossDueToPhysicalDamageL1;
	}

	public String getLossDueToFailureOfInternalSystemsL1() {
		return lossDueToFailureOfInternalSystemsL1;
	}

	public void setLossDueToFailureOfInternalSystemsL1(String lossDueToFailureOfInternalSystemsL1) {
		this.lossDueToFailureOfInternalSystemsL1 = lossDueToFailureOfInternalSystemsL1;
	}

	public String getLossDueToPhysicalDamageL2() {
		return lossDueToPhysicalDamageL2;
	}

	public void setLossDueToPhysicalDamageL2(String lossDueToPhysicalDamageL2) {
		this.lossDueToPhysicalDamageL2 = lossDueToPhysicalDamageL2;
	}

	public String getLossDueToFailureOfInternalSystem() {
		return lossDueToFailureOfInternalSystem;
	}

	public void setLossDueToFailureOfInternalSystem(String lossDueToFailureOfInternalSystem) {
		this.lossDueToFailureOfInternalSystem = lossDueToFailureOfInternalSystem;
	}

	public String getLossDueToPhysicalDamageL21() {
		return lossDueToPhysicalDamageL21;
	}

	public void setLossDueToPhysicalDamageL21(String lossDueToPhysicalDamageL21) {
		this.lossDueToPhysicalDamageL21 = lossDueToPhysicalDamageL21;
	}

	public String getLossDueToFailureOfInternalSystemsL2() {
		return lossDueToFailureOfInternalSystemsL2;
	}

	public void setLossDueToFailureOfInternalSystemsL2(String lossDueToFailureOfInternalSystemsL2) {
		this.lossDueToFailureOfInternalSystemsL2 = lossDueToFailureOfInternalSystemsL2;
	}

	public String getLossDueToPhysicalDamageL3() {
		return lossDueToPhysicalDamageL3;
	}

	public void setLossDueToPhysicalDamageL3(String lossDueToPhysicalDamageL3) {
		this.lossDueToPhysicalDamageL3 = lossDueToPhysicalDamageL3;
	}

	public String getLossDueToPhysicalDamageL31() {
		return lossDueToPhysicalDamageL31;
	}

	public void setLossDueToPhysicalDamageL31(String lossDueToPhysicalDamageL31) {
		this.lossDueToPhysicalDamageL31 = lossDueToPhysicalDamageL31;
	}

	public String getLossDuetoPhysicalDamageL4() {
		return lossDuetoPhysicalDamageL4;
	}

	public void setLossDuetoPhysicalDamageL4(String lossDuetoPhysicalDamageL4) {
		this.lossDuetoPhysicalDamageL4 = lossDuetoPhysicalDamageL4;
	}

	public String getLossDueToFailureOfInternalSystemsL4() {
		return lossDueToFailureOfInternalSystemsL4;
	}

	public void setLossDueToFailureOfInternalSystemsL4(String lossDueToFailureOfInternalSystemsL4) {
		this.lossDueToFailureOfInternalSystemsL4 = lossDueToFailureOfInternalSystemsL4;
	}

	public String getLossDueToInjuryToLivingBeingsByElectricShockL4() {
		return lossDueToInjuryToLivingBeingsByElectricShockL4;
	}

	public void setLossDueToInjuryToLivingBeingsByElectricShockL4(String lossDueToInjuryToLivingBeingsByElectricShockL4) {
		this.lossDueToInjuryToLivingBeingsByElectricShockL4 = lossDueToInjuryToLivingBeingsByElectricShockL4;
	}

	public String getLossDueToPhysicalDamageL41() {
		return lossDueToPhysicalDamageL41;
	}

	public void setLossDueToPhysicalDamageL41(String lossDueToPhysicalDamageL41) {
		this.lossDueToPhysicalDamageL41 = lossDueToPhysicalDamageL41;
	}

	public String getLossDueToFailureOfInternalSystemsL41() {
		return lossDueToFailureOfInternalSystemsL41;
	}

	public void setLossDueToFailureOfInternalSystemsL41(String lossDueToFailureOfInternalSystemsL41) {
		this.lossDueToFailureOfInternalSystemsL41 = lossDueToFailureOfInternalSystemsL41;
	}

	public String getClassfLPS() {
		return classfLPS;
	}

	public void setClassfLPS(String classfLPS) {
		this.classfLPS = classfLPS;
	}

	public String getClassOfSPD() {
		return classOfSPD;
	}

	public void setClassOfSPD(String classOfSPD) {
		this.classOfSPD = classOfSPD;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEngineersName() {
		return engineersName;
	}

	public void setEngineersName(String engineersName) {
		this.engineersName = engineersName;
	}

	public String getPreparedBy() {
		return preparedBy;
	}

	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}

	public String getTouchTime() {
		return touchTime;
	}

	public void setTouchTime(String touchTime) {
		this.touchTime = touchTime;
	}
	
}
	
	
