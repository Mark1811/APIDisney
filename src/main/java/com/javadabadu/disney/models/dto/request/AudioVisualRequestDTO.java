package com.javadabadu.disney.models.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.javadabadu.disney.models.dto.response.GeneroResponseDTO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AudioVisualRequestDTO {
    @JsonProperty(value="genero")
    private GeneroResponseDTO genero;
    private String titulo;
    private String imagen;
}
