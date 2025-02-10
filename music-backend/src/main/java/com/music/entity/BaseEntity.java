package com.music.entity;

import java.time.LocalDateTime;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

	private long id;
	private boolean isDeleted = false;
	private LocalDateTime createdDate = LocalDateTime.now();
	private LocalDateTime updatedDate;
	
}
