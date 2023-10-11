package alura.foro.api.domain.curso;

public record DtoListadoCurso(String nombre, CategoriaCurso categoria) {
    public DtoListadoCurso(Curso curso) {
        this(curso.getNombre(),curso.getCategoria());
    }
}