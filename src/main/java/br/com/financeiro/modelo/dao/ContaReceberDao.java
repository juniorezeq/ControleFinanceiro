package br.com.financeiro.modelo.dao;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import br.com.financeiro.modelo.negocio.ContaReceber;

@Named
@RequestScoped
public class ContaReceberDao implements Serializable {

	private static final long serialVersionUID = 1L;

	private DAO<ContaReceber> dao;

	@PostConstruct
	void init() {
		this.dao = new DAO<ContaReceber>(this.em, ContaReceber.class);
	}

	@Inject
	private EntityManager em;

	public boolean existeConta(ContaReceber conta) {

		TypedQuery<ContaReceber> query = em.createQuery(" select u from ContaReceber u " + " where u.descricao = :pDescricao",
				ContaReceber.class);

		query.setParameter("pDescricao", conta.getDescricao());
		try {
			@SuppressWarnings("unused")
			ContaReceber resultado = query.getSingleResult();
			return true;
		} catch (NoResultException ex) {
			return false;
		}
	}
	
		
	public List<ContaReceber> listarTodos() {
		CriteriaQuery<ContaReceber> query = em.getCriteriaBuilder().createQuery(ContaReceber.class);
		query.select(query.from(ContaReceber.class));

		List<ContaReceber> lista = em.createQuery(query).getResultList();

		return lista;
	}

	public void adiciona(ContaReceber conta) {
		dao.adiciona(conta);
	}

	public void atualiza(ContaReceber conta) {
		em.merge(conta);
	}

	public void remove(ContaReceber conta) {
		dao.remove(conta);
	}

	public ContaReceber buscaPorId(Long id) {
		return dao.buscaPorId(id);
	}

	public List<ContaReceber> listaTodosPaginada(int firstResult, int maxResults) {
		return dao.listaTodosPaginada(firstResult, maxResults);
	}

}
