
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.git.banco.model.Cliente;
import com.git.banco.model.Cartoes;
import com.git.banco.model.Transferencias;
import com.git.banco.model.Investimentos;
import com.git.banco.model.Notificacoes;
import com.git.banco.model.Pagamentos;
import com.git.banco.repository.ClientRepository;

@Service
public class Conta  Service {

    private final Conta Repository contaRepository;

    public ContaService(Conta Repository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public Conta cadastrar(Conta conta) {
        
        return contaRepository.save(conta);
    }

    public List<Conta> listar() {
        return contaRepository.findAll();
    }

    public Conta buscarPorId(Long id) {
        return contaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Conta" + id + " nao encontrado."));
    }

    // ----- regras de validacao -----
   

    private ResponseStatusException erro(String notificacoes) {
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, notificacoes);
    }
}