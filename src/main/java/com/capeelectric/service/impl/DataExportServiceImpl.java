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

			customerDetails.setUserName("sd@capeindia.net");

			customerDetails.setEmail("sd@capeindia.net");
			customerDetails.setStatus("Active");
			
		
			customerDetails.setOrganisationName(riskAssessmentDetails.getCustomerName());

			customerDetails
					.setAddress(riskAssessmentDetails.getContactPerson());

			customerDetails.setProjectName(riskAssessmentDetails.getDesignation());

			customerDetails.setProjectDescription(riskAssessmentDetails.getMobileNo());
			customerDetails.setContactPersonName(riskAssessmentDetails.getTelephoneNo());

			String b = riskAssessmentDetails.getEmail();

			if (b.contains("@") || b.contains("a")) {
				customerDetails.setEmail(b);
				customerDetails.setContactNumber("");
			} else {
				customerDetails.setContactNumber(b);

			}

			customerDetails.setPreparedBy(riskAssessmentDetails.getProjectName());

			customerDetails.setVerifiedBy(riskAssessmentDetails.getEngineersName());

			customerDetails.setCreatedBy("Migrated Data");

			customerDetails.setCreatedDate(LocalDateTime.now());

			customerDetails.setUpdatedDate(LocalDateTime.now());
			customerDetails.setUpdatedBy("Migrated Data");

			customerDetailsRepository.save(customerDetails);

			StructureCharacteristics structor = new StructureCharacteristics();

			structor.setRiskId(customerDetails.getRiskId());

			structor.setLocation(riskAssessmentDetails.getLocation());
			structor.setOtherLocation(riskAssessmentDetails.getoLocation());
			structor.setGroundFlashDensity(riskAssessmentDetails.getGroundFlashDensity());
			structor.setTypeOfBuilding(riskAssessmentDetails.getTypeOfBuilding());


			structor.setStructureScreeningEffectiveness(riskAssessmentDetails.getStructureScreeningEffectiveness());
			structor.setInternalScreeningEffectiveness(riskAssessmentDetails.getInternalScreeningEffectiveness());

			structor.setOtherLocation(riskAssessmentDetails.getoLocation());

			structor.setProtectionCollectionArea(riskAssessmentDetails.getCollectionArea());

			structor.setProtectionHeight(riskAssessmentDetails.getProtectionHeight());

			//structor.setProtectionLenght(riskAssessmentDetails.getProtectionLength());

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

				structor.setHeightNearByStructure(riskAssessmentDetails.getHeightOfNearByStructure());


			structor.setTelephoneServiceLine(riskAssessmentDetails.getElectricalTelephoneServiceLine());

			structor.setEnvironment(riskAssessmentDetails.getEnvironment());


			//structor.setTelephoneServiceLine(riskAssessmentDetails.getNumberOfTelecomlines());

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
			structor.setUserName("sd@capeindia.net");
			structor.setCreatedBy("Migrated Data");

			structor.setUpdatedBy("Migration Data");
			structor.setUpdatedDate(LocalDateTime.now());
			structor.setProjectName(riskAssessmentDetails.getProjectName());
			structor.setCreatedDate(riskAssessmentDetails.getTouchTime().toString());

			List<StructureAttributes> structureAttributes1 = new ArrayList<StructureAttributes>();

			StructureAttributes structureAttributes = new StructureAttributes();

			structureAttributes.setStTypeOfFloorSurface(riskAssessmentDetails.getTypeOfFloorSurface());


			structureAttributes.setStructureCharacteristics(structor);

			structureAttributes
					.setEventOnTheTelecomLines(riskAssessmentDetails.getNoOfDangerousEventOnTheTelecomLines());
			structureAttributes.setStTypeOfInternalWiring(riskAssessmentDetails.getTypeOfInternalWiring());

			structureAttributes.setStAdditionalProtection(riskAssessmentDetails.getAdditionalProtection());


			structureAttributes.setStRiskOfFire(riskAssessmentDetails.getRiskOfFire());

			structureAttributes.setStFireProtectionMeasure(riskAssessmentDetails.getFireProtectionMeasures());

			structureAttributes.setTotalNoOfLines(riskAssessmentDetails.getTotalNoOfLines());
			structureAttributes.setNoOfPowerLines(riskAssessmentDetails.getNumberOfPowerLines());

			structureAttributes.setTypeOfPowerLines(riskAssessmentDetails.getTypeOfPowerLines().trim());

			structureAttributes.setLengthOfPowerLines(riskAssessmentDetails.getLengthOfPowerLineInMeters());

			structureAttributes.setShieldingGroundingIsolation(riskAssessmentDetails.getShieldingGroundingIsolation());



			structureAttributes.setCollAreaOfPowerLines(riskAssessmentDetails.getCollectionAreaOfThePowerLines());
			structureAttributes.setCollAreaOfNearLines(riskAssessmentDetails.getCollectionAreaNearTheLines());

			structureAttributes
					.setEventNearThePowerLines(riskAssessmentDetails.getNoOfDangerousEventNearThePowerLines());
			structureAttributes.setEventOnThePowerLines(riskAssessmentDetails.getNoOfDangerousEventOnThePowerLines());

			structureAttributes.setNoOfTelecomLines(riskAssessmentDetails.getNumberOfTelecomlines());

			structureAttributes.setTypeOfTelecomLines(riskAssessmentDetails.getTypeOfTelecomLines());

			structureAttributes.setLengthOfTelecomLines(riskAssessmentDetails.getLengthOfTelecomLineInMeters());

			structureAttributes
					.setShieldingGroundingIsolationL1(riskAssessmentDetails.getShieldingGroundingIsolationTel());

			structureAttributes.setShieldingGroundingIsolationL1(riskAssessmentDetails.getShieldingGroundingIsolationTel());


			structureAttributes.setCollAreaOfTelecomLines(riskAssessmentDetails.getCollectionAreaOfTheTelecomLines());

			structureAttributes.setCollNearOfTelecomLines(riskAssessmentDetails.getCollectionAreaNearTheTelecomLines());

			structureAttributes
					.setEventNearTheTelecomeLines(riskAssessmentDetails.getNoOfDangerousEventNearTheTelecomLines());

			structureAttributes1.add(structureAttributes);

			structor.setStructureAttributes(structureAttributes1);

			List<Losses> losses1 = new ArrayList<Losses>();

			Losses losses = new Losses();
			losses.setStructureCharacteristics(structor);

			losses.setHazardClassification(riskAssessmentDetails.getHazardClassification());

			losses.setHumanLossOfphysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamage());

			losses.setHumanLossOffailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystems());

			losses.setHumanLossOfInjuryOfElectricShock(
					riskAssessmentDetails.getLossDueToInjuryToLivingBeingsByElectricShock());

			losses.setHumanLossOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL1());

			losses.setHumanLossOffailureOfInternalSystemL1(
					riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL1());

			losses.setSerToPubPhysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamageL2());

			losses.setSerToPubfailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystem());

			losses.setSerToPubPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL21());

			losses.setSerToPubfailureOfInternalSystemL1(riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL2());

			// losses.setCulHerOfPhysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamageL3());
			losses.setCulHerOfPhysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamageL3());

			losses.setCulHerOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL31());
			// losses.setEcoLossOfPhysicalDamage(riskAssessmentDetails.getLossDuetoPhysicalDamageL4());
			losses.setEcoLossOfPhysicalDamage(riskAssessmentDetails.getLossDuetoPhysicalDamageL4());

			losses.setEcoLossOfFailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4());


			losses.setEcoLossOfInjuryOfElectricShock(
					riskAssessmentDetails.getLossDueToInjuryToLivingBeingsByElectricShockL4());

			losses.setEcoLossOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL41());

			losses.setEcoLossOfFailureOfInternalSystemL1(
					riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL41());

			 losses.setClassOfLPS(riskAssessmentDetails.getClassfLPS());



			losses.setClassOfSPD(riskAssessmentDetails.getClassOfSPD().trim());


			losses1.add(losses);

			structor.setLosses(losses1);
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

			riskProtection.setEconamicValueRA(null);
			riskProtection.setEconamicValueRB(null);
			riskProtection.setEconamicValueRC(null);
			riskProtection.setEconamicValueRM(null);
			riskProtection.setEconamicValueRU(null);
			riskProtection.setEconamicValueRV(null);
			riskProtection.setEconamicValueRW(null);
			riskProtection.setEconamicValueRZ(null);

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
			
			List<CalculatedRisk> cal = new ArrayList<CalculatedRisk>();
			CalculatedRisk calculatedRisk = new CalculatedRisk();

			calculatedRisk.setLossOfHumanLifeRT1("1.00E-05");
			calculatedRisk.setLossOfPublicSerivceRT2("1.00E-03");
			calculatedRisk.setLossOfCulturalHeritageRT3("1.00E-04");
			calculatedRisk.setEconomicLossRT4("1.00E-03");
			//Final calculation after Protection
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

			calculatedRisk.setRiskProtectionRD1(null);
			calculatedRisk.setRiskProtectionRI1(null);
			calculatedRisk.setRiskProtectionR1(null);

			calculatedRisk.setStructureCharacteristics(structor);

			cal.add(calculatedRisk);

			structor.setCalculatedRisk(cal);
			strectureCharecteristicRepository.save(structor);

		}
	}

}