class Language{

    public void Java(){
      System.out.print("JV ");
    }
    public void Pyhton(){
        System.out.print("PY ");
      }
    public void function(){
        Java();
        Pyhton();
    }
    public Language(){
        System.out.print("Language");
 
    }


    public static void main(String[] args){

        Language obj =new Language();
        obj.function();
    
    
        }


}

