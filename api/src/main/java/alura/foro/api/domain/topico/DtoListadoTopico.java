package alura.foro.api.domain.topico;

import alura.foro.api.domain.curso.DtoRetornoCurso;
import alura.foro.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DtoListadoTopico (String titulo, String mensaje, LocalDateTime fecha_creacion, EstatusTopico estatus, Usuario autor, DtoRetornoCurso curso) {

    public DtoListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getEstatus(), topico.getAutor(),
                new DtoRetornoCurso(topico.getCurso().getId(),
                        topico.getCurso().getNombre(), topico.getCurso().getCategoria()));
    }

}
