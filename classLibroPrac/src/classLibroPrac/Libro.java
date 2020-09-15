package classLibroPrac;


public class Libro {
	private String nombreDElLibro;
	
     Libro(){
		
	}
    Libro(String parametro){
		
	}
	
	public void setlibro(String Bookname) {
		
		this.nombreDElLibro=Bookname;
	}
	public String getlibro() {
		return nombreDElLibro;
	}
	
	
	
	void prestamo() {
		
		System.out.println("Se le a aprovado su prestamon\n\nRecuerde que tiene un plaso de 15 dias para entregar el libro");
	}
	void devolucion() {
		System.out.println("Gracias por devolver el libro");

		
	}
	
	
}
