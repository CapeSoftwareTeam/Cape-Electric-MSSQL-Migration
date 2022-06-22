package com.capeelectric.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeelectric.model.CalculatedRisk;
import com.capeelectric.model.CustomerDetails;
import com.capeelectric.model.Losses;
import com.capeelectric.model.Protection;
import com.capeelectric.model.RiskProtection;
import com.capeelectric.model.StructureAttributes;
import com.capeelectric.model.StructureCharacteristics;
import com.capeelectric.model1.RiskAssessmentDetails;
import com.capeelectric.repository.RiskAssessmentRepository;
import com.capeelectric.repository1.CustomerDetailsRepository;
import com.capeelectric.repository1.StrectureCharecteristicRepository;
import com.capeelectric.service.DataExportService;

@Service
public class DataExportServiceImpl implements DataExportService {

	@Autowired
	private RiskAssessmentRepository riskAssessmentRepository;

	@Autowired
	StrectureCharecteristicRepository strectureCharecteristicRepository;

	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;

	@Override
	public void retrieveAllData() {
// TODO Auto-generated method stub

	}

	@Override
	public void fetchdata() {
		List<RiskAssessmentDetails> data = (List<RiskAssessmentDetails>) riskAssessmentRepository.findAll();

		// single iteration
		RiskAssessmentDetails riskAssessmentDetails = data.get(0);
//
//		riskIter(riskAssessmentDetails);
//
//	}

//		// add all iteration
		// for (RiskAssessmentDetails riskAssessmentDetails : data) {

		riskIter(riskAssessmentDetails);

		// }

	}

	private void riskIter(RiskAssessmentDetails riskAssessmentDetails) {
		if (riskAssessmentDetails != null) {

			CustomerDetails customerDetails = new CustomerDetails();

			customerDetails.setUserName("sivaraju@capeindia.net");

			customerDetails.setEmail("sivaraju@capeindia.net");

			customerDetails.setOrganisationName(riskAssessmentDetails.getCustomerName());

			customerDetails
					.setAddress(riskAssessmentDetails.getDesignation() + riskAssessmentDetails.getContactPerson());

			customerDetails.setProjectName(riskAssessmentDetails.getProjectName());

			customerDetails.setProjectDescription(riskAssessmentDetails.getMobileNo());
			customerDetails.setContactPersonName(riskAssessmentDetails.getTelephoneNo());

			String b = riskAssessmentDetails.getEmail();

			if (b.contains("@") || b.contains("a")) {
				customerDetails.setEmail(b);
				customerDetails.setContactNumber("");
			} else {
				customerDetails.setContactNumber(b);

			}

			customerDetails.setPreparedBy("sd@capeindia.net");

			customerDetails.setVerifiedBy("sd@capeindia.net");

			customerDetails.setCreatedBy("sd@capeindia.net");

			customerDetails.setCreatedDate(LocalDateTime.now());

			customerDetails.setUpdatedDate(LocalDateTime.now());
			customerDetails.setUpdatedBy("sd@capeindia.net");

			customerDetailsRepository.save(customerDetails);

			StructureCharacteristics structor = new StructureCharacteristics();

			structor.setRiskId(customerDetails.getRiskId());

			structor.setLocation(riskAssessmentDetails.getLocation());
			structor.setOtherLocation(riskAssessmentDetails.getoLocation());
			structor.setGroundFlashDensity(riskAssessmentDetails.getGroundFlashDensity());

			if (riskAssessmentDetails.getTypeOfBuilding().contains("Brick")) {
				structor.setTypeOfBuilding("1");

			} else if (riskAssessmentDetails.getTypeOfBuilding().contains("RCC with Brick")) {
				structor.setTypeOfBuilding("0.5");

			} else if (riskAssessmentDetails.getTypeOfBuilding().contains("PEB with sheet")) {
				structor.setTypeOfBuilding("0.2");

			} else if (riskAssessmentDetails.getTypeOfBuilding().contains("System designed by CAPE RCC building")) {
				structor.setTypeOfBuilding("0.20");

			} else if (riskAssessmentDetails.getTypeOfBuilding().contains("System designed by CAPE PEB building")) {
				structor.setTypeOfBuilding("0.001");

			}

			structor.setStructureScreeningEffectiveness(riskAssessmentDetails.getStructureScreeningEffectiveness());
			structor.setInternalScreeningEffectiveness(riskAssessmentDetails.getInternalScreeningEffectiveness());

			structor.setOtherLocation(riskAssessmentDetails.getoLocation());

			structor.setProtectionCollectionArea(riskAssessmentDetails.getCollectionArea());

			structor.setProtectionHeight(riskAssessmentDetails.getProtectionHeight());

			structor.setProtectionLenght(riskAssessmentDetails.getProtectionLength());

			structor.setProtectionWidth(riskAssessmentDetails.getProtectionWidth());

			structor.setProtrusionHeight(riskAssessmentDetails.getHeight());
			structor.setProtrusionLenght(riskAssessmentDetails.getLength());
			structor.setProtrusionWidth(riskAssessmentDetails.getWidth());

			structor.setHeighestRoofProtrusion(riskAssessmentDetails.getHeightOfHighestRoofProtrusion());
			structor.setCollAreaOfAdjacentStruc(riskAssessmentDetails.getCollectionAreaOfAdjacentStructure());
			structor.setCollectionAreaOfStructure(riskAssessmentDetails.getCollectionAreaOfStructure());
			structor.setCollAreaOfStrucWithProtrusion(
					riskAssessmentDetails.getCollectionAreaOfStructureWithProtrusion());

			structor.setCollAreaOfNearStructure(riskAssessmentDetails.getCollectionAreaNearTheStructure());

			if (riskAssessmentDetails.getHeightOfNearByStructure().contains("Lower than surrounding buildings")) {
				structor.setHeightNearByStructure("0.25");

			} else if (riskAssessmentDetails.getHeightOfNearByStructure().contains("Similar in height")) {
				structor.setHeightNearByStructure("0.5");

			} else if (riskAssessmentDetails.getHeightOfNearByStructure().contains("Tall / Isolated structure")) {
				structor.setTypeOfBuilding("0.2");

			}

			structor.setTelephoneServiceLine(riskAssessmentDetails.getTelephoneNo());

			if (riskAssessmentDetails.getEnvironment().contains("Rural")) {
				structor.setEnvironment("1");

			} else if (riskAssessmentDetails.getEnvironment().contains("Suburban")) {
				structor.setEnvironment("0.5");

			} else if (riskAssessmentDetails.getEnvironment().contains("Urban")) {
				structor.setEnvironment("0.1");

			} else if (riskAssessmentDetails.getEnvironment().contains("Urban with tall buildings")) {
				structor.setEnvironment("0.01");

			} else if (riskAssessmentDetails.getEnvironment().contains("Exposed hilltop")) {
				structor.setEnvironment("2");

			}

			structor.setTelephoneServiceLine(riskAssessmentDetails.getNumberOfTelecomlines());

			structor.setNoOfDangerousEventOnStructure(riskAssessmentDetails.getNoOfDangerousEventOnStructure());

			structor.setNoOfDangerousEventNearStructure(riskAssessmentDetails.getNoOfDangerousEventNearTheStructure());

			structor.setProtectionPartOFBuilding(riskAssessmentDetails.getProtectionRequiredForPartOfBuilding());

			structor.setNoOfDangerousEventNearStructure(riskAssessmentDetails.getNoOfDangerousEventNearTheStructure());

			structor.setProtectionLenght(riskAssessmentDetails.getProtectionLength());

			structor.setProtectionHeight(riskAssessmentDetails.getProtectionHeight());

			structor.setProtectionWidth(riskAssessmentDetails.getProtectionWidth());
			structor.setAdjacentBuilding(riskAssessmentDetails.getAdjacentBuilding());
			structor.setAdjacentHeight(riskAssessmentDetails.getAdjacentHeight());
			structor.setAdjacentLength(riskAssessmentDetails.getAdjacentLength());
			structor.setAdjacentWidth(riskAssessmentDetails.getAdjacentWidth());

			structor.setCollAreaOfAdjacentStruc(riskAssessmentDetails.getCollectionAreaOfAdjacentStructure());

			structor.setNoOfDangEventOnAdjacentStruc(
					riskAssessmentDetails.getNoOfDangerousEventOnTheAdjacentStructure());

			structor.setNoOfPeopleInBuilding(riskAssessmentDetails.getNumberOfPeopleInTheBuilding());
			structor.setNoOfPeopleInZone(riskAssessmentDetails.getNumberOfPeopleInTheZone());

			structor.setDayPeoplePresentBuilding(
					riskAssessmentDetails.getNumberOfHoursDayPeopleArePresentInTheBuilding());

			structor.setYearPeoplePresentBuilding(
					riskAssessmentDetails.getNumberOfHoursYearPeopleArePresentInTheBuilding());

			structor.setYearPeoplePresentBuilding(
					riskAssessmentDetails.getNumberOfHoursYearPeopleArePresentInTheBuilding());

			structor.setCreatedBy("");

			structor.setUpdatedBy("MigrationData");
			structor.setUpdatedDate(LocalDateTime.now());
			structor.setCreatedDate(riskAssessmentDetails.getTouchTime().toString());

			List<StructureAttributes> structureAttributes1 = new ArrayList<StructureAttributes>();

			StructureAttributes structureAttributes = new StructureAttributes();

			if (riskAssessmentDetails.getTypeOfFloorSurface().contains("Agricultural, concrete")) {
				structureAttributes.setStTypeOfFloorSurface("0.01");

			} else if (riskAssessmentDetails.getTypeOfFloorSurface().contains("Marble, Ceramic")) {
				structureAttributes.setStTypeOfFloorSurface("0.001");

			} else if (riskAssessmentDetails.getTypeOfFloorSurface().contains("Gravel, moquette, carpets")) {
				structureAttributes.setStTypeOfFloorSurface("0.0001");

			} else if (riskAssessmentDetails.getTypeOfFloorSurface().contains("Asphalt, linoleum, wood")) {
				structureAttributes.setStTypeOfFloorSurface("0.00001");

			}

			structureAttributes.setStructureCharacteristics(structor);

			structureAttributes
					.setEventOnTheTelecomLines(riskAssessmentDetails.getNoOfDangerousEventOnTheTelecomLines());
			if (riskAssessmentDetails.getTypeOfInternalWiring().contains("Unshielded, improper routing")) {
				structureAttributes.setStTypeOfInternalWiring("1");

			} else if (riskAssessmentDetails.getTypeOfInternalWiring()
					.contains("Unshielded, proper routing to avoid large loops")) {
				structureAttributes.setStTypeOfInternalWiring("0.2");

			} else if (riskAssessmentDetails.getTypeOfInternalWiring()
					.contains("Unshielded, proper routing to avoid loops")) {
				structureAttributes.setStTypeOfInternalWiring("0.01");

			}

			else if (riskAssessmentDetails.getTypeOfInternalWiring()
					.contains("Shielded cables running in metal conduits")) {
				structureAttributes.setStTypeOfInternalWiring("0.0001");

			}

			if (riskAssessmentDetails.getAdditionalProtection().contains("No protection measures")) {
				structureAttributes.setStAdditionalProtection("1");

			} else if (riskAssessmentDetails.getTypeOfFloorSurface().contains("Warning notices")) {
				structureAttributes.setStAdditionalProtection("0.1");
			} else if (riskAssessmentDetails.getAdditionalProtection().contains("Electrical Insulation")) {
				structureAttributes.setStAdditionalProtection("0.01");

			} else if (riskAssessmentDetails.getAdditionalProtection()
					.contains("Effective Soil eqiupotentialisation")) {
				structureAttributes.setStAdditionalProtection("0.01");

			} else if (riskAssessmentDetails.getAdditionalProtection().contains("Physical restriction")) {
				structureAttributes.setStAdditionalProtection("0");

			}

			structureAttributes.setStRiskOfFire(riskAssessmentDetails.getRiskOfFire());

			if (riskAssessmentDetails.getFireProtectionMeasures().contains("No provision")) {
				structureAttributes.setStFireProtectionMeasure("1");
			} else if (riskAssessmentDetails.getFireProtectionMeasures().contains("Manual")) {
				structureAttributes.setStFireProtectionMeasure("0.5");
			} else if (riskAssessmentDetails.getFireProtectionMeasures().contains("Automated system")) {
				structureAttributes.setStFireProtectionMeasure("0.2");

			}

			structureAttributes.setTotalNoOfLines(riskAssessmentDetails.getTotalNoOfLines());
			structureAttributes.setNoOfPowerLines(riskAssessmentDetails.getNumberOfPowerLines());

			structureAttributes.setTypeOfPowerLines(riskAssessmentDetails.getTypeOfPowerLines());

			if (riskAssessmentDetails.getTypeOfPowerLines().contains("Overhead")) {
				structureAttributes.setTypeOfPowerLines("1");
			} else if (riskAssessmentDetails.getTypeOfPowerLines().contains("U.G cable from Electricity supplier")) {
				structureAttributes.setTypeOfPowerLines("0.5");
			} else if (riskAssessmentDetails.getTypeOfPowerLines().contains("U.G cable from own transformer")) {
				structureAttributes.setTypeOfPowerLines("0.01");

			}

			structureAttributes.setLengthOfPowerLines(riskAssessmentDetails.getLengthOfPowerLineInMeters());

			if (riskAssessmentDetails.getShieldingGroundingIsolation().contains("TN-C-S system with PME")) {
				structureAttributes.setShieldingGroundingIsolation("1,0.2");
			} else if (riskAssessmentDetails.getShieldingGroundingIsolation()
					.contains("Burried, shield not equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolation("1,0.3");
			} else if (riskAssessmentDetails.getShieldingGroundingIsolation()
					.contains("Overhead, shield not equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolation("1,0.1");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolation()
					.contains("Burried, shield equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolation("1,0");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolation()
					.contains("Overhead, shield equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolation("1,0");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolation()
					.contains("Overhead, unknown bonding at line entrance")) {
				structureAttributes.setShieldingGroundingIsolation("1,1");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolation().contains("No external line")) {
				structureAttributes.setShieldingGroundingIsolation("0,0");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolation()
					.contains("Designed by CAPE(large building with transformer and DG)")) {
				structureAttributes.setShieldingGroundingIsolation("0,0");

			}

			structureAttributes.setCollAreaOfPowerLines(riskAssessmentDetails.getCollectionAreaOfThePowerLines());
			structureAttributes.setCollAreaOfNearLines(riskAssessmentDetails.getCollectionAreaNearTheLines());

			structureAttributes
					.setEventNearThePowerLines(riskAssessmentDetails.getNoOfDangerousEventNearThePowerLines());
			structureAttributes.setEventOnThePowerLines(riskAssessmentDetails.getNoOfDangerousEventOnThePowerLines());

			structureAttributes.setNoOfTelecomLines(riskAssessmentDetails.getNumberOfTelecomlines());

			if (riskAssessmentDetails.getTypeOfTelecomLines().contains("Overhead")) {
				structureAttributes.setTypeOfTelecomLines("1");
			} else if (riskAssessmentDetails.getTypeOfTelecomLines().contains("U.G cable from Telecom supplier")) {
				structureAttributes.setTypeOfTelecomLines("0.5");
			} else if (riskAssessmentDetails.getTypeOfTelecomLines().contains("U.G cable from own tower")) {
				structureAttributes.setTypeOfTelecomLines("0.01");

			}

			structureAttributes.setLengthOfTelecomLines(riskAssessmentDetails.getLengthOfTelecomLineInMeters());

			structureAttributes
					.setShieldingGroundingIsolationL1(riskAssessmentDetails.getShieldingGroundingIsolationTel());

			if (riskAssessmentDetails.getShieldingGroundingIsolationTel().contains("TN-C-S system with PME")) {
				structureAttributes.setShieldingGroundingIsolationL1("1,0.2");
			} else if (riskAssessmentDetails.getShieldingGroundingIsolationTel()
					.contains("Burried, shield not equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolationL1("1,0.3");
			} else if (riskAssessmentDetails.getShieldingGroundingIsolationTel()
					.contains("Overhead, shield not equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolationL1("1,0.1");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolationTel()
					.contains("Burried, shield equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolationL1("1,0");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolationTel()
					.contains("Overhead, shield equipotentially bonded")) {
				structureAttributes.setShieldingGroundingIsolationL1("1,0");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolationTel()
					.contains("Overhead, unknown bonding at line entrance")) {
				structureAttributes.setShieldingGroundingIsolationL1("1,1");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolationTel().contains("No external line")) {
				structureAttributes.setShieldingGroundingIsolationL1("0,0");

			}

			else if (riskAssessmentDetails.getShieldingGroundingIsolationTel()
					.contains("Designed by CAPE(large building with transformer and DG)")) {
				structureAttributes.setShieldingGroundingIsolationL1("0,0");

			}

			structureAttributes.setCollAreaOfTelecomLines(riskAssessmentDetails.getCollectionAreaOfTheTelecomLines());

			structureAttributes.setCollNearOfTelecomLines(riskAssessmentDetails.getCollectionAreaNearTheTelecomLines());

			structureAttributes
					.setEventNearTheTelecomeLines(riskAssessmentDetails.getNoOfDangerousEventNearTheTelecomLines());

			structureAttributes1.add(structureAttributes);

			structor.setStructureAttributes(structureAttributes1);

			List<Losses> losses1 = new ArrayList<Losses>();

			Losses losses = new Losses();
			losses.setStructureCharacteristics(structor);

			if (riskAssessmentDetails.getHazardClassification().contains("Concrete houses")) {
				losses.setHazardClassification("1");
			} else if (riskAssessmentDetails.getHazardClassification()
					.contains("Two floor buildings with less than 100 people")) {
				losses.setHazardClassification("2");
			} else if (riskAssessmentDetails.getHazardClassification()
					.contains("Culturals / sports - 100 to 1000 people")) {
				losses.setHazardClassification("5");

			}

			else if (riskAssessmentDetails.getHazardClassification().contains("Hospitals, Multi-Storey Buildings")) {
				losses.setHazardClassification("5");

			}

			else if (riskAssessmentDetails.getHazardClassification()
					.contains("Culturals / sports - more than 1000 people")) {
				losses.setHazardClassification("10");

			}

			else if (riskAssessmentDetails.getHazardClassification()
					.contains("Multistoried buildings / hotels / industrial / commercial")) {
				losses.setHazardClassification("5");

			} else if (riskAssessmentDetails.getHazardClassification().contains("Risk of explosion")) {
				losses.setHazardClassification("5");

			}

			if (riskAssessmentDetails.getLossDueToPhysicalDamage().contains("Risk of explosion")) {
				losses.setHumanLossOfphysicalDamage("0.1");
			} else if (riskAssessmentDetails.getLossDueToPhysicalDamage()
					.contains("s, hotel, school, civic building")) {
				losses.setHumanLossOfphysicalDamage("0.1");
			} else if (riskAssessmentDetails.getLossDueToPhysicalDamage()
					.contains("Public entertainment, church,museume")) {
				losses.setHumanLossOfphysicalDamage("0.05");

			}

			else if (riskAssessmentDetails.getLossDueToPhysicalDamage().contains("Industrial, commercials")) {
				losses.setHumanLossOfphysicalDamage("0.02");

			}

			else if (riskAssessmentDetails.getLossDueToPhysicalDamage().contains("Others")) {
				losses.setHumanLossOfphysicalDamage("0.01");

			}

			if (riskAssessmentDetails.getLossDueToFailureOfInternalSystem().contains("Risk of explosion")) {
				losses.setHumanLossOffailureOfInternalSystem("0.1");
			} else if (riskAssessmentDetails.getLossDueToFailureOfInternalSystem()
					.contains("Intensive care unit & Operation block of hospital")) {
				losses.setHumanLossOffailureOfInternalSystem("0.01");
			} else if (riskAssessmentDetails.getLossDueToFailureOfInternalSystem()
					.contains("Other part of Buildings")) {
				losses.setHumanLossOffailureOfInternalSystem("0.001");

			}

			losses.setHumanLossOfInjuryOfElectricShock(
					riskAssessmentDetails.getLossDueToInjuryToLivingBeingsByElectricShock());

			losses.setHumanLossOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL1());

			losses.setHumanLossOffailureOfInternalSystemL1(
					riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL1());

			if (riskAssessmentDetails.getLossDueToPhysicalDamageL2().contains("Gas, water, power supply")) {
				losses.setSerToPubPhysicalDamage("0.1");
			} else if (riskAssessmentDetails.getLossDueToPhysicalDamageL2().contains("TV, telecommunication lines")) {
				losses.setSerToPubPhysicalDamage("0.01");
			} else if (riskAssessmentDetails.getLossDueToPhysicalDamageL2().contains("No Service")) {
				losses.setSerToPubPhysicalDamage("0");

			}

			losses.setSerToPubfailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL2());

			losses.setSerToPubPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL21());

			losses.setSerToPubfailureOfInternalSystemL1(riskAssessmentDetails.getLossDueToFailureOfInternalSystems());

			// losses.setCulHerOfPhysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamageL3());
			if (riskAssessmentDetails.getLossDueToPhysicalDamageL3().contains("Museums, galleries")) {
				losses.setCulHerOfPhysicalDamage("0.1");
			} else if (riskAssessmentDetails.getLossDueToPhysicalDamageL3().contains("No Cultural Heritage")) {
				losses.setCulHerOfPhysicalDamage("0");
			}

			losses.setCulHerOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL31());
			// losses.setEcoLossOfPhysicalDamage(riskAssessmentDetails.getLossDuetoPhysicalDamageL4());
			if (riskAssessmentDetails.getLossDuetoPhysicalDamageL4().contains("Risk of explosion")) {
				losses.setEcoLossOfPhysicalDamage("1");
			} else if (riskAssessmentDetails.getLossDuetoPhysicalDamageL4()
					.contains("Hospitals, industrial, museum, agricultural")) {
				losses.setEcoLossOfPhysicalDamage("0.5");
			} else if (riskAssessmentDetails.getLossDuetoPhysicalDamageL4()
					.contains("Hotel, school,office, public entertainment, church, commercial")) {
				losses.setEcoLossOfPhysicalDamage("0.1");

			} else if (riskAssessmentDetails.getLossDuetoPhysicalDamageL4().contains("Others")) {
				losses.setEcoLossOfPhysicalDamage("0.1");

			}

			// losses.setEcoLossOfFailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4());

			if (riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4().contains("Risk of explosion")) {
				losses.setEcoLossOfFailureOfInternalSystem("0.1");
			} else if (riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4()
					.contains("Hospitals, industrial, hotel, office, commercial")) {
				losses.setEcoLossOfFailureOfInternalSystem("0.01");
			} else if (riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4()
					.contains("Museum, agricultural, school, office,public entertainment, church")) {
				losses.setEcoLossOfFailureOfInternalSystem("0.001");

			} else if (riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4().contains("Others")) {
				losses.setEcoLossOfFailureOfInternalSystem("0.0001");

			}

			losses.setEcoLossOfInjuryOfElectricShock(
					riskAssessmentDetails.getLossDueToInjuryToLivingBeingsByElectricShockL4());

			losses.setEcoLossOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL41());

			losses.setEcoLossOfFailureOfInternalSystemL1(
					riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL41());

			// losses.setClassOfLPS(riskAssessmentDetails.getClassfLPS());

			if (riskAssessmentDetails.getClassfLPS().contains("No External LPS")) {
				losses.setClassOfLPS("1");
			} else if (riskAssessmentDetails.getClassfLPS().contains("Class IV LPS")) {
				losses.setClassOfLPS("0.2");
			} else if (riskAssessmentDetails.getClassfLPS().contains("Class III LPS")) {
				losses.setClassOfLPS("0.1");

			} else if (riskAssessmentDetails.getClassfLPS().contains("Class III LPS")) {
				losses.setClassOfLPS("0.05");

			}

			else if (riskAssessmentDetails.getClassfLPS().contains("Class I LPS")) {
				losses.setClassOfLPS("0.02");

			}

			// losses.setClassOfSPD(riskAssessmentDetails.getClassOfSPD());

			if (riskAssessmentDetails.getClassOfSPD().contains("No SPD")) {
				losses.setClassOfSPD("1");
			} else if (riskAssessmentDetails.getClassOfSPD().contains("Protec T1H 300 3+1 R")) {
				losses.setClassOfSPD("0.05");
			} else if (riskAssessmentDetails.getClassOfSPD().contains("Protec T1HS 300 3+1 R")) {
				losses.setClassOfSPD("0.01");

			} else if (riskAssessmentDetails.getClassOfSPD()
					.contains("Protec T1HS 300 3 + 1 R & Protec T2H 300 3 + 1")) {
				losses.setClassOfSPD("0.005");

			}

			losses1.add(losses);

			structor.setLosses(losses1);
			List<CalculatedRisk> cal = new ArrayList<CalculatedRisk>();
			CalculatedRisk calculatedRisk = new CalculatedRisk();

			calculatedRisk.setLossOfHumanLifeRT1("1.00E-05");
			calculatedRisk.setLossOfPublicSerivceRT2("1.00E-03");
			calculatedRisk.setLossOfCulturalHeritageRT3("1.00E-04");
			calculatedRisk.setEconomicLossRT4("1.00E-03");

			calculatedRisk.setRiskProtectionR1(null);
			calculatedRisk.setRiskProtectionR2(null);
			calculatedRisk.setRiskProtectionR3(null);
			calculatedRisk.setRiskProtectionR4(null);

			calculatedRisk.setRiskProtectionRD1(null);
			calculatedRisk.setRiskProtectionRD2(null);
			calculatedRisk.setRiskProtectionRD3(null);
			calculatedRisk.setRiskProtectionRD4(null);

			calculatedRisk.setRiskProtectionRI1(null);
			calculatedRisk.setRiskProtectionRI2(null);
			calculatedRisk.setRiskProtectionRI3(null);
			calculatedRisk.setRiskProtectionRI4(null);

			calculatedRisk.setStructureCharacteristics(structor);

			cal.add(calculatedRisk);

			structor.setCalculatedRisk(cal);

			List<Protection> pro = new ArrayList<>();
			Protection protection = new Protection();
			protection.setProtectionPEB(null);

			protection.setProtectionPMS(null);

			protection.setProtectionPM(null);

			protection.setProtectionPA(null);

			protection.setProtectionPC(null);
			protection.setProtectionPU(null);

			protection.setProtectionPV(null);

			protection.setProtectionPW(null);

			protection.setProtectionPZ(null);
			protection.setRiskProtectionRA1(null);
			protection.setRiskProtectionRB1(null);

			protection.setRiskProtectionRC1(null);

			protection.setRiskProtectionRM1(null);

			protection.setRiskProtectionRU1(null);

			protection.setRiskProtectionRV1(null);

			protection.setRiskProtectionRW1(null);

			protection.setRiskProtectionRZ1(null);

			protection.setRiskProtectionRD1(null);

			protection.setRiskProtectionRI1(null);

			protection.setRiskProtectionR1(null);

			protection.setRiskProtectionRB1(null);

			protection.setCulturalRB(null);

			protection.setCulturalRV(null);

			protection.setStructureCharacteristics(structor);
			pro.add(protection);
			structor.setProtection(pro);

			List<RiskProtection> riskPro = new ArrayList<>();
			RiskProtection riskProtection = new RiskProtection();

			riskProtection.setRiskProtectionRC2(null);
			riskProtection.setRiskProtectionRM2(null);

			riskProtection.setRiskProtectionRV2(null);

			riskProtection.setRiskProtectionRW2(null);

			riskProtection.setRiskProtectionRZ2(null);
			riskProtection.setRiskProtectionRB3(null);

			riskProtection.setRiskProtectionRV3(null);

			riskProtection.setRiskProtectionRA4(null);
			riskProtection.setRiskProtectionRB4(null);

			riskProtection.setRiskProtectionRC4(null);

			riskProtection.setRiskProtectionRM4(null);

			riskProtection.setRiskProtectionRU4(null);
			riskProtection.setRiskProtectionRV4(null);
			riskProtection.setRiskProtectionRW4(null);

			riskProtection.setRiskProtectionRZ4(null);

			riskProtection.setEconamicValueRA(null);

			riskProtection.setEconamicValueRB(null);

			riskProtection.setEconamicValueRC(null);

			riskProtection.setEconamicValueRM(null);

			riskProtection.setEconamicValueRU(null);

			riskProtection.setEconamicValueRV(null);

			riskProtection.setEconamicValueRW(null);

			riskProtection.setEconamicValueRZ(null);
			riskProtection.setStructureCharacteristics(structor);
			riskPro.add(riskProtection);
			structor.setRiskProtection(riskPro);
			strectureCharecteristicRepository.save(structor);

		}
	}

}