import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.git.banco.model.Notificacoes;
import com.git.banco.repository.NotificacoesRepository;

@Service
public class NotificacoesService {

    private final NotificacoesRepository notificacoesRepository;

    public NotificacoesService(NotificacoesRepository notificacoesRepository) {
        this.notificacoesRepository = notificacoesRepository;
    }

    public Notificacoes cadastrar(Notificacoes notificacoes) {
        return notificacoesRepository.save(notificacoes);
    }

    public List<Notificacoes> listar() {
        return notificacoesRepository.findAll();
    }

    public Notificacoes buscarPorId(Long id) {
        return notificacoesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Notificacoes" + id + " nao encontrado."));
    }
}