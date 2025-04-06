/*
Lendy Naiara Carpio Pacheco - 10428525
Victor Reis da Silva - 10420297
*/
public class Palindromo {
    private String texto;

    public Palindromo() throws Exception {
        this("");
    }

    public Palindromo(String texto) throws Exception {
        this.setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) throws Exception {

        if(texto == null) {
            throw new Exception("Informa alguma coisa pow");
        } else {
            this.texto = texto;
        }
    }

    public boolean verificar() {
        if(this.texto.length() <= 1) return true;

        String aux = this.texto.toLowerCase();
        aux = aux.replaceAll(" ", "");

        for(int i=0; i<aux.length()/2; i++) {
            int pos2 = (aux.length()-1) - i;
            if(aux.charAt(i) != aux.charAt(pos2)) return false;
        }

        return true;
    }

}



