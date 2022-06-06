package com.capeelectric.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capeelectric.model.Losses;
import com.capeelectric.model.StructureAttributes;
import com.capeelectric.model.StructureCharacteristics;
import com.capeelectric.model1.RiskAssessmentDetails;
import com.capeelectric.repository.RiskAssessmentRepository;
import com.capeelectric.repository1.StrectureCharecteristicRepository;
import com.capeelectric.service.DataExportService;

@Service
public class DataExportServiceImpl implements DataExportService {

	@Autowired
	private RiskAssessmentRepository riskAssessmentRepository;

	@Autowired
	StrectureCharecteristicRepository strectureCharecteristicRepository;

	@Override
	public void retrieveAllData() {
// TODO Auto-generated method stub

	}

	@Override
	public void fetchdata() {
		List<RiskAssessmentDetails> data = (List<RiskAssessmentDetails>) riskAssessmentRepository.findAll();

		// single iteration
		RiskAssessmentDetails riskAssessmentDetails = data.get(0);
		riskIter(riskAssessmentDetails);

		// add all iteration
//		for(RiskAssessmentDetails riskAssessmentDetails:data) {
//		riskIter(riskAssessmentDetails);
//	
//		}
	}

	private void riskIter(RiskAssessmentDetails riskAssessmentDetails) {
		if (riskAssessmentDetails != null) {
			StructureCharacteristics structor = new StructureCharacteristics();
			structor.setRiskId(riskAssessmentDetails.getRiskId());
			structor.setLocation(riskAssessmentDetails.getLocation());
			structor.setOtherLocation(riskAssessmentDetails.getoLocation());
			structor.setGroundFlashDensity(riskAssessmentDetails.getGroundFlashDensity());
			structor.setTypeOfBuilding(riskAssessmentDetails.getTypeOfBuilding());
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

			structor.setHeightNearByStructure(riskAssessmentDetails.getHeightOfNearByStructure());

			structor.setTelephoneServiceLine(riskAssessmentDetails.getTelephoneNo());

			structor.setEnvironment(riskAssessmentDetails.getEnvironment());

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

			structor.getCreatedBy();
			structor.getCreatedDate();
			structor.getUpdatedDate();
			structor.getUpdatedDate();
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
			structureAttributes.setTypeOfPowerLines(riskAssessmentDetails.getTypeOfPowerLines());
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
			losses.setHumanLossOffailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystem());

			losses.setHumanLossOfInjuryOfElectricShock(
					riskAssessmentDetails.getLossDueToInjuryToLivingBeingsByElectricShock());

			losses.setHumanLossOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL1());
			losses.setHumanLossOffailureOfInternalSystemL1(
					riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL1());

			losses.setSerToPubPhysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamageL2());
			losses.setSerToPubfailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL2());

			losses.setSerToPubPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL21());

			losses.setSerToPubfailureOfInternalSystemL1(riskAssessmentDetails.getLossDueToFailureOfInternalSystems());

			losses.setCulHerOfPhysicalDamage(riskAssessmentDetails.getLossDueToPhysicalDamageL3());
			losses.setCulHerOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL31());
			losses.setEcoLossOfPhysicalDamage(riskAssessmentDetails.getLossDuetoPhysicalDamageL4());
			losses.setEcoLossOfFailureOfInternalSystem(riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL4());

			losses.setEcoLossOfInjuryOfElectricShock(
					riskAssessmentDetails.getLossDueToInjuryToLivingBeingsByElectricShockL4());

			losses.setEcoLossOfPhysicalDamageL1(riskAssessmentDetails.getLossDueToPhysicalDamageL41());

			losses.setEcoLossOfFailureOfInternalSystemL1(
					riskAssessmentDetails.getLossDueToFailureOfInternalSystemsL41());

			losses.setClassOfLPS(riskAssessmentDetails.getClassfLPS());

			losses.setClassOfSPD(riskAssessmentDetails.getClassOfSPD());
			losses1.add(losses);

			structor.setLosses(losses1);
			strectureCharecteristicRepository.save(structor);

		}
	}

}