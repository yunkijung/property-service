package com.loglrs.propertyservice.domain.room.repository;

import com.loglrs.propertyservice.domain.room.entity.Room;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
