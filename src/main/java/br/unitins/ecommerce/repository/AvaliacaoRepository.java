package br.unitins.ecommerce.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import br.unitins.ecommerce.model.produto.avaliacao.Avaliacao;
import br.unitins.ecommerce.model.produto.produto.Produto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class AvaliacaoRepository implements PanacheRepository<Avaliacao> {
    
    public List<Avaliacao> findByYear(Integer year) {

        if (year == null)
            return null;

        return find("FROM Avaliacao WHERE YEAR(data) = ?1", year).list();
    }

    public List<Avaliacao> findByProduto(Produto produto) {

        if (produto == null)
            return null;

        return find("FROM Avaliacao WHERE produto = ?1", produto).list();
    }
}
