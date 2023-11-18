public class Livro extends Obra {
    private String autor;

    public Livro(String isbn, String nome, String editora, int anoPubli, String autor){
        super(isbn, nome, editora, anoPubli);
        this.autor = autor;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}