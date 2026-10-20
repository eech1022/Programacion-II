package juego1;
public class juego {
    protected 
            int numeroDevidas;
            int record;            
    public
        juego(int numeroDevidas) {
            this.numeroDevidas = numeroDevidas;
            record=-1;  
        }
        void reiniciaPartida(int n){  
            setNumeroDevidas(n);
        }
        void actualizarRecord(int a){
            if(a>getRecord()){
                setRecord(a);
                System.out.println("nuevo record !");
                mostrar();
            }else{
                System.out.println("no es un nuevo record");
            }   
        }
        boolean quitaVida(){
            boolean ax=true;
            if(getNumeroDevidas()==1){
                ax=false;                
            }
            if(ax){
                setNumeroDevidas(numeroDevidas-1);
            }
            return ax;
        }
        void mostrar(){
            System.out.println("--juego--");
            System.out.println("numero de vidas: "+numeroDevidas);
            System.out.println("record: "+record);
        }     
    public int getNumeroDevidas() {
        return numeroDevidas;
    }
    public void setNumeroDevidas(int numeroDevidas) {
        this.numeroDevidas = numeroDevidas;
    }
    public int getRecord() {
        return record;
    }
    public void setRecord(int record) {
        this.record = record;
    }   
}
