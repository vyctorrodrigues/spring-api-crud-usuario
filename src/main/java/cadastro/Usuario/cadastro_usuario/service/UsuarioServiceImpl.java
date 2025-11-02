package cadastro.Usuario.cadastro_usuario.service;

import cadastro.Usuario.cadastro_usuario.Usuario;
import cadastro.Usuario.cadastro_usuario.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepositorio usuarioRepositorio;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario criar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepositorio.findById(id);
    }

    @Override
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        usuarioAtualizado.setId(id);
        return usuarioRepositorio.save(usuarioAtualizado);
    }

    @Override
    public void deletar(Long id) {
        usuarioRepositorio.deleteById(id);
    }
}
