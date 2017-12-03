package lab2;

public class ComLineParser {
    
    String []keys;// = new String[];  
    String []delimeters; // = new String[];
    
    // варианты завершения разбора командной строки
    public enum SwichStatus{NoError, Error, ShowUsage};

    public ComLineParser(String[] keys) {
        this(keys,new String[]{"/","-"});
    }

    public ComLineParser(String[] keys, String[] delimeters) {
        setKeys(keys);
        setDelimeters(delimeters);
    }

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(String[] keys) {
        this.keys = keys;
    }

    public String[] getDelimeters() {
        return delimeters;
    }

    public void setDelimeters(String[] delimeters) {
        this.delimeters = delimeters;
    }
    
    
    
    
    //выводит подсказку с форматом командной строки
   public void OnUsage(String errorKey) {
       if( errorKey != null) return;     
   }
         
    //отрабатывает команду для каждого найденного ключа      
   // OnSwitch
            
     //бизнес логику по разбору командной строки
   // Parse       
  
    
}
