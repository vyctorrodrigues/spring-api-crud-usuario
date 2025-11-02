package cadastro.Usuario.cadastro_usuario.service;

import cadastro.Usuario.cadastro_usuario.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario criar(Usuario usuario);

    List<Usuario> listarTodos();

    Optional<Usuario> buscarPorId(Long id);

    Usuario atualizar(Long id, Usuario usuarioAtualizado);

    void deletar(Long id);
}
