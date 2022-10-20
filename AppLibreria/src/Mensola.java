import java.util.Vector;

public class Mensola {
    private final Vector<Libro> libri;
    private final int capacita;

    public Vector<Libro> getLibri() {
        return libri;
    }

    public int getCapacita() {
        return capacita;
    }

    public Mensola(int capacita) {
        this.capacita = capacita;
        libri = new Vector<>();
        for (int i = 0; i < capacita; i++) {
            libri.add(null);
        }
    }

    public boolean add(Libro l,int pos) {
        if (pos >=capacita || pos < 0 || !isEmpty(pos)) return false;
        libri.set(pos,l);
        return true;
    }

    public Libro remove(int pos) {
        if(pos >=capacita || pos < 0 || isEmpty(pos)) return null;
        var l = libri.get(pos);
        libri.set(pos,null);
        return l;
    }

    private boolean isEmpty(int pos) {
        return libri.get(pos) == null;
    }

    public int nLibri(){
        int i = 0;
        for (var libro: libri) {
            if (libro != null){
                i++;
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "Mensola{" +
                "libri=" + libri +
                '}';
    }

    /*public void sort() {
        var new_libri = new Vector<Libro>();
        for (var libro: libri) {
            if(libro!=null){
                new_libri.add(libro);
            }
        }
        var j = 0;
        for (var libro: new_libri) {
            for (var i = j ; i < new_libri.size(); i++){
                if (libro.getnPagine() > new_libri.get(i).getnPagine()){
                    Libro a = libro;
                    System.out.println(new_libri);
                    new_libri.setElementAt(new_libri.get(i),new_libri.indexOf(libro));
                    //libro = new_libri.get(i);
                    System.out.println(new_libri);
                    new_libri.setElementAt(a,j);
                    System.out.println(new_libri);
                }
            }
            j++;
        }
        if (nLibri() < capacita){
            for (int i = 0; i < capacita-nLibri(); i++) {
                new_libri.add(null);
            }
        }

        for (var i = 0; i < capacita; i++) {
            remove(i);
        }
        var i = 0;
        for (var libro: new_libri) {
            add(libro,i);
            i++;
        }
    }*/
}