package biblio;

class Lecteur {
    
    private String id;
    
    public Lecteur(){
    }
    
     public Lecteur(String id){
        this.id=id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Lecteur) {                
          return ((Lecteur)obj).id.equals(this.id); 
        }                                         
        return false;                              
    } 
       
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
                                    
}
