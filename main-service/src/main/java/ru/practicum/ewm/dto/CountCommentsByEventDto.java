package ru.practicum.ewm.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountCommentsByEventDto {
    private Long eventId;
    private Long countComments;
}