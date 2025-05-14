public class AmbiguousPersonException extends Exception {
    public AmbiguousPersonException(String firstName, String lastName, int count) {
        super(String.format("Błąd: Znaleziono %d osób o tym samym imieniu i nazwisku: %s %s", 
            count, firstName, lastName));
    }
}