package alura.foro.api.infra.errores;

public class ValidacionIntegridad extends RuntimeException {

    public ValidacionIntegridad(String s) {
        super(s);
    }
}
