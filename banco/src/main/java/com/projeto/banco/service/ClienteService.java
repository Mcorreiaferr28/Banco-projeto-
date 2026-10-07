mport java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.git.banco.model.Cliente;
import com.git.banco.model.Transferencias;
import com.git.banco.model.Investimentos;
import com.git.banco.model.Notificacoes;
import com.git.banco.model.Pagamentos;
import com.git.banco.repository.ClientRepository;

@Service
public class Cliente  Service {

    private final Cliente Repository clienteRepository;

    public ClienteService(Cliente Repository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrar(Cliente cliente) {
        
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Cliente" + id + " nao encontrado."));
    }

    // ----- regras de validacao -----
   

    private ResponseStatusException erro(String notificacoes) {
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, notificacoes);
    }
}