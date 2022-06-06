package com.capeelectric.repository1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capeelectric.model.StructureCharacteristics;

@Repository
public interface StrectureCharecteristicRepository extends CrudRepository<StructureCharacteristics, Integer> {

}
