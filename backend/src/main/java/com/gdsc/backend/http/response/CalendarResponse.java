package com.gdsc.backend.http.response;

import com.gdsc.backend.entity.enums.EmotionType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class CalendarResponse {
    LocalDate date;
    EmotionType emotion;
}
