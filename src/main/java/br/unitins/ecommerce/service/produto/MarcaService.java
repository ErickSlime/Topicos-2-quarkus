package br.unitins.ecommerce.service.produto;

import java.util.List;

import br.unitins.ecommerce.dto.produto.MarcaDTO;
import br.unitins.ecommerce.dto.produto.MarcaResponseDTO;

public interface MarcaService {
    
    // Metodos basicos

    List<MarcaResponseDTO> getAll(int page, int pageSize);
    
    MarcaResponseDTO getById(Long id);

    MarcaResponseDTO insert(MarcaDTO marcaDto);

    MarcaResponseDTO update(Long id, MarcaDTO marcaDto);

    void delete(Long id);

    // Metodos extras

    Long count();

    Long countByNome(String nome);

    List<MarcaResponseDTO> getByNome(String nome, int page, int pageSize);
}
