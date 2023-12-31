package br.unitins.ecommerce.dto.estado;

import br.unitins.ecommerce.model.endereco.Estado;

public record EstadoResponseDTO(Long id, String nome, String sigla) {

    public EstadoResponseDTO(Estado estado) {

        this(estado.getId(), estado.getNome(), estado.getSigla());
    }

    public static EstadoResponseDTO valueOf(Estado estado) {
        return new EstadoResponseDTO(
            estado.getId(), 
            estado.getNome(),
            estado.getSigla()
        );}

}
