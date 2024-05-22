package ru.practicum.ewm.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewCommentDto {
    @NotBlank
    @Size(min = 2, max = 1500)
    private String text;
}