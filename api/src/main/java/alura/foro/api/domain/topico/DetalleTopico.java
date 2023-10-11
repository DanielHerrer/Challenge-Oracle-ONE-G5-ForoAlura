package alura.foro.api.domain.topico;

import alura.foro.api.domain.curso.DtoRetornoCurso;
import alura.foro.api.domain.usuario.Usuario;

public record DetalleTopico (String titulo, String mensaje, EstatusTopico estatus, Usuario autor, DtoRetornoCurso curso) {
        public DetalleTopico (Topico topico) {
                this(topico.getTitulo(), topico.getMensaje(), topico.getEstatus(), topico.getAutor(),
                        new DtoRetornoCurso(topico.getCurso().getId(), topico.getCurso().getNombre(),
                                topico.getCurso().getCategoria()));
        }

}
