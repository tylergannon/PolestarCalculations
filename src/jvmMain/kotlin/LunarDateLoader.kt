package com.tyler.fourPillars

import java.time.LocalDate
import java.time.temporal.ChronoUnit

private val aYangRatDay = LocalDate.of(1924, 4, 15)
private val startDate = LocalDate.of(1900, 1, 1)
private val initialDayPillarNum = ChronoUnit.DAYS.between(aYangRatDay, startDate) % 60

private val DATES =
    LunarDate::class.java.getResource("/ephemera.dat").readBytes().toList().chunked(4).mapIndexed { i, it ->
        LunarDate(it[1], it[2], it[3], ((initialDayPillarNum + i) % 60).toByte())
    }.toTypedArray()


fun LunarDate.Companion.forDate(d: LocalDate) = DATES[ChronoUnit.DAYS.between(startDate, d).toInt()]

