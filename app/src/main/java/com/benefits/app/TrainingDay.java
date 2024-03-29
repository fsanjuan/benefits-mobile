package com.benefits.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.codehaus.jackson.annotate.JsonIgnore;

public class TrainingDay extends DomainEntity implements Serializable {

	private Days name;
	private String descriptiveName;
	private Language entityLanguage;

	// Relationships
	private Collection<Training> trainings;
	private Collection<ExerciseGroup> exerciseGroups;

	public TrainingDay() {
		super();
		exerciseGroups = new ArrayList<ExerciseGroup>();
	}

	public Days getName() {
		return name;
	}

	public void setName(Days name) {
		this.name = name;
	}

	public String getDescriptiveName() {
		return descriptiveName;
	}

	public void setDescriptiveName(String descriptiveName) {
		this.descriptiveName = descriptiveName;
	}

	@JsonIgnore
	public Collection<Training> getTrainings() {
		return trainings;
	}

	public void setTrainings(Collection<Training> trainings) {
		this.trainings = trainings;
	}

	public Collection<ExerciseGroup> getExerciseGroups() {
		return exerciseGroups;
	}

	public void setExerciseGroups(Collection<ExerciseGroup> exerciseGroups) {
		this.exerciseGroups = exerciseGroups;
	}

	public Language getEntityLanguage() {
		return entityLanguage;
	}

	public void setEntityLanguage(Language entityLanguage) {
		this.entityLanguage = entityLanguage;
	}

}
