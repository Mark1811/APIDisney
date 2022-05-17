package com.javadabadu.disney.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;

@Getter
@Setter
public class SerieResponseDTO {
    private Integer id;
    private String titulo;
    private String imagen;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Calendar fechaCreacion;
    @JsonProperty(value = "genero")
    private String generoNombre;
    private Byte temporadas;
    private Byte capitulos;
    private boolean estado =true;
}
