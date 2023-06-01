package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository(private val busScheduleDao: BusScheduleDao) : BusScheduleRepository {
    override fun getAllBusSchedule(): Flow<List<BusSchedule>> = busScheduleDao.getAllBusSchedule()

    override fun getBusScheduleStream(id: Int): Flow<BusSchedule> = busScheduleDao.getBusSchedule(id)

    override suspend fun insertBusSchedule(busSchedule: BusSchedule) = busScheduleDao.insert(busSchedule)

    override suspend fun deleteBusSchedule(busSchedule: BusSchedule) = busScheduleDao.delete(busSchedule)

    override suspend fun updateBusSchedule(busSchedule: BusSchedule) = busScheduleDao.update(busSchedule)

}