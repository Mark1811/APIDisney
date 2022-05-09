package com.javadabadu.disney.service.impl;

import com.javadabadu.disney.exception.ExceptionBBDD;
import com.javadabadu.disney.models.dto.SerieResponseDTO;
import com.javadabadu.disney.models.entity.Serie;
import com.javadabadu.disney.models.mapped.ModelMapperDTOImp;
import com.javadabadu.disney.repository.SerieRepository;
import com.javadabadu.disney.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class SerieServiceImpl implements SerieService {
    @Autowired
   SerieRepository serieRepository;
    @Autowired
    private MessageSource message;
    @Autowired
    private ModelMapperDTOImp mm;

       @Override
    public List<SerieResponseDTO> findAll() throws ExceptionBBDD {
        List<SerieResponseDTO> serieResponseDTO = new ArrayList<>();
        serieRepository.findAll().stream()
                .filter(audioVisual -> audioVisual instanceof Serie)
                .forEach(audioVisual -> serieResponseDTO.add(mm.serieToResponseDTO((Serie) audioVisual)));
        return serieResponseDTO;
    }



    @Override
    public SerieResponseDTO findById(Integer id) throws ExceptionBBDD {
        return null;
    }

    @Override
    public Boolean existsById(Integer id) {
        return null;
    }

    //TODO implementar metodo
    @Override
    public Integer lastValueId() throws ExceptionBBDD {
        return null;
    }

    @Override
    //TODO restan metodos de guardar y actualizar (agregar tambien in interfaz correspondiente)
    public Serie getEntity(Serie entity, Integer id) throws ExceptionBBDD {
        return null;
    }

    @Override
    public SerieResponseDTO save(Serie entity) {
        return null;
    }

    @Override
    public Link getSelfLink(Integer id, HttpServletRequest request) throws ExceptionBBDD {
        return null;
    }

    @Override
    public Link getCollectionLink(HttpServletRequest request) throws ExceptionBBDD {
        return null;
    }
}
