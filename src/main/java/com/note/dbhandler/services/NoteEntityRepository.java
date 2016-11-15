package com.note.dbhandler.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.note.dbhandler.entities.NoteEntity;

public interface NoteEntityRepository extends JpaSpecificationExecutor<NoteEntity> {
	
	public List<NoteEntity> getEntities();
	
	
}
