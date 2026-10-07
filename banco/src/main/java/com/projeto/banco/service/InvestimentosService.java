import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.git.banco.model.Investimentos;
import com.git.banco.repository.InvestimentosRepository;

@Service
public class InvestimentosService {

    private final InvestimentosRepository investimentosRepository;

    public InvestimentosService(InvestimentosRepository investimentosRepository) {
        this.investimentosRepository = investimentosRepository;
    }

    public Investimentos cadastrar(Investimentos investimentos) {
        
        return investimentosRepository.save(investimentos);
    }

    public List<Investimentos> listar() {
        return investimentosRepository.findAll();
    }

    public Investimentos buscarPorId(Long id) {
        return investimentosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Investimentos" + id + " nao encontrado."));
    }

   
}